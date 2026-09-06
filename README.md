# WLang Compiler

A compiler for **WLang**, a small JVM language. It reads a `.w` source file and emits a runnable `.class` file (Java 8 bytecode, class file version 52).

- Grammar: ANTLR 4
- Bytecode emission: ASM
- Build: Maven (multi-module)
- Entry point: `com.woody.compiler.Compiler`

## Build & Run

```bash
mvn clean package                       # builds antlr + compiler modules
java -jar compiler/target/compiler-1.0-SNAPSHOT-jar-with-dependencies.jar HelloWorld.w
java HelloWorld                         # .class is written to the current directory
```

The input file must exist and end with `.w`; exactly one file per invocation. The output class is named after the class declared inside the file, written to the process working directory.

## Language

### Class

A source file contains exactly one class. Fields come first, then functions.

```
HelloWorld {
    int field

    start {
        print "hello world!"
    }
}
```

### Entry point

A parameterless `start` function makes the class executable: the compiler synthesizes a `public static void main(String[])` that instantiates the class and calls `start()`. Without `start`, no `main` is generated.

### Types

Built-in: `boolean`, `int`, `char`, `byte`, `short`, `long`, `float`, `double`, `string`, `void`, plus the array form of each (`int[]`, …). Any class on the classpath can be used by qualified name (`java.util.Random`, `List`).

Local variables use `var` with inferred type; fields and parameters are explicitly typed.

### Functions

```
int sum(int x, int y) {
    return x + y
}
```

- Return type is optional — omitted means `void`.
- Parentheses around an empty parameter list are optional (`start {` and `start() {` are equivalent).
- A `return` is appended automatically if the body doesn't end with one.

**Default parameter values:**

```
greet(string name, string favouriteLanguage = "java") { ... }
greet("andrew")                 // favouriteLanguage defaults to "java"
```

**Named arguments** (any order, `->`):

```
createRect(x1 -> 25, y1 -> 50, x2 -> -25, y2 -> -50)
```

Arguments in a call are either all positional or all named.

### Constructors

A function whose name equals the class name is a constructor. If none is declared, a parameterless default constructor is generated. `super(...)` is emitted automatically at the start of every constructor.

```
Card(string cardColor, string cardPattern) {
    color = cardColor
    pattern = cardPattern
}
```

### Statements

| Form | Example |
|---|---|
| Variable declaration | `var x = 5` |
| Assignment | `field = 5` |
| Print | `print "x=" + x` |
| Ranged for | `for i from 1 to 10 { ... }` |
| If / else | `if (a == b) { ... } else { ... }` |
| Return | `return x + y` / `return` |
| Block | `{ ... }` |

The ranged `for` counts up or down automatically depending on whether the start is below or above the end. No statement terminators — newlines separate statements.

### Expressions

Arithmetic `+ - * /`, comparisons `> < == != >= <=`, literals (number, `true`/`false`, string), variable and field references, function calls, method calls on an owner (`a.toString()`), and `new Type(args)`.

`+` on a string operand concatenates. `==` and friends work on primitives and on objects — object comparison uses value semantics (`compareTo`/`equals`), not reference identity, so two distinct `java.lang.Integer(3)` instances compare equal.

### Java interop

Classes and methods on the classpath are resolved by reflection, so Java APIs and previously compiled WLang classes can be called directly:

```
print "cos".toUpperCase()
var random = new java.util.Random()
var myLibrary = new Library()
```

## Architecture

```
.w source
   │  ANTLR lexer + parser (Wlang.g4)
   ▼
parse tree
   │  com.woody.parsing.visitor.*   (visitor pass, type resolution, scope building)
   ▼
AST (com.woody.domain.node.*) + Scope
   │  com.woody.bytecodegeneration.*  (ASM ClassWriter)
   ▼
byte[] → ClassName.class
```

### Modules

- **`antlr/`** — holds `Wlang.g4`; the `antlr4-maven-plugin` generates the visitor-based parser (`visitor=true`, `listener=false`).
- **`compiler/`** — everything else. The generated ANTLR sources are checked in under `com/woody/antlr/`.

### Packages (`compiler/src/main/java/com/woody/`)

| Package | Role |
|---|---|
| `compiler` | `Compiler` — CLI entry point, argument validation, writes the `.class` file |
| `parsing` | `Parser` drives ANTLR; `WlangTreeWalkErrorListener` reports syntax errors |
| `parsing.visitor` | Parse tree → AST. `CompilationUnitVisitor` → `ClassVisitor` → `FunctionVisitor` / `FieldVisitor`, plus `statement/` and `expression/` sub-visitors |
| `domain` | AST model: `CompilationUnit`, `ClassDeclaration`, `Function`, `Constructor` |
| `domain.node` | Statement and expression nodes (`IfStatement`, `RangedForStatement`, `FunctionCall`, `Addition`, …) |
| `domain.scope` | `Scope` (locals, fields, signatures), `ClassPathScope` (reflection-based lookup of classpath methods/constructors) |
| `domain.type` | `Type`, `BultInType`, `ClassType`, `TypeSpecificOpcodes` (per-type load/store/return opcodes) |
| `bytecodegeneration` | `BytecodeGenerator` → `ClassGenerator` → `FieldGenerator` / `MethodGenerator`, with `statement/` and `expression/` generators mirroring the AST |
| `util` | `DescriptorFactory` (JVM descriptors), `TypeResolver`, `TypeChecker`, `PrimitiveTypesWrapperFactory`, `ReflectionObjectToSignatureMapper` |
| `exception` | Compilation errors, all extending `CompilationException` |
| `validation` | `ARGUMENT_ERRORS` — CLI argument validation messages |

### Compile-time errors

Raised as subclasses of `CompilationException`, e.g. `CalledFunctionDoesNotExistException`, `BadArgumentsToFunctionCallException`, `LocalVariableNotFoundException`, `FieldNotFoundException`, `ComparisonBetweenDiferentTypesException`, `MixedComparisonNotAllowedException`, `UnsupportedRangedLoopTypes`, `MethodWithNameAlreadyDefinedException`, `FunctionNameEqualClassException`, `ClassNotFoundForNameException`.

## Examples

`WlangExamples/` contains runnable programs:

| File | Shows |
|---|---|
| `HelloWorld.w` | minimal program |
| `SumCalculator.w` | functions, `if`/`else`, `return` |
| `Fields.w` | class fields |
| `Loops.w`, `Loop.w` | ranged loops, ascending and descending |
| `AllPrimitiveTypes.w` | primitive types and string concatenation |
| `DefaultParamTest.w` | default parameter values |
| `NamedParamsTest.w` | named arguments |
| `EqualitySyntax.w` | primitive vs. object comparison |
| `Constructor/` | default, parameterless, and parameterized constructors |
| `ClassPathCalls/` | calling Java APIs and another WLang class (compile `Library.w` first) |
| `RealApp/` | `Card` + `CardDrawer`, a card-dealing app using `java.util.List` and `java.util.Random` |

## Known limitations

- One class per file; no packages, inheritance, or interfaces.
- Arrays are typed but have no literal or indexing syntax.
- No `while`; only ranged `for`.
- Compiles a single file per invocation — cross-class dependencies must already be on the classpath as `.class` files.
- `ARGUMENT_ERRORS.BAD_FILE_EXTENSION` says `.enk` while the compiler actually requires `.w`.
