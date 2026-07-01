# Scala Basics Course

**Audience:** True beginners with zero prior knowledge  
**Goals:** Learn Scala fundamentals, set up toolchain, master core syntax/paradigms, build hands-on skills for writing, testing, packaging, and running applications safely and effectively—end-to-end with zero-cost tools.  
**Scope:** Complete, non-omitting guide. Every term defined before use. Copy-pasteable code/commands. Default path: Scala 3 + sbt + VS Code Metals. Alternatives listed with trade-offs.  
**Estimated Time:** 40-60 hours (self-paced)  
**Cost:** ₹0 (free/open-source tools)  
**Current as of:** November 27, 2025  

---

## Table of Contents

- [1. Introduction](#1-introduction)
- [2. Scala Basics](#2-scala-basics)
- [3. Hands-On Setup](#3-hands-on-setup)
- [4. Resources](#4-resources)
- [5. Toolchain Setup](#5-toolchain-setup)
- [6. Language Fundamentals](#6-language-fundamentals)
- [7. Functions and OOP](#7-functions-and-oop)
- [8. Collections and Pattern Matching](#8-collections-and-pattern-matching)
- [9. sbt and Project Structure](#9-sbt-and-project-structure)
- [10. Testing Basics](#10-testing-basics)
- [11. JSON and HTTP](#11-json-and-http)
- [12. CLI App Lab](#12-cli-app-lab)
- [13. Concurrency and Futures](#13-concurrency-and-futures)
- [14. FP Foundations](#14-fp-foundations)
- [15. Streams](#15-streams)
- [16. Persistence](#16-persistence)
- [17. Web Services](#17-web-services)
- [18. Advanced Scala 3 Features](#18-advanced-scala-3-features)
- [19. Packaging and Distribution](#19-packaging-and-distribution)
- [20. Performance and Profiling](#20-performance-and-profiling)
- [21. Troubleshooting and Pitfalls](#21-troubleshooting-and-pitfalls)
- [22. Capstone Project](#22-capstone-project)
- [23. FAQs](#23-faqs)
- [24. Cheat Sheet](#24-cheat-sheet)
- [25. Glossary](#25-glossary)
- [26. Further Learning](#26-further-learning)
- [27. Index](#27-index)

---

## 1. Introduction

### What is Scala?
Scala (Scalable Language) is a modern programming language that runs on the Java Virtual Machine (JVM). It combines object-oriented programming (OOP) with functional programming (FP) paradigms, making it powerful for building scalable applications. Scala compiles to Java bytecode, allowing seamless integration with existing Java libraries and ecosystems.

### Why Learn Scala?
- **Multi-paradigm:** Supports both OOP and FP, giving flexibility for different problem-solving approaches.
- **JVM ecosystem:** Access to millions of Java libraries without rewriting code.
- **Conciseness:** Less boilerplate code compared to Java, leading to faster development.
- **Scalability:** Designed for building large-scale systems (e.g., Twitter, LinkedIn use Scala).
- **Interoperability:** Easy to call Java code from Scala and vice versa.
- **Strong typing:** Catches errors at compile-time, reducing runtime bugs.
- **Community:** Active open-source community with rich libraries for web, data, AI.

### Benefits and Risks
**Benefits:**
- High productivity due to expressive syntax.
- Excellent for concurrent/parallel programming.
- Strong static typing prevents many errors.
- Rich ecosystem (Akka for actors, Play for web, Spark for big data).

**Risks:**
- Steeper learning curve for beginners (FP concepts).
- Compilation can be slower than interpreted languages.
- Smaller community than Python/JavaScript, but growing.

### One-Sentence Takeaway
Scala empowers developers to write concise, type-safe, scalable applications by blending OOP and FP on the JVM.

### India-Local Context
- **Hardware constraints:** Scala runs on low-end laptops (4GB RAM minimum, 8GB recommended) common in India.
- **Internet constraints:** Download JDK/sbt once; use offline docs (Scala docs available as PDFs).
- **Job market:** High demand in fintech (e.g., Razorpay), e-commerce (Flipkart), and big data roles. Average Scala developer salary: ₹8-15 LPA in metro cities.
- **Offline resources:** Scala books (e.g., "Functional Programming in Scala") available in Indian libraries; community meetups in Bangalore/Pune.

**Next steps:** [Section 2: Scala Basics](#2-scala-basics) | [Section 3: Hands-On Setup](#3-hands-on-setup)

---

## 2. Scala Basics

### JVM (Java Virtual Machine)
The JVM is a runtime environment that executes Java bytecode. Scala code is compiled to bytecode, allowing it to run on any device with a JVM installed. Think of JVM as a "translator" that converts bytecode into machine code for your computer.

### Compiler
Scala's compiler (`scalac`) translates human-readable Scala code into JVM bytecode. Compilation happens before running the program, catching errors early.

### REPL (Read-Eval-Print Loop)
REPL is an interactive shell for running Scala code line-by-line without compiling a full program. Useful for experimenting and learning. Accessed via `scala` command.

### Packages
Packages organize code into namespaces, preventing name conflicts. Similar to folders for files. Example: `package com.example.myapp`.

### Main Method
The entry point of a Scala application. Defined in an object (singleton class). JVM looks for `main(args: Array[String]): Unit` to start execution.

### Build Tools
Tools that manage dependencies, compilation, testing, and packaging. sbt (Simple Build Tool) is Scala's default, handling project structure and automation.

**Next steps:** [Section 3: Hands-On Setup](#3-hands-on-setup) | [Section 4: Resources](#4-resources)

---

## 3. Hands-On Setup

### Overview
Set up your development environment for Scala development.

### Objectives
- Install JDK 17 for JVM support.
- Install Scala 3 compiler and tools.
- Install sbt for project management.
- Set up VS Code with Metals extension.

### Prerequisites
- Windows/macOS/Linux computer with 4GB RAM.
- Internet connection for downloads.
- Administrator privileges for installation.

### Steps

1. **Download JDK 17:**
   - Go to https://adoptium.net/ (free OpenJDK distribution).
   - Download "Temurin 17" for your OS (Windows: .msi, macOS: .pkg, Linux: .tar.gz).
   - Run installer and follow prompts.
   - Verify: Open terminal, run `java -version`. Expected output: `openjdk version "17.x.x"`.

2. **Download Scala 3:**
   - Go to https://www.scala-lang.org/download/.
   - Download Scala 3.x.x for your OS.
   - Extract to a folder (e.g., C:\scala on Windows).
   - Add to PATH: Windows - Edit environment variables; macOS/Linux - Edit ~/.bashrc or ~/.zshrc: `export PATH=$PATH:/path/to/scala/bin`.
   - Verify: `scala -version`. Expected: `Scala compiler version 3.x.x`.

3. **Download sbt:**
   - Go to https://www.scala-sbt.org/download.html.
   - Download sbt 1.x.x launcher.
   - Install and add to PATH as above.
   - Verify: `sbt --version`. Expected: `sbt version in this project: 1.x.x`.

4. **Install VS Code:**
   - Download from https://code.visualstudio.com/.
   - Install and open.
   - Install Metals extension: Search "Scala (Metals)" in Extensions tab, install.

### Verification
- Run `java -version`, `scala -version`, `sbt --version` in terminal.
- Open VS Code, create a .scala file, check syntax highlighting.

### Teardown
- Uninstall via OS settings if needed (rare).

### Troubleshooting
- **Symptom:** `java` command not found. **Cause:** PATH not set. **Fix:** Restart terminal or source ~/.bashrc.
- **Symptom:** Metals not working. **Cause:** JDK not detected. **Fix:** Set JAVA_HOME to JDK path.

### Acceptance Criteria
- [ ] JDK 17 installed and `java -version` shows 17.x.x.
- [ ] Scala 3 installed and `scala -version` shows 3.x.x.
- [ ] sbt installed and `sbt --version` shows 1.x.x.
- [ ] VS Code with Metals extension installed.

**Next steps:** [Section 4: Resources](#4-resources) | [Section 5: Toolchain Setup](#5-toolchain-setup)

---

## 4. Resources

### Study Guides
- Official Scala docs: https://docs.scala-lang.org/
- Scala exercises: https://www.scala-exercises.org/
- Books: "Atomic Scala" (free), "Functional Programming in Scala"

### Slides and Videos
- Scala official tutorials: https://docs.scala-lang.org/getting-started/
- YouTube: "Scala for Beginners" playlist by Rock the JVM

### Lab Files
- Sample projects: https://github.com/scala/scala3-example-project
- Clone for hands-on: `git clone https://github.com/scala/scala3-example-project.git`

### Offline Docs
- Download Scala docs PDF from https://docs.scala-lang.org/
- sbt docs: https://www.scala-sbt.org/1.x/docs/

**Next steps:** [Section 5: Toolchain Setup](#5-toolchain-setup) | [Section 6: Language Fundamentals](#6-language-fundamentals)

---

## 5. Toolchain Setup (Expanded, step-by-step)

### Overview
Configure the sbt project, VS Code + Metals, and common editor tooling. All commands shown for Windows `cmd.exe`. Alternatives for macOS/Linux are noted inline.

### Exact Versions (recommended stable at time of writing)
- JDK: Temurin (OpenJDK) 17 (LTS) — exact: 17.0.8
- Scala: Scala 3.3.2 (Scala 3 series)
- sbt: 1.8.4
- Metals: latest VS Code Metals extension (use VS Code Extensions panel)
- ScalaTest: 3.2.x or ScalaTest for Scala 3 compatible build
- http4s: 0.23.x (for Scala 3)
- circe: 0.14.x (JSON)

> If a library or tool updates, change the version in `build.sbt` and the commands remain identical. Document why in notes in the file.

### Step-by-step (Windows cmd)
1. Verify JDK installed and JAVA_HOME set:
   - Open Command Prompt (cmd.exe) and run:
     java -version
     rem Expected: openjdk version "17.0.8" 2025-xx-xx
   - If `java` not found, set JAVA_HOME in System > Advanced > Environment Variables to JDK install path (e.g., C:\Program Files\Eclipse Adoptium\jdk-17.0.8) and add `%JAVA_HOME%\bin` to PATH.

2. Install sbt:
   - Download Windows installer from https://www.scala-sbt.org/download.html and run it.
   - Verify:
     sbt --version
     rem Expected: sbt version in this project: 1.8.4

3. Create a new Scala 3 project from the giter8 template (sbt must be installed):
   - Create workspace folder and run:
     mkdir C:\Users\%USERNAME%\scala-workshop && cd C:\Users\%USERNAME%\scala-workshop
     sbt new scala/scala3.g8
     rem When prompted, enter project name: my-scala-app
     cd my-scala-app

4. Open project in VS Code:
   - From cmd: code .
   - In VS Code, install the Metals extension if prompted and accept "Import build" when Metals asks.

5. First compile and run:
   - In project folder (cmd):
     sbt compile
     sbt run
   - Expected: project builds and application runs (template main prints something like "Hello, World!").

### Validation checklist
- [ ] `java -version` returns JDK 17
- [ ] `sbt --version` returns sbt 1.8.x
- [ ] VS Code opens and Metals imports the build
- [ ] `sbt compile` completes successfully

---

## 6. Language Fundamentals (Expanded with examples)

### `val` vs `var` with files
Create `src/main/scala/examples/VarsVals.scala` with content below. Exact file content is provided in Project section.

Example explanations in code comments show usage and expected behavior. Use `sbt console` to run small snippets interactively.

### REPL and sbt console
- Open REPL: `scala` (if installed globally) or
- Use sbt console: `sbt console` to interact with project classpath.

---

## Project: Full Example App (file tree + complete files)

Overview: create `my-scala-app` demonstrating core topics. Copy-pasteable project tree and files below.

Project file tree (exact):

my-scala-app/
├── build.sbt
├── project/
│   └── plugins.sbt
├── src/
│   ├── main/
│   │   └── scala/
│   │       └── com/example/myapp/
│   │           ├── MainApp.scala
│   │           ├── Calculator.scala
│   │           ├── HttpServer.scala
│   │           └── Persistence.scala
│   └── test/
│       └── scala/
│           └── com/example/myapp/
│               └── MainAppSpec.scala
└── README.md

---

### build.sbt (complete)

Add this exact content to `build.sbt` at project root:

```scala
name := "my-scala-app"

version := "0.1.0"

scalaVersion := "3.3.2"

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-effect" % "3.5.1",
  "org.http4s" %% "http4s-ember-server" % "0.23.23",
  "org.http4s" %% "http4s-dsl" % "0.23.23",
  "io.circe" %% "circe-core" % "0.14.5",
  "io.circe" %% "circe-generic" % "0.14.5",
  "io.circe" %% "circe-parser" % "0.14.5",
  "com.lihaoyi" %% "pprint" % "0.7.0",
  "org.tpolecat" %% "doobie-core" % "1.0.0-RC2",
  "org.tpolecat" %% "doobie-h2" % "1.0.0-RC2",
  "org.scalatest" %% "scalatest" % "3.2.15" % Test
)

ThisBuild / fork := true

// sbt-assembly settings will be added in project/plugins.sbt
```

Notes: Versions chosen for Scala 3 compatibility at time of writing — update if newer stable releases exist.

---

### project/plugins.sbt

Create `project/plugins.sbt` with:

```scala
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "1.2.0")
```

This enables `sbt assembly` for a fat JAR packaging.

---

### src/main/scala/com/example/myapp/MainApp.scala

Full application entry point (copy-paste):

```scala
package com.example.myapp

import scala.concurrent.ExecutionContext
import cats.effect.{IO, IOApp}

object MainApp extends IOApp.Simple {
  val run: IO[Unit] = for {
    _ <- IO.println("Starting my-scala-app...")
    _ <- IO.println("Try: sbt run or sbt assembly then java -jar")
  } yield ()
}
```

Notes: This is an IOApp using cats-effect. Running with `sbt run` will execute the `run` IO.

---

### src/main/scala/com/example/myapp/Calculator.scala

```scala
package com.example.myapp

object Calculator {
  def add(a: Int, b: Int): Int = a + b
  def subtract(a: Int, b: Int): Int = a - b
  def multiply(a: Int, b: Int): Int = a * b
  def divide(a: Int, b: Int): Option[Int] = if (b == 0) None else Some(a / b)
}
```

Usage: `scala> Calculator.add(1,2)` in sbt console or call from MainApp.

---

### src/main/scala/com/example/myapp/HttpServer.scala

Simple http4s server exposing a few endpoints demonstrating JSON (circe) and routing.

```scala
package com.example.myapp

import cats.effect.{IO, Resource}
import org.http4s.HttpRoutes
import org.http4s.dsl.io._
import org.http4s.ember.server.EmberServerBuilder
import org.http4s.circe.CirceEntityCodec._
import io.circe.generic.auto._

case class AddRequest(a: Int, b: Int)
case class AddResponse(result: Int)

object HttpServer {
  val routes = HttpRoutes.of[IO] {
    case GET -> Root / "hello" => Ok("Hello from Scala HTTP server")
    case req @ POST -> Root / "add" =>
      for {
        body <- req.as[AddRequest]
        res <- Ok(AddResponse(body.a + body.b))
      } yield res
  }

  def serverResource = EmberServerBuilder.default[IO].withHost("0.0.0.0").withPort(8080).withHttpApp(routes.orNotFound).build
}
```

Run server from a small runner or integrate into MainApp; example runner below.

---

### Example runner to start HTTP server (replace MainApp or add a separate runner)

Add `src/main/scala/com/example/myapp/ServerApp.scala`:

```scala
package com.example.myapp

import cats.effect.{IO, IOApp}

object ServerApp extends IOApp.Simple {
  def run: IO[Unit] =
    HttpServer.serverResource.use(_ => IO.never)
}
```

Run with `sbt "runMain com.example.myapp.ServerApp"` or configure mainClass in build.sbt.

---

### src/main/scala/com/example/myapp/Persistence.scala (doobie + H2 example)

```scala
package com.example.myapp

import cats.effect.{IO, Resource}
import doobie._
import doobie.implicits._
import doobie.util.transactor.Transactor

object Persistence {
  val xa: Transactor[IO] = Transactor.fromDriverManager[IO](
    "org.h2.Driver",
    "jdbc:h2:mem:mydb;DB_CLOSE_DELAY=-1",
    "sa",
    ""
  )

  def init: IO[Unit] =
    sql"CREATE TABLE IF NOT EXISTS items (id IDENTITY, name VARCHAR)".update.run.transact(xa).void

  def insert(name: String): IO[Int] =
    sql"INSERT INTO items (name) VALUES ($name)".update.withUniqueGeneratedKeys[Int]("id").transact(xa)

  def list(): IO[List[String]] =
    sql"SELECT name FROM items".query[String].to[List].transact(xa)
}
```

Call `Persistence.init.unsafeRunSync()` from MainApp (wrap in IO) to initialize DB in memory.

---

### src/test/scala/com/example/myapp/MainAppSpec.scala (ScalaTest)

```scala
package com.example.myapp

import org.scalatest.funsuite.AnyFunSuite

class MainAppSpec extends AnyFunSuite {
  test("calculator add should add") {
    assert(Calculator.add(2,3) == 5)
  }
}
```

Run tests:

sbt test

Expected: Tests pass with 1 succeeded.

---

## 7. Hands-On Labs (detailed style)

Each lab follows this template: Overview → Objectives → Prerequisites → Steps → Verification → Teardown → Troubleshooting → Acceptance criteria.

### Lab A: Create, Build and Run Hello Project

Overview: Create the `my-scala-app` from template, compile, run, and test.

Objectives:
- Create sbt project
- Build and run app
- Run unit tests

Prerequisites: Java 17, sbt installed, internet to download dependencies once.

Steps (Windows cmd):
1. mkdir C:\Users\%USERNAME%\scala-workshop && cd C:\Users\%USERNAME%\scala-workshop
2. sbt new scala/scala3.g8
   - When prompted, enter `my-scala-app`
3. cd my-scala-app
4. Replace `build.sbt` with provided content (overwrite)
5. Create files under `src/main/scala/com/example/myapp/` as above (MainApp.scala, Calculator.scala, etc.)
6. sbt compile
7. sbt test
8. sbt "runMain com.example.myapp.ServerApp" to start HTTP server (or run MainApp if using IO prints)

Verification:
- `sbt compile` shows `success` lines.
- `sbt test` shows `All tests passed` (1 succeeded).
- Access http://localhost:8080/hello returns `Hello from Scala HTTP server`.

Teardown:
- Ctrl+C to stop server.
- Delete project folder: rmdir /s /q C:\Users\%USERNAME%\scala-workshop\my-scala-app

Troubleshooting (symptom → cause → fix):
- Server not responding → Port in use → Change port in EmberServerBuilder or stop other app.
- Dependency resolve errors → Internet blocked or proxy → Configure sbt proxy in `~/.sbt/repositories` or set HTTP proxy environment variables.

Acceptance criteria:
- [ ] Project builds
- [ ] Unit test passes
- [ ] HTTP endpoint responds

---

### Lab B: CLI App (Calculator) - Complete

Overview: Create a command-line interface that accepts arguments and uses Calculator.

Objectives:
- Parse args
- Handle errors

Prerequisites: Lab A completed

Steps:
1. Create `src/main/scala/com/example/myapp/CliApp.scala` with content:

```scala
package com.example.myapp

object CliApp {
  def main(args: Array[String]): Unit = {
    if (args.length < 3) {
      println("Usage: CliApp add|sub a b")
      System.exit(1)
    }
    val op = args(0)
    val a = args(1).toInt
    val b = args(2).toInt
    val result = op match {
      case "add" => Calculator.add(a,b)
      case "sub" => Calculator.subtract(a,b)
      case "mul" => Calculator.multiply(a,b)
      case "div" => Calculator.divide(a,b).getOrElse { println("Divide by zero"); System.exit(1); 0 }
      case _ => println("Unknown op"); System.exit(1); 0
    }
    println(result)
  }
}
```

2. Compile: `sbt compile`
3. Run: `sbt "runMain com.example.myapp.CliApp add 4 5"`

Verification:
- Output should be `9` for the example above.

Teardown:
- No external resources used.

Troubleshooting:
- NumberFormatException → non-integer args → validate inputs before parse.

Acceptance criteria:
- [ ] CLI runs and returns correct output for operations

---

### Lab C: JSON API with http4s and circe

Overview: POST JSON to `/add` to get JSON response.

Objectives:
- Accept JSON body
- Return JSON

Prerequisites: Lab A

Steps:
1. Ensure `HttpServer.scala` is present as above.
2. Start server: `sbt "runMain com.example.myapp.ServerApp"`
3. Use curl (Windows cmd):
   curl -X POST -H "Content-Type: application/json" -d "{\"a\":4,\"b\":5}" http://localhost:8080/add

Verification:
- Expected JSON response: {"result":9}

Teardown:
- Stop server with Ctrl+C.

Troubleshooting:
- 415 Unsupported Media Type → Ensure `Content-Type: application/json` header present.

Acceptance criteria:
- [ ] POST returns correct JSON response

---

### Lab D: Persistence with doobie and H2

Overview: Use an in-memory H2 DB to insert and list items.

Objectives:
- Initialize DB
- Insert row
- Query rows

Prerequisites: Lab A

Steps:
1. Start sbt and run a small REPL or write a small runner to call Persistence.init, Persistence.insert("foo"), Persistence.list().unsafeRunSync()

Example runner file `DBRunner.scala`:

```scala
package com.example.myapp

import cats.effect.IO

object DBRunner {
  def main(args: Array[String]): Unit = {
    Persistence.init.unsafeRunSync()
    val id = Persistence.insert("hello").unsafeRunSync()
    val rows = Persistence.list().unsafeRunSync()
    println(s"Inserted id: $id, rows: $rows")
  }
}
```

2. Run: `sbt "runMain com.example.myapp.DBRunner"`

Verification:
- Console shows `Inserted id:` and the list containing `hello`.

Teardown:
- In-memory DB cleared when application exits.

Troubleshooting:
- Driver not found → Ensure `doobie-h2` dependency is in `build.sbt` and sbt has reloaded dependencies.

Acceptance criteria:
- [ ] Data inserted and retrievable

---

### Lab E: Testing basics (ScalaTest)

Overview: Unit test Calculator and Persistence code.

Objectives:
- Write and run tests

Prerequisites: Lab A

Steps:
1. Ensure `src/test/scala/.../MainAppSpec.scala` present.
2. Run: `sbt test`

Verification:
- Tests pass.

Teardown:
- None.

Troubleshooting:
- Test not picked up → ensure `src/test/scala` path and ScalaTest artifact added to `build.sbt`.

Acceptance criteria:
- [ ] Tests pass with green status

---

### Lab F: Concurrency and Futures

Overview: Demonstrate Scala `Future` and handling results.

Objectives:
- Run two asynchronous tasks and combine results.

Prerequisites: Basic Scala knowledge

Steps: create `src/main/scala/com/example/myapp/FuturesDemo.scala`:

```scala
package com.example.myapp

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object FuturesDemo extends App {
  val f1 = Future { Thread.sleep(500); 10 }
  val f2 = Future { Thread.sleep(300); 20 }
  val combined = for {
    a <- f1
    b <- f2
  } yield a + b
  combined.foreach(res => println(s"Sum: $res"))
  Thread.sleep(1000) // wait for futures in demo
}
```

Run: `sbt "runMain com.example.myapp.FuturesDemo"`

Verification:
- Output: `Sum: 30`

Teardown:
- None.

Troubleshooting:
- No output → program exited before futures completed → add sleep or use Await.result in demos (avoid in production).

Acceptance criteria:
- [ ] Futures return combined result

---

### Lab G: FP Foundations with cats-effect

Overview: Simple IO program and graceful shutdown.

Objectives:
- Use IOApp and resource-safe patterns.

Prerequisites: Lab A

Steps:
- See `MainApp.scala` and `ServerApp.scala` examples which use cats-effect. Run with `sbt run`.

Verification:
- IOApp runs and prints messages.

Acceptance criteria:
- [ ] IO computations run successfully

---

### Lab H: Packaging with sbt-assembly

Overview: Create an executable fat JAR that includes dependencies.

Objectives:
- Configure assembly plugin and generate a single JAR

Prerequisites: project/plugins.sbt configured

Steps:
1. sbt assembly
2. After build, run:
   java -jar target/scala-3.3.2/my-scala-app-assembly-0.1.0.jar

Verification:
- Application starts from the JAR.

Teardown:
- Delete `target` folder when done.

Troubleshooting:
- Merge strategy errors → configure assembly merge strategies in `build.sbt` (common for conflicting META-INF files).

Acceptance criteria:
- [ ] Assembly JAR runs successfully with `java -jar`

---

### Lab I: Performance and Profiling (JMH)

Overview: Add a simple JMH benchmark to measure function performance.

Objectives:
- Configure JMH
- Run benchmarks

Prerequisites: Familiarity with sbt

Steps (brief):
1. Add JMH plugin and dependencies (see JMH docs for sbt).
2. Create benchmark class using `@Benchmark` annotation.
3. Run `sbt jmh:run` to execute benchmarks.

Verification:
- Benchmark output with ops/sec metrics.

Acceptance criteria:
- [ ] Benchmark runs and shows results

---

## 8. Troubleshooting and Pitfalls (Comprehensive)

Symptom → Cause → Fix (detailed table):

- Server fails to start → Port already in use → Change port or stop conflicting service: `netstat -ano | findstr :8080` then `taskkill /PID <pid> /F`.
- sbt resolves dependencies slowly or times out → Maven Central blocked or slow → Configure alternate resolver or use local Ivy cache; ensure internet/proxy environment variables set (HTTP_PROXY, HTTPS_PROXY).
- Metals import fails → Incorrect JAVA_HOME or insufficient RAM for import → Set JAVA_HOME and increase VS Code memory limits.
- ClassNotFoundException at runtime → Missing dependency or wrong mainClass → Verify `libraryDependencies` and `mainClass` settings.
- Assembly merge errors → Conflicting resource files → Add merge strategy in `build.sbt`:

```scala
assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}
```

## 9. Checklists

Per-lab acceptance criteria summarized for instructors and learners.

- Environment checklist
  - [ ] Java 17 installed
  - [ ] sbt installed
  - [ ] VS Code + Metals installed
- Lab completion checklist
  - [ ] Lab A: Build & Run
  - [ ] Lab B: CLI
  - [ ] Lab C: HTTP JSON
  - [ ] Lab D: Persistence
  - [ ] Lab E: Tests
  - [ ] Lab F: Concurrency
  - [ ] Lab H: Packaging

## 10. FAQs (expanded)

Q: Which IDE is best? A: VS Code + Metals is lightweight and recommended for beginners; IntelliJ IDEA Ultimate has richer Scala support but is paid. IntelliJ Community has Scala plugin but limited compared to Ultimate.

Q: Which build tool? A: sbt is standard for Scala; Mill is an alternative with simpler configuration but smaller ecosystem.

Q: Scala 2 vs Scala 3? A: Scala 3 has newer language features and improved type system. Prefer Scala 3 for new projects.

## 11. Further Learning and Roadmap

- Deep FP: Read "Functional Programming in Scala" and practice with Cats
- Reactive systems: Learn Akka/Typed actors
- Web: Explore Play Framework and advanced http4s patterns
- Big Data: Apache Spark with Scala
- Certification & community: join Scala meetups in India (Bangalore, Pune)

## 12. Capstone Project (Detailed)

Overview: Build a small full-stack service with an HTTP API, SQLite (via H2 for dev), basic auth, tests, and packaged artifact.

Requirements:
- Endpoints: /health, /items (GET, POST), /items/{id} (GET, DELETE)
- Persist items in H2 (doobie)
- Unit tests for core logic
- Dockerfile to containerize the app (optional)

Deliverables (exact):
- Project repository with file tree as earlier
- README with run instructions
- Dockerfile (if requested)

Acceptance criteria:
- [ ] API endpoints functional and documented
- [ ] Tests pass
- [ ] Able to build fat JAR and run

---

## 13. India-Local Notes

- Use offline mirrors if bandwidth is limited — configure sbt to use local Ivy cache and download dependencies once.
- Hardware: 8GB RAM recommended for smooth Metals import; 4GB is minimum but may be slow.
- Offline docs: Download Scala docs, sbt docs, and library docs as PDFs.

---

## 14. Index & Glossary (brief)

- JVM — Java Virtual Machine: runtime for Java bytecode.
- sbt — Scala build tool.
- REPL — Read-Eval-Print Loop.
- IOApp — cats-effect entrypoint that composes IO effects.
- Circe — JSON library for Scala.
