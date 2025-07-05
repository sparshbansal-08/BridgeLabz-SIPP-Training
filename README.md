# 🖥️ BridgeLabz SIPP Training

This repository contains categorized Java programming concepts and lab practices guided by **Kajal Wankhede** from **11 June onwards**. Work is structured **week-wise** and organized across the following branches:  
✅ `Core-Java` • ✅ `OOPs` • ✅ `Workshop`

---

## 📅 Week 1 – Core-Java Branch

> **Branch:** `Core-Java`  
> **Date Range:** 11 June – 21 June

---

### 📘 01 - Java Programming Elements (11 June)
**Concepts:**
- Java Comments  
- Data Types  
- Variables  
- Arithmetic Operators  
- Type Conversion  
- User Input  

---

### 🔁 02 - Java Control Flows (12 June)
**Concepts:**
- Boolean Expressions  
- Logical Operators  
- `if`, `else`, `switch`  
- Loops: `for`, `while`  
- `break`, `continue`  

---

### 🧮 03 - Java Arrays (13 June)
**Concepts:**
- 1D and 2D Arrays  
- Multidimensional Arrays  
- Modifying and Accessing Arrays  
- `length`, `System.exit()`, `System.err`  

---

### 🔧 04 - Java Methods (16 June)
**Concepts:**
- User-defined, Static & Recursive Methods  
- Method Reusability  
- `Math` Class  

---

### 🔤 05 - Java String (17 June)
**Concepts:**
- Creating & Taking Input  
- String Arrays  
- String Built-in Methods  
- ASCII Characters  

---

### 🕒 06 - Built-in Functions & Date-Time (19 June)
**Concepts:**
- `Math`, `Random` Classes  
- Java 8+ APIs: `LocalDate`, `LocalTime`, `LocalDateTime`

---

### 📚 07 - **Extras: String Handling & Functions** (21 June)
**Concepts:**
- Advanced String Handling  
- Common String Functions  
- Parameter Passing & Return Concepts  

---

## 📅 Week 2 – OOPs Branch

> **Branch:** `OOPs`  
> **Date Range:** 23 June – 26 June

---

### 🔷 01 - Java Class & Object Concepts (📅 23 June)

**Concepts:**
- Procedural vs Object-Oriented Programming  
- Java Class and Object  

---

### 🔷 02 - Constructors & OOP Keywords (📅 24 June)
**Concepts:**
- Java Constructors  
- Instance vs Class Variables  
- Access Modifiers  

---

### 🔷 03 - Keywords (Contd.) & Eclipse IDE (📅 25 June)
**Concepts:**
- Deep Dive into:  
  - `this`, `static`, `final`, `instanceof`  
- Eclipse IDE Setup and Usage

---

### 🔷 04 - Object Modeling & Diagrams (📅 26 June)
**Concepts:**
- Class Diagrams  
- Object Diagrams  
- Sequence Diagrams  

---

## 🛠️ Workshop Branch

> **Branch:** `Workshop`  
> **Date Range:** 27–28 June

---

### 🧪 27 June – Review
- `NonRepeatingChar.java`  
- `ShoppingBillingSimulator.java`

---

### ☕ 28 June – The Coffee Counter Chronicles
**Features:**
- Switch-based menu  
- Quantity * Price + GST  
- Exit on `"exit"` input  

---

## 📅 Week 3 – OOPs Branch

> **Branch:** `OOPs`  
> **Date Range:** 1 July – 4 July

---

### 🧬 05 - Inheritance (📅 1 July)
**Concepts:**
- Inheritance Overview  
- Single-Level Inheritance  
- Multilevel Inheritance  
- Hierarchical Inheritance  
- Key Features of Inheritance  
- Method Overriding  
- Constructor Inheritance  
- Polymorphism and Inheritance  
- Access Modifiers & Inheritance  

---

### 🧩 06 - OOP Principles (📅 2 July)
**Concepts:**
- Encapsulation  
- Polymorphism (Compile-Time & Run-Time)  
- Interfaces  
- Abstract Classes  

