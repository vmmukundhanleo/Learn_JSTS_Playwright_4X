# Learn JavaScript, TypeScript & Playwright (4x)

![JavaScript](https://img.shields.io/badge/JavaScript-ES6%2B-yellow)
![Node.js](https://img.shields.io/badge/Node.js-18%2B-green)
![Prompt Engineering](https://img.shields.io/badge/Prompt_Eng-RICE--POT-purple)

A chapter-by-chapter learning repo for testers moving into JavaScript, TypeScript, and Playwright automation. Every chapter is a folder, every lesson is a small file you can run on its own.

---

## Table of Contents

- [Roadmap](#roadmap)
- [Chapter Summary](#chapter-summary)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Chapter 00: Prompt Engineering](#chapter-00-prompt-engineering)
  - [00: RICE-POT Prompt Engineering](#00-rice-pot-prompt-engineering)
- [Chapter 01: JavaScript Basics](#chapter-01-javascript-basics)
  - [01: Hello World](#01-hello-world)
  - [02: Math with Numbers](#02-math-with-numbers)
  - [03: DOM Basics](#03-dom-basics)
- [Chapter 02: Keywords and Identifiers](#chapter-02-keywords-and-identifiers)
  - [03: The JavaScript Engine](#03-the-javascript-engine)
  - [05: Keywords vs Identifiers: var, let, const](#05-keywords-vs-identifiers-var-let-const)
  - [06: Identifier Rules](#06-identifier-rules)
  - [07: Naming Conventions](#07-naming-conventions)
  - [08: Comments](#08-comments)
  - [09: Interview Questions on Identifiers](#09-interview-questions-on-identifiers)
- [Chapter 03: JavaScript Literals & Data Types](#chapter-03-javascript-literals--data-types)
  - [10 & 14: Literals Concept](#10--14-literals-concept)
  - [11: Primitive Literals & typeof Operator](#11-primitive-literals--typeof-operator)
  - [12, 13, 18: null vs undefined](#12-13-18-null-vs-undefined)
  - [15: Number Literals & Bases](#15-number-literals--bases)
  - [16: Numeric Separators & BigInt](#16-numeric-separators--bigint)
  - [17: Special Numbers: Infinity and NaN](#17-special-numbers-infinity-and-nan)
- [Chapter 04: Operators & Type Coercion](#chapter-04-operators--type-coercion)
  - [19: JS Architecture & Data Types](#19-js-architecture--data-types)
  - [20: Assignment Operators & Dynamic Typing](#20-assignment-operators--dynamic-typing)
  - [21: Arithmetic & Modulus Operators](#21-arithmetic--modulus-operators)
  - [22: Comparison Operators: Loose vs Strict](#22-comparison-operators-loose-vs-strict)
  - [23: Logical Operators](#23-logical-operators)
  - [24: Confusing Comparisons & Type Coercion Traps](#24-confusing-comparisons--type-coercion-traps)
- [Coming Up](#coming-up)

---

## Roadmap

```mermaid
flowchart LR
    C0["00 Prompt Engineering<br/>RICE-POT"]:::done --> C1["01 JS Basics<br/>Hello World, Math"]:::done
    C1 --> C2["02 Keywords and Identifiers<br/>var/let/const, naming, comments"]:::done
    C2 --> C3["03 Literals & Data Types<br/>primitives, null vs undefined, BigInt"]:::done
    C3 --> C4["04 Operators & Comparisons<br/>arithmetic, logical, == vs ==="]:::done
    C4 --> TS["TypeScript"]:::planned
    TS --> PW["Playwright"]:::planned

    classDef done fill:#d1fae5,stroke:#059669,color:#064e3b
    classDef progress fill:#fef3c7,stroke:#d97706,color:#78350f
    classDef planned fill:#f3f4f6,stroke:#9ca3af,color:#374151,stroke-dasharray: 4 3
```

---

## Chapter Summary

| # | Chapter | Folder / Files | Status | What you learn |
|:--|:--------|:---------------|:------:|:---------------|
| 00 | Prompt Engineering | [00_Chapter_Prompt_engineering](00_Chapter_Prompt_engineering/) | ✅ Done | RICE-POT prompts, anti-hallucination rules, the Selenium framework a prompt generated |
| 01 | JavaScript Basics | [01_Chapter_JS_Basics](01_Chapter_JS_Basics/) | ✅ Done | Running a file with Node, `console.log`, arithmetic, DOM basics |
| 02 | Keywords and Identifiers | [02_Chapter_JS_Keywords_Identifiers](02_Chapter_JS_Keywords_Identifiers/) | ✅ Done | How V8 runs code, `var`/`let`/`const`, identifier rules, naming conventions, comments |
| 03 | Literals & Data Types | [03_Chapter_JS_Literals](03_Chapter_JS_Literals/) | ✅ Done | Primitive literals, `typeof`, `null` vs `undefined`, number systems (hex, octal, binary), BigInt, `Infinity`, `NaN` |
| 04 | Operators & Comparisons | [04_JS_Operators](04_JS_Operators/) | ✅ Done | Assignment, arithmetic, remainder `%`, relational, loose `==` vs strict `===`, logical gates, and coercion traps |

---

## Project Structure

```text
Learn_JSTS_Playwright_4X/
├── .gitignore
├── README.md
├── 00_Chapter_Prompt_engineering/
│   ├── 00_RICE_POT_FullForm.md             # What each RICE-POT letter means
│   ├── 01_RICE_POT_Prompt.md               # Worked prompt: Salesforce login (Selenium + TestNG)
│   ├── 02_Problem_Statement.md             # The objective the prompt solves
│   ├── 03_Anti_Hallucinations.md           # Version anchors, negative constraints, self-checks
│   ├── 04_RICE_POT_Generic_QA_Template.md  # Reusable template: test plans, cases, automation
│   └── Selenium_Framework/                 # The framework the prompt produced (Java 17, TestNG)
├── 01_Chapter_JS_Basics/
│   ├── 01_Hellowworld.js                   # First program: console.log
│   ├── 02_Math.js                          # Arithmetic expressions
│   └── 03_DOM_Basics.md                    # DOM concepts and Playwright connection
├── 02_Chapter_JS_Keywords_Identifiers/
│   ├── 01_Keywords_and_Identifiers.md      # Keywords, identifiers and naming rules
│   ├── 02_js_engine.js                     # How V8 runs a file, hot code and JIT
│   ├── 03_letengine.js                     # Smallest program: one let declaration
│   ├── 04_KW_IND.js                        # Keyword vs identifier: var, let, const
│   ├── 05_KW_IND_Rules.js                  # Identifier rules: what a name may contain
│   ├── 06_IND_Rules2.js                    # Naming conventions
│   ├── 07_Comments.js                      # Single-line, multi-line and JSDoc comments
│   └── 08_IQ.js                            # Interview drill: valid vs invalid identifiers
├── 03_Chapter_JS_Literals/
│   ├── 10_Literal.js                       # Basic literal concept
│   ├── 11_Numberal.js                      # Primitive literals & typeof operator
│   ├── 12_Null_undefined.js                # Deep dive: null vs undefined differences
│   ├── 13_Null.js                          # Null quirks and typeof null
│   ├── 14_Literals.js                      # Hex, octal, scientific notation literals
│   ├── 15_Number.js                        # Decimal, binary, octal, hex, and float formats
│   ├── 16_Numbers_PART2.js                 # Numeric separators (1_000_000) & BigInt (n)
│   ├── 17_special.js                       # Special numeric values: Infinity and NaN
│   └── 18_undefined.js                     # Unassigned variable demonstration
├── 04_JS_Operators/
│   ├── 19_Arch.js                          # JS architecture & data types breakdown
│   ├── 20_Assigment_Op.js                  # Assignment operator and dynamic type reassignment
│   ├── 21_Arithematic_Op.js                # Arithmetic operators (+, -, *, /, %)
│   ├── 22_Comparsion_Op.js                 # Comparison operators (==, ===, >, <, >=, <=)
│   ├── 23_Logical_Op.js                    # Logical operators (&&, ||, !)
│   └── 24_Confusing_Comparsion.js          # Type coercion edge cases and equality pitfalls
```

---

## Getting Started

You only need [Node.js](https://nodejs.org/) 18 or newer. No `npm install` yet.

```bash
git clone https://github.com/vmmukundhanleo/Learn_JSTS_Playwright_4X.git
cd Learn_JSTS_Playwright_4X
node --version                              # v18+ (tested on v22)
node 01_Chapter_JS_Basics/01_Hellowworld.js  # Hello, World!
```

Every lesson file runs the same way: `node <chapter folder>/<file>.js`.

---

## Chapter 00: Prompt Engineering

### 00: RICE-POT Prompt Engineering

**Concept:** RICE-POT is a seven-part prompt template (**R**ole, **I**nstructions, **C**ontext, **E**xample, **P**arameters, **O**utput, **T**one) for getting production-quality test artifacts out of an LLM instead of toy snippets.

**Why:** A one-line prompt like "write Selenium code" gets you outdated APIs and invented methods; RICE-POT plus explicit anti-hallucination rules pins the model to real versions, real patterns, and a fixed output shape.

**Q&A: why use this?**
- **Q: When do I reach for it?** A: Any time you ask an AI for a framework, test plan, or test cases. The [generic QA template](00_Chapter_Prompt_engineering/04_RICE_POT_Generic_QA_Template.md) covers all four task types.
- **Q: What does it replace?** A: Ad-hoc, one-line prompts that leave the model to guess your stack, your versions, and what "done" looks like.
- **Q: What's the gotcha?** A: A well-structured prompt can still produce invented APIs. Pin library versions and add "do NOT" rules ([03_Anti_Hallucinations.md](00_Chapter_Prompt_engineering/03_Anti_Hallucinations.md)), then review the code before trusting it.

```mermaid
flowchart LR
    R[Role] --> I[Instructions] --> C[Context] --> E[Example]
    E --> P[Parameters] --> O[Output] --> T[Tone]
    T --> LLM((LLM))
    LLM --> D[Draft code]
    D --> V{Versions pinned?<br/>No invented APIs?}
    V -->|No| FIX[Tighten constraints] --> LLM
    V -->|Yes| F[Selenium_Framework/]
```

The anti-hallucination block from [03_Anti_Hallucinations.md](00_Chapter_Prompt_engineering/03_Anti_Hallucinations.md), ready to paste under any RICE-POT prompt:

```markdown
Role: Senior SDET Automation Architect.
Task: Generate a test automation script for [Application/Workflow].

Constraints & Anti-Hallucination Rules:
1. Version Anchors: Java 17+, Selenium 4.x, TestNG 7.x.
2. Deprecation Checks:
   - Use `java.time.Duration` for timeouts.
   - Use `ChromeOptions` / `FirefoxOptions` (no `DesiredCapabilities`).
   - Use `WebDriverWait(driver, Duration.ofSeconds(x))` (no two-argument timeout with integer and TimeUnit).
3. Grounding: Rely strictly on standard Selenium 4 API calls. Do not invent custom methods on WebDriver or WebElement.
4. Completeness: Ensure all import statements are fully qualified and valid.
```

The full result of this prompt lives in [Selenium_Framework/](00_Chapter_Prompt_engineering/Selenium_Framework/README.md).

---

## Chapter 01: JavaScript Basics

### 01: Hello World

**Concept:** `console.log()` prints a value to the output. Run a `.js` file with `node <file>` and whatever you log appears in your terminal.

**Why:** Before variables, functions, or Playwright, you need one reliable way to see what your code is doing, and `console.log` is that tool.

**Q&A: why use this?**
- **Q: When do I reach for it?** A: Whenever you want to see a value while learning or debugging. In Playwright tests it is the first debugging tool you will use, long before the trace viewer.
- **Q: What does it replace?** A: Java's `System.out.println` or Python's `print`. Same idea, but JavaScript needs no class and no `main` method: one line is a whole program.
- **Q: What's the gotcha?** A: Where the output lands depends on where the code runs. With `node` it prints to your terminal; inside the browser (for example in Playwright's `page.evaluate`) it prints to the browser's DevTools console instead.

```mermaid
sequenceDiagram
    participant You
    participant Terminal
    participant Node as Node.js (V8)
    You->>Terminal: node 01_Hellowworld.js
    Terminal->>Node: load and run the file
    Node->>Node: console.log("Hello World!")
    Node-->>Terminal: Hello World!
```

```js
// 01_Chapter_JS_Basics/01_Hellowworld.js
console.log("Hello, World!");
```

```bash
$ node 01_Chapter_JS_Basics/01_Hellowworld.js
Hello, World!
```

### 02: Math with Numbers

**Concept:** JavaScript evaluates an expression like `1+2` first and then hands the result to `console.log`, so you see `3`, not the text `1+2`.

**Why:** Tests constantly compute expected values (cart totals, row counts, page numbers), so you need to know how JavaScript does arithmetic before you assert on it.

**Q&A: why use this?**
- **Q: When do I reach for it?** A: Calculating an expected value inside a test, for example `expect(total).toBe(price * qty)` instead of hard-coding the answer.
- **Q: What does it replace?** A: Working numbers out by hand or in a calculator and pasting them into test data, which breaks as soon as the inputs change.
- **Q: What's the gotcha?** A: `+` is overloaded. If either side is a string it concatenates: `"1" + 2` gives `"12"`. Also, every JavaScript number is a 64-bit float, so `0.1 + 0.2` prints `0.30000000000000004`.

```mermaid
flowchart LR
    A["console.log(1 + 2)"] --> Q{Is either operand<br/>a string?}
    Q -->|No| N["Numeric add: 3"]
    Q -->|Yes| S["Concatenate: '1' + 2 = '12'"]
    N --> L[console.log prints the result]
    S --> L
```

```js
// 01_Chapter_JS_Basics/02_Math.js
console.log(3+3);
console.log(3-3);
console.log(3*3);
console.log(3/3);
console.log(3%3);
console.log(3**3);
```

```bash
$ node 01_Chapter_JS_Basics/02_Math.js
6
0
9
1
0
27
```

| Operator | Meaning | Example | Result |
|:--------:|:--------|:--------|:------:|
| `+` | Add (or concatenate strings) | `1 + 2` | `3` |
| `-` | Subtract | `5 - 2` | `3` |
| `*` | Multiply | `2 * 2` | `4` |
| `/` | Divide (always a float) | `7 / 2` | `3.5` |
| `%` | Remainder | `7 % 2` | `1` |
| `**` | Power | `2 ** 3` | `8` |

### 03: DOM Basics

**Concept:** The Document Object Model (DOM) is the browser's live, in-memory tree representation of an HTML page. JavaScript can find elements, read or change their content, and respond to events.

**Why:** Playwright locators find elements in the DOM, so understanding the DOM helps explain how browser automation interacts with a page.

Read the [DOM basics notes](01_Chapter_JS_Basics/03_DOM_Basics.md) for the tree model, common DOM operations, event propagation, and the connection to Playwright.

---

## Chapter 02: Keywords and Identifiers

### 03: The JavaScript Engine

**Concept:** `node` hands your file to V8, Google's JavaScript engine. V8 parses the whole file, turns it into bytecode, runs that in an interpreter (Ignition), and recompiles "hot" code, code that runs many times like a loop body, into fast machine code (TurboFan). This is Just-In-Time (JIT) compilation.

**Why:** Knowing that JavaScript is compiled just in time, not read line by line, explains why a single syntax error stops the whole file and why loops get faster the longer they run.

**Q&A: why use this?**
- **Q: When do I reach for it?** A: When a file fails with `SyntaxError` and nothing prints, not even the `console.log` on line 1. V8 parses the entire file before it runs any of it.
- **Q: What does it replace?** A: The idea that JavaScript is "just interpreted". V8 interprets first, then optimises the hot paths, and drops back to the interpreter (deoptimises) if its assumptions about your values break.
- **Q: What's the gotcha?** A: The hot-code loop in `02_js_engine.js` is commented out for a reason: 100,000 iterations, each calling `console.log` twice, floods the terminal. It also calls `badCodeFn()` before the function is written, which works because function declarations are hoisted.

```mermaid
flowchart LR
    SRC["02_js_engine.js"] --> P[Parser]
    P --> AST[AST]
    AST --> IG["Ignition<br/>interpreter + bytecode"]
    IG --> RUN((Runs))
    IG -->|"code is hot<br/>(runs many times)"| TF["TurboFan<br/>optimised machine code"]
    TF --> RUN
    TF -.->|"assumption broken<br/>(deoptimise)"| IG
```

```js
// 02_Chapter_JS_Keywords_Identifiers/02_js_engine.js
let a = 10;
console.log(a);

// Hot Code
//  for (let a = 0; a < 100000; a++) {
//     console.log(a);
//     badCodeFn();
// }

// function badCodeFn() {
//     console.log("Hello");
// }
```

```bash
$ node 02_Chapter_JS_Keywords_Identifiers/02_js_engine.js
10
```

`03_letengine.js` is the smallest program you can feed the engine: a single `let x = 10;`. It prints nothing, but V8 still parses, compiles and runs it.

### 05: Keywords vs Identifiers: var, let, const

**Concept:** A keyword is a word the language owns (`var`, `let`, `const`, `if`, `class`, `return`). An identifier is the name you choose. In `let l = 10;`, `let` is the keyword, `l` is the identifier and `10` is the literal value.

**Why:** Every variable in a test (a URL, a timeout, an expected value) starts with one of these three keywords, so choosing between them is the first decision you make on every line.

**Q&A: why use this?**
- **Q: When do I reach for it?** A: `let` for values that change, `const` for values that are never reassigned (URLs, timeouts, config), `var` only when reading older code. The lesson's rule of thumb for QA scripts: `let` about 96%, `const` about 3%, `var` about 1%.
- **Q: What does it replace?** A: `var` was the only option before ES6 (2015). `var` is function-scoped and can be declared twice; `let` and `const` are block-scoped and a second declaration in the same scope is a `SyntaxError`.
- **Q: What's the gotcha?** A: `const` blocks reassignment, not change: `const arr = []; arr.push(1)` is fine. Reassigning a `const` throws `TypeError: Assignment to constant variable.`

```mermaid
flowchart TD
    Q{"Will this variable be<br/>reassigned later?"} -->|Yes| L["let"]
    Q -->|No| C["const"]
    Q -->|"Reading pre-2015 code"| V["var (legacy)"]
    L --> B["Block scoped"]
    C --> B
    V --> F["Function scoped, hoisted as undefined"]
```

| | `var` | `let` | `const` |
|:--|:--:|:--:|:--:|
| Scope | Function | Block | Block |
| Declare twice in the same scope | ✅ Allowed | ❌ `SyntaxError` | ❌ `SyntaxError` |
| Reassign | ✅ | ✅ | ❌ `TypeError` |
| Use before the declaration line | `undefined` | ❌ `ReferenceError` | ❌ `ReferenceError` |

```js
// 02_Chapter_JS_Keywords_Identifiers/04_KW_IND.js
var v = 10;   // keyword: var,   identifier: v
let l = 10;   // keyword: let,   identifier: l
const c = 10; // keyword: const, identifier: c

// What happens when you break the rules:
// let l = 20;      SyntaxError: Identifier 'l' has already been declared
// c = 20;          TypeError: Assignment to constant variable.
```

### 06: Identifier Rules

**Concept:** An identifier must start with a letter, `_` or `$`. After the first character it may also contain digits. No spaces, no hyphens, no reserved words, and names are case sensitive.

**Why:** Breaking a rule is a `SyntaxError`, and because V8 parses the whole file first, one bad name stops the entire file from running.

**Q&A: why use this?**
- **Q: When do I reach for it?** A: Every time you name something. Check three things: the first character is a letter, `_` or `$`; the rest are letters, digits, `_` or `$`; the name is not a reserved word.
- **Q: What does it replace?** A: Nothing new if you know Java: the rules are nearly identical. Even `$` and `_` on their own are legal names (`var $ = 10; var _ = 10;`).
- **Q: What's the gotcha?** A: Names are case sensitive, so `Name` and `name` are two different variables. And the error rarely says "bad name": `var 45 = 34` throws `SyntaxError: Unexpected number`.

```mermaid
flowchart TD
    S["Candidate name"] --> A{"First character is<br/>a letter, _ or $?"}
    A -->|No| E["SyntaxError"]
    A -->|Yes| B{"Rest is only letters,<br/>digits, _ or $?"}
    B -->|No| E
    B -->|Yes| C{"Is it a reserved word?<br/>(class, let, if, return ...)"}
    C -->|Yes| E
    C -->|No| OK["Valid identifier"]
```

```js
// 02_Chapter_JS_Keywords_Identifiers/05_KW_IND_Rules.js (excerpt)
var a = 10;
var $ = 10;               // $ alone is a valid name
var _a = 23;
var _ = 10;               // _ alone is a valid name
var ab123 = 23;           // digits are fine after the first character

var Name = "pramod";      // Name and name are two
var name = "Amit";        // different variables

var pramod_dutta = "hello";
var pramod$dutta = "hello";

// var 45 = 34;              SyntaxError: Unexpected number
// var pramod dutta = "x";   SyntaxError: Unexpected identifier 'dutta'
```

### 07: Naming Conventions

**Concept:** Conventions are team agreements on how to write a name: camelCase for variables and functions, PascalCase for classes and constructors, SCREAMING_SNAKE_CASE for constants, snake_case mostly outside JavaScript.

**Why:** The engine accepts all of them; people reading your test need the casing to tell a class from a variable from a fixed config value at a glance.

**Q&A: why use this?**
- **Q: When do I reach for it?** A: camelCase for almost everything (`userName`, `isLoggedIn`), PascalCase for Page Object classes (`LoginPage`), SCREAMING_SNAKE_CASE for values that never change (`BASE_URL`, `MAX_RETRIES`).
- **Q: What does it replace?** A: Hungarian notation (`strName`, `bActive`, `nCount`), an older style that put the type in the name. TypeScript types do that job now, so modern style guides avoid it.
- **Q: What's the gotcha?** A: Conventions are not enforced. `This_is_a_very_long_name_variable` runs fine; only a linter (ESLint's `camelcase` rule) or a code review will catch it.

```mermaid
flowchart LR
    Q{"What are you naming?"} -->|"Variable or function"| CC["camelCase<br/>userName"]
    Q -->|"Class or constructor"| PC["PascalCase<br/>UserProfile"]
    Q -->|"Fixed constant"| SS["SCREAMING_SNAKE_CASE<br/>MAX_SIZE"]
    Q -->|"DB columns, Python, env files"| SN["snake_case<br/>user_name"]
```

| Convention | Example | Used for in JS |
|:-----------|:--------|:---------------|
| camelCase | `totalPrice` | Variables, functions (the default) |
| PascalCase | `ShoppingCart` | Classes, constructors, Page Objects |
| SCREAMING_SNAKE_CASE | `API_KEY` | Constants and config |
| snake_case | `total_price` | Rare in JS; common in Python and SQL |
| Hungarian | `bActive` | Legacy code only |

```js
// 02_Chapter_JS_Keywords_Identifiers/06_IND_Rules2.js (excerpt)
let userName = "camelCase";          // 1. camelCase
let isLoggedIn = true;

let UserProfile = "PascalCase";      // 2. PascalCase

let user_name = "snake_case";        // 3. snake_case

const MAX_SIZE = 100;                // 4. SCREAMING_SNAKE_CASE
const API_KEY = "abc123";
// MAX_SIZE = 90;                    TypeError: Assignment to constant variable.

let strName = "string prefix";       // 5. Hungarian notation (older style)
let bActive = true;
```

### 08: Comments

**Concept:** Comments are text the engine skips. `//` comments out the rest of the line, `/* ... */` spans multiple lines, and `/** ... */` is a JSDoc block that editors like VS Code show as hover documentation.

**Why:** Comments explain why code exists, and commenting out a line is the fastest way to switch it off while debugging a test.

**Q&A: why use this?**
- **Q: When do I reach for it?** A: To explain intent, to switch a line off temporarily (`Cmd + /` on Mac, `Ctrl + /` on Windows and Linux in VS Code), and to add JSDoc to functions other people will call.
- **Q: What does it replace?** A: Nothing new if you know Java: the same `//`, `/* */` and `/** */` syntax. Javadoc becomes JSDoc.
- **Q: What's the gotcha?** A: Block comments do not nest. In `/* outer /* inner */ still code */` the comment ends at the first `*/`, so `still code */` is parsed as code and throws a `SyntaxError`.

```mermaid
flowchart LR
    F["07_Comments.js"] --> T{"Tokenizer"}
    T -->|"// ... (to end of line)"| X["Skipped"]
    T -->|"/* ... */ and /** ... */"| X
    T -->|"var g = 10;"| R["Parsed and run"]
```

```js
// 02_Chapter_JS_Keywords_Identifiers/07_Comments.js
// This is a single-line comment, it will be ignored
// this line will not be executed

/*
 *  This is a multi-line comment
 *  Author : Pramod Dutta
 *  Date : 11-Jul-2026
 */

/**
 *  This is a JSDoc comment
 *  Author : Pramod Dutta
 *  Date : 14-Feb-2026
 **/

var g = 10; // cmd + /, ctrl + /
```

### 09: Interview Questions on Identifiers

**Concept:** A drill file of the identifier cases interviewers like to ask about: legal first characters, digits, Unicode names, escape sequences, case sensitivity, and the characters that break a name.

**Why:** These questions check whether you know the actual rule or only the everyday cases, and the edge cases (Unicode, escapes) are where people get caught.

**Q&A: why use this?**
- **Q: When do I reach for it?** A: Before an interview, or when a reviewer asks "is that even legal?". Run `node 02_Chapter_JS_Keywords_Identifiers/08_IQ.js`: it exits silently, which proves every uncommented line is valid.
- **Q: What does it replace?** A: Memorising a list. It is the same rule as lesson 06, applied to Unicode: `café` and `变量` are valid because `é` and `变` count as letters.
- **Q: What's the gotcha?** A: `let A = ...` declares a variable named `A`, because the escape is decoded before the name is checked. And `Function` is a built-in, not a reserved word: `let Function = "x"` runs and shadows the global. Reserved words such as `class` or `let` are the ones that fail.

```mermaid
flowchart LR
    Q{"Valid identifier?"} -->|Yes| V["Valid"]
    Q -->|No| I["SyntaxError"]
    V --> V1["validName, _private, $jquery"]
    V --> V2["item1, $var123, a1_b2"]
    V --> V3["café, 变量 (Unicode letters)"]
    V --> V4["A decodes to A"]
    V --> V5["MyVar and myvar: two variables"]
    I --> I1["1stPlace: starts with a digit"]
    I --> I2["my-name, my name: hyphen, space"]
    I --> I3["my@name, my!name: symbols"]
    I --> I4["class, let: reserved words"]
```

```js
// 02_Chapter_JS_Keywords_Identifiers/08_IQ.js (excerpt)
let validName = "starts with letter";
let _private = "starts with underscore";
let $jquery = "starts with dollar sign";
let a1_b2 = "mixed letters digits underscore";

// let 1stPlace = "invalid";     SyntaxError: Invalid or unexpected token

// let Function = "invalid";     but it actually works: Function is a
//                               built-in name, not a reserved word
let MyVar = "uppercase M";       // case sensitive:
let myvar = "lowercase v";       // two separate variables

let café = "Unicode letter é";
let 变量 = "Chinese characters";
let A = "Unicode escape for A";  // this variable is named A

// let my-name = "invalid";      SyntaxError: Unexpected token '-'
// let my name = "invalid";      SyntaxError: Unexpected identifier
// let my@name = "invalid";      SyntaxError: Unexpected token '@'
```

---

## Chapter 03: JavaScript Literals & Data Types

### 10 & 14: Literals Concept

**Concept:** A literal is a fixed value written directly into the source code rather than computed dynamically or stored in a variable. In `let a = 10;`, `10` is a number literal.

**Why:** In test scripts, test data (endpoints, payloads, credentials, selectors) often begins as hardcoded literals before being parameterized.

**Q&A: why use this?**
- **Q: When do I reach for it?** A: Whenever initializing static values: strings `"text"`, numbers `42`, booleans `true`, hex colors `0xFF0000`, or scientific figures `1e6`.
- **Q: What does it replace?** A: Dynamic constructors like `new Number(10)` or `new String("hello")`. Literal notation is cleaner, faster, and avoids wrapper object pitfalls.
- **Q: What's the gotcha?** A: Numbers written with leading `0x` are hexadecimal, `0b` are binary, and `0o` are octal.

```js
// 03_Chapter_JS_Literals/10_Literal.js
let a = 10; // 10 is an integer numeric literal
```

```js
// 03_Chapter_JS_Literals/14_Literals.js (excerpt)
let count = 42;
let negative = -100;
let zero = 0;
let h = 0xFF;        // Hexadecimal (255)
let octal = 0o77;    // Octal (63)
let million = 1e6;   // Scientific notation: 1 * 10^6 = 1,000,000
let tiny = 1.5e-4;   // 0.00015
```

---

### 11: Primitive Literals & typeof Operator

**Concept:** JavaScript has primitive types: `string`, `number`, `boolean`, `null`, and `undefined`. The unary `typeof` operator inspects the data type of any variable or expression at runtime.

**Why:** In automation assertions, verifying an API response field has the expected type (`typeof res.id === "number"`) validates schemas before checking values.

**Q&A: why use this?**
- **Q: When do I reach for it?** A: Runtime type validation and schema assertions in tests.
- **Q: What does it replace?** A: Hardcoded type assumptions that fail silently with unexpected types.
- **Q: What's the gotcha?** A: `typeof null` returns `"object"`. This is an infamous historical bug from JS 1.0 (1995) preserved for backwards compatibility!

```mermaid
flowchart TD
    V["typeof operand"] --> S["'string' for 'hello'"]
    V --> N["'number' for 42, 3.14, NaN, Infinity"]
    V --> B["'boolean' for true, false"]
    V --> U["'undefined' for unassigned variables"]
    V --> O["'object' for null (JS bug!) and objects"]
```

```js
// 03_Chapter_JS_Literals/11_Numberal.js
let age = "mukundhan";        // String literal
let age2 = 'mukundhanleo';
let isStudent = true;         // Boolean literal
let pi = 3.14;                // Number literal (float)
let nullValue = null;         // Null literal
let undefinedValue;           // Undefined

console.log(typeof age);            // string
console.log(typeof pi);             // number
console.log(typeof isStudent);      // boolean
console.log(typeof nullValue);       // object (quirk!)
console.log(typeof undefinedValue); // undefined
```

---

### 12, 13, 18: null vs undefined

**Concept:** 
- `undefined`: A variable has been declared, but no value has been assigned yet. Set automatically by JavaScript.
- `null`: An intentional absence of any value. Explicitly assigned by the developer to represent "empty" or "no object".

**Why:** Distinguishing whether a test input was *never provided* (`undefined`) or *explicitly cleared/empty* (`null`) is a frequent QA boundary condition.

**Q&A: why use this?**
- **Q: When do I reach for it?** A: Assign `null` when you want to clear a reference or represent an empty value in an API request payload.
- **Q: What does it replace?** A: Leaving variables unassigned or using sentinel strings like `"none"` or `""`.
- **Q: What's the gotcha?** A: Loose equality `null == undefined` is `true`, but strict equality `null === undefined` is `false`.

| Feature | `undefined` | `null` |
|:--------|:------------|:-------|
| Meaning | Not assigned yet | Intentionally empty |
| Set by | JavaScript runtime automatically | Developer manually |
| `typeof` | `"undefined"` | `"object"` (historical quirk) |
| `==` check | `null == undefined` $\rightarrow$ `true` | `null == undefined` $\rightarrow$ `true` |
| `===` check | `null === undefined` $\rightarrow$ `false` | `null === undefined` $\rightarrow$ `false` |

```js
// 03_Chapter_JS_Literals/12_Null_undefined.js (excerpt)
let userName;
console.log(userName);        // undefined
console.log(typeof userName); // undefined

let profilePicture = null;
console.log(profilePicture);        // null
console.log(typeof profilePicture); // object

console.log(null == undefined);  // true
console.log(null === undefined); // false
```

---

### 15: Number Literals & Bases

**Concept:** In JavaScript, all numbers are 64-bit double-precision floating-point values (IEEE 754). There is no distinct `int` or `float` primitive type.

**Why:** Tests frequently interact with binary masks, memory offsets, status hex codes (`0xFF`), and decimal amounts.

**Q&A: why use this?**
- **Q: When do I reach for it?** A: Binary (`0b`), Octal (`0o`), and Hexadecimal (`0x`) literals make bitwise operations, byte calculations, and color representations explicit.
- **Q: What does it replace?** A: Calling `parseInt("1010", 2)` manually.
- **Q: What's the gotcha?** A: Floating-point precision issues exist in all IEEE 754 languages (`0.1 + 0.2 !== 0.3`).

```js
// 03_Chapter_JS_Literals/15_Number.js (excerpt)
let decimal = 42;      // Decimal (Base 10)
let binary = 0b1010;   // Binary (Base 2) -> 10
let octal = 0o52;      // Octal (Base 8)  -> 42
let hex = 0x2A;        // Hex (Base 16)   -> 42

let float1 = 3.14;
let exp1 = 1.5e3;      // 1.5 * 10^3 = 1500
let exp2 = 1.5e-3;     // 0.0015
```

---

### 16: Numeric Separators & BigInt

**Concept:** 
- **Numeric Separators (`_`)**: Introduced in ES2021, underscores can be placed between digits to improve number readability without changing the numeric value.
- **BigInt**: Introduced in ES2020, allows representation of arbitrarily large integers beyond `Number.MAX_SAFE_INTEGER` ($9,007,199,254,740,991$). Created by appending `n` to an integer literal or calling `BigInt()`.

**Why:** Automation suites dealing with financial transactions, database 64-bit IDs, or long epoch timestamps require `BigInt` to prevent rounding errors.

```js
// 03_Chapter_JS_Literals/16_Numbers_PART2.js
let million = 1_000_000;
let binarySep = 0b1010_0001;
let hexSep = 0xFF_FF;

let big = 123456789012345678901234567890n;
let big2 = BigInt("123456789012345678901234567890");

console.log(typeof big); // "bigint"
```

---

### 17: Special Numbers: Infinity and NaN

**Concept:**
- `Infinity` and `-Infinity`: Special numeric values produced when exceeding the maximum float range or dividing a non-zero number by zero (`1 / 0`).
- `NaN` ("Not a Number"): Produced when a mathematical operation cannot return a valid real number (`0 / 0` or `"hello" * 2`).

**Why:** Tests must guard against unexpected calculation failures returning `NaN` in cart totals or latency metrics.

**Q&A: why use this?**
- **Q: What's the gotcha?** A: `typeof NaN === "number"` and `NaN === NaN` is `false`! Always check using `Number.isNaN(val)`.

```js
// 03_Chapter_JS_Literals/17_special.js
console.log(1 / 0);               // Infinity
console.log(-1 / 0);              // -Infinity
console.log(typeof Infinity);      // "number"

console.log(0 / 0);               // NaN
console.log("hello" * 2);         // NaN
console.log(typeof NaN);          // "number"
```

---

## Chapter 04: Operators & Type Coercion

### 19: JS Architecture & Data Types

**Concept:** An expression like `let a = 10 + 3;` involves an operator (`+`) executing on operands (`10`, `3`) and an assignment operator (`=`). JavaScript classifies data types into primitives (passed by value) and reference types (passed by reference).

```js
// 04_JS_Operators/19_Arch.js
let a = 10 + 3;
// Primitives: string, number, boolean, bigint, undefined, null, Symbol
// Special / Objects: Array, Object, NaN, Infinity
```

---

### 20: Assignment Operators & Dynamic Typing

**Concept:** The `=` operator assigns the right-hand value to the variable on the left. JavaScript is dynamically typed: variables declared with `let` can be reassigned to completely different types at runtime.

```js
// 04_JS_Operators/20_Assigment_Op.js
let x = 10;
x = "PrrammodDutta"; // Dynamic typing: number -> string
console.log(x);      // "PrrammodDutta"

let x1 = 10;
x1 = x1 + 5;         // Update value
console.log(x1);     // 15
```

---

### 21: Arithmetic & Modulus Operators

**Concept:** Standard arithmetic operations (`+`, `-`, `*`, `/`) along with the modulus operator (`%`), which returns the remainder of a division.

**Why:** In test automation, `%` is indispensable for:
1. Even/odd assertions: `index % 2 === 0`
2. Pagination and batching: checking row boundaries
3. Round-robin load test dispatching across workers

```js
// 04_JS_Operators/21_Arithematic_Op.js
let a = 10, b = 3;
console.log(a + b); // 13 (sum)
console.log(a - b); // 7  (subtraction)
console.log(a * b); // 30 (multiplication)
console.log(a / b); // 3.3333333333333335 (division)

console.log(a % b);   // 1  (10 % 3 = remainder 1)
console.log(13 % 7);  // 6
console.log(101 % 2); // 1  (odd number test)
```

---

### 22: Comparison Operators: Loose vs Strict

**Concept:** Comparison operators compare two operands and always evaluate to a boolean (`true` or `false`).
- Relational: `>`, `<`, `>=`, `<=`
- Loose Equality (`==`): compares values after performing implicit type coercion.
- Strict Equality (`===`): compares both data type AND value without type coercion.

**Rule of Thumb for QA:** **Always use strict equality (`===`)**. Loose equality hides type mismatches and causes subtle test false-positives.

```mermaid
flowchart TD
    CMP{"5 == '5' vs 5 === '5'"}
    CMP -->|"5 == '5'"| L["Loose (==): coerces '5' to 5 -> true"]
    CMP -->|"5 === '5'"| S["Strict (===): types differ (number vs string) -> false"]
```

```js
// 04_JS_Operators/22_Comparsion_Op.js
console.log(3 > 4);   // false
console.log(4 >= 4);  // true

console.log(5 == "5");  // true  (loose: coerces string to number)
console.log(5 === "5"); // false (strict: number !== string)
```

---

### 23: Logical Operators

**Concept:** Logical operators combine or invert boolean expressions:
- `&&` (Logical AND): returns `true` only if both operands are truthy.
- `||` (Logical OR): returns `true` if at least one operand is truthy.
- `!` (Logical NOT): inverts the truthiness of an operand.

**Why:** Used in Playwright assertions and test guards to verify multi-step assertions (e.g., `isLoggedIn && hasAuthToken`).

```js
// 04_JS_Operators/23_Logical_Op.js
let a = true;
let b = false;

console.log(a && b); // false
console.log(a || b); // true
console.log(!a);     // false
```

---

### 24: Confusing Comparisons & Type Coercion Traps

**Concept:** JavaScript's loose equality (`==`) applies complex type coercion algorithms that can break mathematical transitivity.

**The Classic Trap:**
- `"" == 0` evaluates to `true` (empty string coerced to 0)
- `"0" == 0` evaluates to `true` (string "0" coerced to 0)
- **Yet** `"" == "0"` evaluates to `false` (both are strings, so compared as text!)

**Solution:** Using `===` eliminates all coercion traps.

```js
// 04_JS_Operators/24_Confusing_Comparsion.js
// Loose equality traps (coercion occurs):
console.log("" == 0);   // true
console.log("0" == 0);  // true
console.log("" == "0"); // false

// Strict equality fixes it (no coercion):
console.log("" === 0);   // false
console.log("0" === 0);  // false
console.log("" === "0"); // false
```

---

## Coming Up

- **Control Flow**: `if`/`else`, `switch`, `for`, `while`, and `for...of` loops
- **Functions & Scope**: Arrow functions, closures, callbacks, and `this`
- **Objects & Arrays**: Destructuring, spread/rest operators, map/filter/reduce
- **TypeScript**: Static typing, interfaces, generics, and strict configurations
- **Playwright Automation**: Locators, actions, auto-waiting, Page Object Model (POM), and CI/CD pipelines