---

### 🧠 Assignment Submission (📅 3 July)
**Concepts:**
- **`abstract class` and `abstract method`**  
  Enables partial implementation and enforces subclass responsibility.

- **`interface` and `implements`**  
  Supports abstraction and multiple inheritance via contract-based design.

- **Method Overriding using `@Override` annotation**  
  Allows runtime polymorphism and ensures method signature correctness.

- **Access Modifiers (`private`, `public`)**  
  Controls class member visibility and enforces encapsulation.

- **Constructor Chaining with `super()`**  
  Reuses base class constructor logic in child classes.

- **Encapsulation using Getters and Setters**  
  Protects fields and maintains data integrity.

- **Real-world Domain Modeling with OOP**  
  Represents entities and relationships with proper abstraction and hierarchy.

- **Interface-driven Design**  
  Promotes flexible, loosely-coupled, and scalable architecture.

- **Code Reuse via Inheritance**  
  Avoids redundancy and promotes DRY principles in object hierarchies.

---

## 🛠️ Workshop Branch

> **Branch:** `Workshop`  
> **Date Range:** 4 July

---

- #### 🚗 Vehicle Management System  
**Concepts:** Inheritance, Polymorphism, Method Overriding  

Design a system to manage different types of vehicles in a garage:  
1. **Base Class:** `Vehicle` with attributes like `brand`, `model`, and `fuelType`.  
2. **Subclasses:** `Car`, `Bike`, `Truck` – each overrides `calculateServiceCost()` method.  

**Requirements:**  
1. Implement `printServiceDetails()` that behaves differently for each vehicle type.  
2. Use **runtime polymorphism** to store different vehicle types in a list and invoke service-related methods polymorphically.



- #### 🛍️ Online Store Billing System  
**Concepts:** Inheritance, Abstract Classes, Polymorphism  

Create a billing system for an online store:  
1. **Abstract Base Class:** `Product` with fields like `name` and `price`.  
2. **Subclasses:** `Electronics`, `Clothing`, `Grocery` – each overrides `calculateDiscount()` method.

**Requirements:**  
1. Use an **abstract method** in `Product` to enforce discount calculation.  
2. Apply different discount logic in subclasses:  
  + **Electronics:** 10%  
  + **Clothing:** 20%  
  + **Grocery:** 0%  

---

## 📅 Week 4 – DSA Branch

> **Branch:** `DSA`  
> **Date Range:** 5 July – July 

---

### 🧵 01 - Data Structure Introduction & LinkedList (📅 5 July)

**Concepts:**
- Introduction to Data Structures  
- Key Features of Data Structures in Java  
- Types of Data Structures in Java  
- **Singly Linked List**  
- **Doubly Linked List**  
- **Circular Linked List**  

---


## 📂 Folder Structure (Branch-wise)

```bash
BridgeLabz-SIPP-Training/
│
├── Core-Java/
│   ├── ProgrammingElements/
│   ├── ControlFlow/
│   ├── Array/
│   ├── Methods/
│   ├── String/
│   ├── BuiltIn_Functions/
│   ├── Extras_String/
│
├── OOPs/
│   ├── Class_and_Object/         
│   ├── JavaConstructors/              
│   ├── KeywordsandInstanceof/              
│   ├── ObjectOrientedDesign_Principles/            
│   ├── Inheritance/
│   ├── EncapsulationPolymorphismInterfaceandAbstract/ 
│
├── Workshop/
│   ├── NonRepeatingChar.java
│   ├── ShoppingBillingSimulator.java
│   ├── CoffeeCounterChronicles.java
│   ├── VehicleManagement/
│   ├── OnlineStoreBillingSystem/



```

## 👩‍💻 Prepared By:
**[Sparsh Bansal]**  
For practice under guidance of **Kajal Wankhede**  
Using Java SE Development Kit and Eclipse IDE

