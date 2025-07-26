# 🖥️ BridgeLabz SIPP Training

This repository contains categorized Java programming concepts and lab practices guided by **Kajal Wankhede** from **11 June onwards**. Work is structured **week-wise** and organized across the following branches:  
✅ `Core-Java` • ✅ `OOPs` • ✅ `DSA` • ✅ `Workshop`

---

## 📅 Week 1 – [Core-Java Branch](https://github.com/sparshbansal-08/BridgeLabz-SIPP-Training/tree/Core-Java?tab=readme-ov-file)

> **Branch:** `Core-Java`  
> **Date Range:** 11 June – 21 June

---

### 📘 01 - Java Programming Elements (📅 11 June)
**Concepts:**
- Java Comments  
- Data Types  
- Variables  
- Arithmetic Operators  
- Type Conversion  
- User Input  

---

### 🔁 02 - Java Control Flows (📅 12 June)
**Concepts:**
- Boolean Expressions  
- Logical Operators  
- `if`, `else`, `switch`  
- Loops: `for`, `while`  
- `break`, `continue`  

---

### 🧮 03 - Java Arrays (📅 13 June)
**Concepts:**
- 1D and 2D Arrays  
- Multidimensional Arrays  
- Modifying and Accessing Arrays  
- `length`, `System.exit()`, `System.err`  

---

### 🔧 04 - Java Methods (📅 16 June)
**Concepts:**
- User-defined, Static & Recursive Methods  
- Method Reusability  
- `Math` Class  

---

### 🔤 05 - Java String (📅 17 June)
**Concepts:**
- Creating & Taking Input  
- String Arrays  
- String Built-in Methods  
- ASCII Characters  

---

### 🔤 Java String Practices (📅 18 June)
**Concepts:**
- Java Strings  
- Creating Strings  
- Use of `"\\"` Escape Sequence  
- Taking String Input  
- String Arrays  
- String as Method Parameters  
- String Class Built-In Methods  
- ASCII Character Codes  
- Java Exceptions  
- Java Exception Hierarchy  
- Types of Exceptions (Checked & Unchecked)  
- `java.lang.RuntimeException`  

---

### 🕒 06 - Built-in Functions & Date-Time (📅 19 June)
**Concepts:**
- `Math`, `Random` Classes  
- Java 8+ APIs: `LocalDate`, `LocalTime`, `LocalDateTime`

---

### 📚 07 - **Extras: String Handling & Functions** (📅 21 June)
**Concepts:**
- Advanced String Handling  
- Common String Functions  
- Parameter Passing & Return Concepts  

---

## 📅 Week 2 – OOPs Branch

> **Branch:** `OOPs`  
> **Date Range:** 23 June – 26 June

---

### 🧱 01 - Java Class & Object Concepts (📅 23 June)

**Concepts:**
- Procedural vs Object-Oriented Programming  
- Java Class and Object  

---

### 🛠️ 02 - Constructors & OOP Keywords (📅 24 June)
**Concepts:**
- Java Constructors  
- Instance vs Class Variables  
- Access Modifiers  

---

### 🧠 03 - Keywords (Contd.) & Eclipse IDE (📅 25 June)
**Concepts:**
- Deep Dive into:  
  - `this`, `static`, `final`, `instanceof`  
- Eclipse IDE Setup and Usage

---

### 🗂️ 04 - Object Modeling & Diagrams (📅 26 June)
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

## 📅 Week 3 – [OOPs Branch](https://github.com/sparshbansal-08/BridgeLabz-SIPP-Training/tree/OOPs?tab=readme-ov-file)

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

## 🛠️ [Workshop Branch](https://github.com/sparshbansal-08/BridgeLabz-SIPP-Training/tree/Workshop?tab=readme-ov-file)

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

## 📅 Week 4 – [DSA Branch](https://github.com/sparshbansal-08/BridgeLabz-SIPP-Training/tree/DSA?tab=readme-ov-file)

> **Branch:** `DSA`  
> **Date Range:** 5 July – 15 July 

---

### 🧵 01 - Data Structure Introduction & LinkedList (📅 5-6 July)

**Concepts:**
- Introduction to Data Structures  
- Key Features of Data Structures in Java  
- Types of Data Structures in Java  
- **Singly Linked List**  
- **Doubly Linked List**  
- **Circular Linked List**  

---

### 🧬 02 - Stack, Queue and Non-Linear Data Structures (📅 7 July)

**Concepts Covered:**

- **Stack**
  - LIFO (Last In First Out) Principle
  - Key operations: `push()`, `pop()`, `peek()`, `isEmpty()`
  - Use Cases:
    - Expression evaluation
    - Undo operations
    - Function call stack
    - Balanced parentheses checking
  - Java Built-in: `java.util.Stack`
  - Custom Implementation: Using arrays or linked lists
  - Internal Working:
    - `push()` → O(1)
    - `pop()` → O(1)
    - `peek()` → O(1)
  - Applications:
    - Backtracking
    - Call stack
    - Parenthesis matching
  - Sample Problem: Balanced Parentheses Checker
  - Best Practices:
    - Always check `isEmpty()` before `pop()` or `peek()`
    - Use synchronized structures for thread safety

- **Queue**
  - FIFO (First In First Out) Principle
  - Types:
    - Simple Queue
    - `PriorityQueue`
    - `Deque` (Double-Ended Queue)
  - Key operations: `offer()`, `poll()`, `peek()`, `isEmpty()`
  - Use Cases:
    - Task scheduling
    - Request buffering
    - Breadth-first search
  - Java Implementations:
    - `LinkedList`, `ArrayDeque`, `PriorityQueue`
  - Internal Working:
    - Enqueue → Add to end → O(1)
    - Dequeue → Remove from front → O(1)
  - Sample Problem: Ticket Counter Management System
  - Best Practices:
    - Use `offer()` instead of `add()` for safe enqueue
    - Use `poll()` instead of `remove()` to avoid exceptions
    - Avoid storing `null` values
    - Prefer thread-safe queues like `ConcurrentLinkedQueue` for concurrency

---

**Extra Work (Advanced DSA Practice):**
Kindly go through the following topics as part of your advanced DSA practice:

- **Non-Linear Data Structures**
  - **Binary Tree**
  - **Binary Search Tree (BST)**
  - **Heap** (Min Heap / Max Heap)
  - **AVL Tree**
  - **Red-Black Tree**

---

## 🛠️ [Workshop Branch](https://github.com/sparshbansal-08/BridgeLabz-SIPP-Training/tree/Workshop?tab=readme-ov-file)

> **Branch:** `Workshop`  
> **Date Range:** 8 July

---

- #### 🚘 Vehicle Rental Application  
**Concepts:** Class, Interface, Constructors, Access Modifiers, Operators  
**OOP Principles:** Abstraction, Inheritance, Polymorphism, Encapsulation  

**Scenario:**  
Build a system for renting **bikes, cars, and trucks** to customers.

**Implementation Highlights:**  
1. **Classes:**  
   - `Vehicle` (base class with model, numberPlate, baseRate)  
   - `Bike`, `Car`, `Truck` (extend Vehicle)  
   - `Customer` class to manage renter info  

2. **Constructors:**  
   - Custom constructors for initializing different vehicle types  

3. **Access Modifiers:**  
   - `protected` attributes in Vehicle for subclass access  

4. **Interface:**  
   - `Rentable` with method `calculateRent(int days)` to abstract rent logic  

5. **Operators:**  
   - Used in rent formula: `baseRate × days ± surcharges`  

6. **OOP Usage:**  
   - **Abstraction:** `Rentable` hides rent calculation behavior  
   - **Inheritance:** Vehicle → Bike, Car, Truck  
   - **Polymorphism:** Each vehicle overrides `calculateRent()`  
   - **Encapsulation:** Fields hidden via getters/setters  

---

- #### 🍽️ FoodLoop – Restaurant Ordering System  
**Concepts:** Class, Interface, Constructors, Operators  
**OOP Principles:** Encapsulation, Inheritance, Polymorphism  

**Scenario:**  
Design an app where users can **place food orders** from local restaurants.

**Implementation Highlights:**  
1. **Classes:**  
   - `FoodItem` with `name`, `category`, `price`, `availability`  
   - `VegItem` and `NonVegItem` (extend `FoodItem`)  
   - `Order` contains list of food items and total amount  

2. **Constructors:**  
   - Used to create custom combo meals or menu items  

3. **Interface:**  
   - `IOrderable` with methods `placeOrder()` and `cancelOrder()`  

4. **Operators:**  
   - Used to calculate `totalPrice = sum(itemPrices) - discount`  

5. **OOP Usage:**  
   - **Encapsulation:** Stock levels are private; accessed via methods  
   - **Inheritance:** `VegItem` and `NonVegItem` inherit `FoodItem`  
   - **Polymorphism:** `applyDiscount()` behaves differently based on total  

---

✅ These scenario-based projects helped implement real-world OOP patterns and enhanced understanding of abstraction, encapsulation, and modular design.

---

## 🗃️ [DSA Branch](https://github.com/sparshbansal-08/BridgeLabz-SIPP-Training/tree/DSA?tab=readme-ov-file)

> **Branch:** `DSA`

---

### 🧬 02 - HashMap and Hashing Function (📅 8 July)

**Concepts Covered:**

- **HashMap**
  - Stores key-value pairs
  - Allows fast retrieval, insertion, and deletion
  - Key operations: `put()`, `get()`, `remove()`, `containsKey()`, `isEmpty()`
  - Time Complexity (Average Case):
    - `put()` → O(1)
    - `get()` → O(1)
    - `remove()` → O(1)
  - Internal Working:
    - Uses an **array of buckets**
    - Each bucket stores a **linked list or tree** of entries (in case of collision)
    - Hashing used to calculate the index for storing keys

- **Hashing Function**
  - Converts a key into an integer (hash code)
  - Then maps it to a bucket index using `index = hash % capacity`
  - Good hashing minimizes collisions and distributes keys uniformly

- **Collision Handling Techniques**
  - **Chaining**: Use a linked list at each bucket to store multiple entries with the same hash
  - **Open Addressing**: Find the next empty slot in the array using linear/quadratic probing

- **Applications**
  - Caching
  - Database indexing
  - Symbol tables in compilers
  - Storing user data (e.g., login credentials)

- **Java Implementation**
  - Built-in class: `java.util.HashMap<K, V>`
  - Supports null keys and values
  - Not synchronized → use `Collections.synchronizedMap()` or `ConcurrentHashMap` for thread safety

- **Best Practices**
  - Use immutable keys to avoid unexpected behavior
  - Set initial capacity if size is predictable to avoid frequent resizing
  - Use `containsKey()` before `get()` to avoid null pointer exceptions
  - Avoid storing `null` as key/value if not needed (for clarity)

---

### 📚 03 - Sorting Algorithms (📅 9 July)

**📌 Concepts Covered:**

- **🫧 Bubble Sort**
  - Compares adjacent elements; swaps if in wrong order
  - Time: Worst → O(n²), Best (already sorted) → O(n)

- **📥 Insertion Sort**
  - Builds the sorted array one item at a time
  - Time: Worst → O(n²), Best → O(n)

- **🔀 Merge Sort**
  - Divide & conquer; always O(n log n)
  - Stable and good for large datasets

- **⚡ Quick Sort**
  - Selects pivot, partitions array
  - Avg: O(n log n), Worst: O(n²), In-place

---

### 🔍 04 & 05 - Searching & String/File Handling (📅 10 July)

**📌 Concepts Covered:**

- **Linear Search**
  - Checks each element
  - Time: O(n)

- **Binary Search**
  - Works on sorted arrays only
  - Time: O(log n)

- **StringBuilder vs StringBuffer**
  - Both are mutable strings
  - `StringBuilder`: Non-synchronized (faster)
  - `StringBuffer`: Synchronized (thread-safe)

- **BufferedReader, FileReader, InputStreamReader**
  - Used for file and input handling
  - `BufferedReader` improves performance by buffering input

---

### 🧬 06 - Algorithm Runtime & Big-O Notation (📅 11 July)

**📌 Concepts Covered:**

- **Runtime Analysis**
  - Measures time & space efficiency of code

- **Big-O Notation**
  - Expresses worst-case time complexity

- **Time Complexity**
  - O(1), O(n), O(log n), O(n²), etc.

- **Space Complexity**
  - Tracks memory usage of an algorithm

- **Best, Worst, Average Case**
  - Help analyze real-world performance

- **Optimization Guidelines**
  - Avoid nested loops
  - Use appropriate data structures (e.g., HashMap)

---

## 🛠️ [Workshop Branch](https://github.com/sparshbansal-08/BridgeLabz-SIPP-Training/tree/Workshop?tab=readme-ov-file)

> **Branch:** `Workshop`  
> **Date Range:** 14 July - 15 July

---

### 🧬 07 - OOPs Concepts in Java (📅 14 July - Review Day)

**Concepts Covered:**

- **Class & Object**
  - Class = blueprint, Object = real-world instance

- **Encapsulation**
  - Use of `private` fields + `public` getters/setters
  - Hides implementation, improves security

- **Inheritance**
  - One class inherits from another using `extends`
  - Promotes code reuse

- **Abstraction**
  - Hiding complexity, showing only relevant details
  - Achieved using:
    - `abstract class` (can have both abstract and concrete methods)
    - `interface` (100% abstract; from Java 8 supports default/static methods)

- **Interface**
  - A contract with abstract methods
  - Implemented using `implements`
  - Supports multiple inheritance

- **Polymorphism**
  - One thing, many forms
  - Compile-time (Overloading): same method name, different params
  - Runtime (Overriding): same method signature, different class

- **Overloading vs Overriding**

| Feature             | Overloading                  | Overriding                    |
|---------------------|------------------------------|-------------------------------|
| Happens In          | Same class                   | Subclass                      |
| Parameters          | Must be different            | Must be same                  |
| Return Type         | Can vary                     | Must match or be covariant    |
| Binding Time        | Compile-time                 | Runtime                       |

- **Multiple Inheritance**
  - **With classes**: ❌ Not supported (to avoid Diamond Problem)
  - **With interfaces**: ✅ Supported

---

✅ **Java is Not 100% Object-Oriented**
- Uses **primitive types** (`int`, `char`, `boolean`, etc.)
- These are not objects, hence Java is **not fully OOP**

---

### 🔁 15 July - LinkedList Use Cases: Browser History & Music Playlist

This README documents the **scenario-based problem-solving tasks** using **Java LinkedList**, focusing on **OOP principles** like **Encapsulation, Abstraction, Inheritance, and Polymorphism**.

---

## 📌 Scenario 1: Browser History Navigation

### 🧩 Use Case:
Maintain a user’s browsing history with the ability to move **back and forward**, just like real browsers.

### ✅ Why `LinkedList`?
- A **Doubly Linked List** is ideal since it allows traversal in both directions (backward & forward).

### 🧠 OOP Concepts Applied:
- **Encapsulation**: History data is hidden inside a class with private members.
- **Abstraction**: Public methods like `visitPage()`, `goBack()`, and `goForward()` abstract internal list operations.
- **Inheritance & Polymorphism**: The same navigation logic could be reused for other apps (e.g., document viewer, gallery).

## 🎵 Scenario 2: Music Playlist Queue

### 🧩 Use Case:
Design a music player that can:
- Play songs **sequentially**
- **Add** songs to the playlist
- **Remove** songs dynamically


### ✅ Why Use `LinkedList`?
- `LinkedList` allows:
  - Fast **insertion/removal** at both ends
  - Efficient queue-like behavior for **playing next song**
  - Ideal structure for dynamic playlist management


## 🧠 OOP Concepts Applied:

| OOP Concept     | Description                                                                 |
|------------------|-----------------------------------------------------------------------------|
| **Encapsulation** | The playlist (LinkedList) is kept private inside the class                |
| **Abstraction**   | Methods like `addSong()` and `playNext()` hide internal logic             |
| **Polymorphism**  | Class can be extended to play other media like podcasts or videos         |

---

## 📅 Week 4 – [DSA Branch](https://github.com/sparshbansal-08/BridgeLabz-SIPP-Training/tree/DSA?tab=readme-ov-file)

> **Branch:** `DSA`  
> **Date Range:** 16 July – 20 July 

---

# 🚀 DSA Solutions: [Scenario-Based Problem Solving](https://github.com/sparshbansal-08/BridgeLabz-SIPP-Training/tree/DSA/Scenario) (16-17 July)

## 📚 Scenario 1: [BookShelf – Library Organizer](https://github.com/sparshbansal-08/BridgeLabz-SIPP-Training/tree/DSA/Scenario/LibrarySystem)

### 🧩 Use Case:
Develop a library system to manage books based on genre and author. The system needs to efficiently handle borrowing and returning books, dynamically updating the catalog.

### ✅ DSA Concepts Applied:
- **`HashMap`**: Used to map `genre` to a `LinkedList` of books, providing fast lookup for specific genres.
- **`LinkedList`**: Enables efficient insertion and deletion of books within a genre's catalog as books are borrowed or returned, maintaining dynamic updates.
- **`HashSet` (Optional)**: Can be used within each book list to prevent duplicate book entries if a book is accidentally added multiple times to the same genre.

### 🧠 Solution Highlights:
- **Genre-wise Catalog**: `HashMap<String, LinkedList<Book>>` facilitates organizing books by genre.
- **Efficient Updates**: `LinkedList` allows O(1) insertion/deletion at specific points if the node reference is known, or O(n) if searching for the book.
- **Duplication Prevention**: `HashSet` ensures unique book entries within a genre.

---

## 🛒 Scenario 2: [SmartCheckout – Supermarket Billing Queue](https://github.com/sparshbansal-08/BridgeLabz-SIPP-Training/tree/DSA/Scenario/SmartCheckout)

### 🧩 Use Case:
Design a supermarket billing system where each checkout counter manages a queue of customers. The system needs to quickly fetch item prices and update stock upon purchase.

### ✅ DSA Concepts Applied:
- **`Queue`**: Represents the customer line at each checkout counter, ensuring FIFO (First-In, First-Out) processing of customers.
- **`HashMap`**: Used to store item prices and stock levels, allowing O(1) average time complexity for fetching prices and updating stock.

### 🧠 Solution Highlights:
- **Customer Management**: `Queue<Customer>` efficiently handles adding and removing customers from the checkout line.
- **Quick Price Lookup**: `HashMap<String, Double>` (for prices) and `HashMap<String, Integer>` (for stock) provide rapid access to item information.
- **Stock Updates**: `HashMap` allows for direct modification of stock levels upon purchase.

---

## 🍦 Scenario 3: [IceCreamRush – Sorting Flavors by Popularity](https://github.com/sparshbansal-08/BridgeLabz-SIPP-Training/tree/DSA/Scenario/IceCream)

### 🧩 Use Case:
"IceCreamRush" needs to sort its 8 ice cream flavors by sales popularity at the end of each week. Given the small data size and manual updates, a simple sorting method is preferred.

### ✅ DSA Concepts Applied:
- **`Bubble Sort`**: Chosen for its simplicity and ease of implementation, suitable for small datasets where efficiency is not the primary concern.
- **Small Data Size**: The limited number of flavors (8) makes Bubble Sort a viable and understandable option, despite its O(n^2) worst-case time complexity.
- **Repeated Adjacent Comparisons**: The core mechanism of Bubble Sort, where adjacent elements are repeatedly compared and swapped, aligns with the manual update process.

### 🧠 Solution Highlights:
- **Simplicity**: Easy to understand and implement for a small, manually updated list.
- **Direct Application**: Directly applies the concept of repeatedly comparing and swapping adjacent elements.

---

## 🎬 Scenario 4: [MovieTime – Theater Show Listings](https://github.com/sparshbansal-08/BridgeLabz-SIPP-Training/tree/DSA/Scenario/Movie)

### 🧩 Use Case:
A movie theater app allows users to sort upcoming showtimes. Since new shows are added throughout the day to an already nearly sorted list, an efficient method for real-time insertion is needed.

### ✅ DSA Concepts Applied:
- **`Insertion Sort`**: Ideal for datasets that are mostly sorted or where elements are added one at a time and need to be placed into their correct position.
- **Real-time Insertion**: Insertion Sort efficiently places new showtimes into their correct chronological slot without re-sorting the entire list.
- **Time-based Ordering**: The algorithm naturally supports maintaining a sorted order based on showtimes.

### 🧠 Solution Highlights:
- **Efficiency for Nearly Sorted Data**: Insertion Sort performs well on data that is almost sorted, making it suitable for dynamic showtime updates.
- **Incremental Sorting**: Each new showtime is "inserted" into its correct place, maintaining the sorted order incrementally.

---

## 🍔 Scenario 5: [FoodFest – Sorting Stalls by Customer Footfall](https://github.com/sparshbansal-08/BridgeLabz-SIPP-Training/tree/DSA/Scenario/FoodFest)

### 🧩 Use Case:
At a multi-day food festival, organizers track customer footfall at every stall. Daily logs from different zones (already sorted by count) need to be combined into a master list for performance evaluation.

### ✅ DSA Concepts Applied:
- **`Merge Sort`**: Excellent for combining multiple already sorted datasets into a single, comprehensively sorted list. Its divide-and-conquer approach is well-suited for this task.
- **Combining Multiple Sorted Datasets**: The core strength of Merge Sort, allowing efficient merging of sorted sub-arrays (or lists of footfall data from different zones).
- **Stability in Data with Equal Values**: Merge Sort is a stable sorting algorithm, meaning that elements with equal values maintain their relative order in the sorted output. This is important if there are multiple stalls with the same footfall and their original zonal order needs to be preserved.

### 🧠 Solution Highlights:
- **Efficient Merging**: `Merge Sort` efficiently combines the already sorted zonal data into a single master list.
- **Scalability**: Handles larger datasets effectively, unlike O(n^2) sorts.
- **Data Integrity**: Stability ensures that the relative order of stalls with identical footfall counts is maintained.

---

# 🌿🎯🗓️🎟️ DSA Solutions: Scenario-Based Problem Solving (18 July)

## 🌿 Scenario 1: AgroBot – Automated Irrigation System

### 🧩 Use Case:
Develop a smart agriculture application that deploys different types of bots to irrigate fields. The system requires a flexible design to accommodate various irrigation methods and integrate external sensor data securely.

### ✅ OOP Concepts Applied:
-   **`Abstraction`**: A base class `IrrigationUnit` defines common behaviors (like `startWatering()`) without specifying implementation details, forcing subclasses to provide their own.
-   **`Polymorphism`**: Specialized units like `Sprinkler` and `DripSystem` override the `startWatering()` method, allowing a single call to `startWatering()` to behave differently based on the specific object type.
-   **`Interface`**: The `SensorReadable` interface allows any `IrrigationUnit` (or other classes) to integrate external sensor data, promoting loose coupling and flexibility.
-   **`Access Modifiers`**: Used to protect internal calibration logic within classes (e.g., `private` fields or methods), preventing unauthorized external tampering.
-   **`Constructor Chaining`**: Constructors in `Sprinkler` and `DripSystem` call the base class `IrrigationUnit` constructor using `super()`, ensuring proper initialization of inherited properties.

### 🧠 Solution Highlights:
-   **Modular Design**: Easily add new irrigation unit types by extending `IrrigationUnit`.
-   **Sensor Integration**: Seamlessly connect to various sensors via the `SensorReadable` interface.
-   **Data Security**: Protect sensitive internal settings using `private` access modifiers.

---

## 🎯 Scenario 2: EventHive – Event Registration Platform

### 🧩 Use Case:
Design an event registration platform where users can sign up for tech events. The system needs clear separation of concerns between users, events, and tickets, with an administrative interface for event management.

### ✅ Class Design & OOP Concepts Applied:
-   **`Class Design`**: Clearly defined classes for `User`, `Event`, and `Ticket` encapsulate their respective data and behaviors, promoting maintainability and readability.
-   **`Constructor`**: The `Ticket` object is created via a parameterized constructor, ensuring that all necessary details (like `User` and `Event` references) are provided upon creation.
-   **`Interface`**: The `EventManager` interface defines a contract for administrative operations (like `modifyEvent()` or `removeEvent()`), separating the "what" from the "how."
-   **`Object Interaction`**: Demonstrates how objects from different classes (`User`, `Event`, `Ticket`) interact to achieve the registration flow.
-   **`Sequence Diagram` (Conceptual)**:
    1.  **User** interacts with the system to **Register** for an `Event`.
    2.  The system, possibly an `EventRegistrationService`, validates the `User` and `Event`.
    3.  A **Ticket** object is then **created** with references to the `User` and `Event`.
    4.  The `Ticket` is issued back to the `User`.

### 🧠 Solution Highlights:
-   **Structured Data**: Clear object models for all entities in the system.
-   **Admin Control**: `EventManager` interface provides a consistent way for administrators to manage events.
-   **Transactional Flow**: The creation of a `Ticket` links a `User` to an `Event`.

---

## 🗓️ Scenario 3: Daily Task Planner – LinkedList + Abstraction

### 🧩 Use Case:
Create a digital planner that stores a sequential list of tasks for the user. The planner needs to handle different types of tasks, each with a unique execution method, and allow users to search for tasks.

### ✅ DSA & OOP Concepts Applied:
-   **`LinkedList`**: Used to maintain the sequence of tasks, allowing for efficient additions and removals. `LinkedList<Task>` provides flexibility for dynamic task management.
-   **`Abstraction`**: `Task` is defined as an `abstract class`, serving as a blueprint for all task types. It declares an `abstract execute()` method, forcing all concrete task subclasses to implement their specific logic.
-   **`Inheritance`**: `Meeting`, `Workout`, and `CodingSession` are concrete subclasses that `extend` the `Task` abstract class, inheriting its properties and implementing the `execute()` method.
-   **`Linear Search`**: Implemented to allow users to search for tasks by keyword, iterating through the `LinkedList` until a match is found.

### 🧠 Solution Highlights:
-   **Flexible Task Types**: Easily add new task types by creating new subclasses of `Task`.
-   **Polymorphic Execution**: Call `execute()` on any `Task` object, and the specific implementation for `Meeting`, `Workout`, or `CodingSession` will run.
-   **Simple Search**: Provides basic search functionality for tasks within the planner.

---

## 🎟️ Scenario 4: Event Ticketing System – Queue + HashMap + Constructor Overloading

### 🧩 Use Case:
Develop a system for people to queue up and book tickets for various events (concerts, plays). The system needs to manage event-specific booking queues and efficiently handle attendee information, including optional contact details.

### ✅ DSA & OOP Concepts Applied:
-   **`HashMap`**: `HashMap<String, Queue<Attendee>>` maps an event name (String) to its specific booking `Queue<Attendee>`. This allows for quick lookup of the correct queue for any given event.
-   **`Queue`**: Each `Queue<Attendee>` represents the waiting line for a specific event, ensuring that attendees are processed in a First-In, First-Out (FIFO) manner for ticket booking.
-   **`Constructor Overloading`**: The `Attendee` class has multiple constructors. One takes `name` and `age`, while another takes `name`, `age`, and an optional `email`. This provides flexibility when creating `Attendee` objects.
-   **`Linear Search`**: A method is implemented to find the position of a specific person within an event's booking queue by iterating through the `Queue` elements.

### 🧠 Solution Highlights:
-   **Event-Specific Queues**: Efficiently manage separate queues for different events.
-   **Flexible Attendee Data**: `Constructor overloading` allows for capturing varying levels of attendee information.
-   **Queue Position Tracking**: Ability to find an attendee's current place in line.

---

## 📂 Folder Structure (Branch-wise)

```bash
BridgeLabz-SIPP-Training/
│
├── Core-Java
│   ├── ProgrammingElements/
│   ├── ControlFlow/
│   ├── Array/
│   ├── Methods/
│   ├── String/
│   ├── Extras_String/   
│   ├── BuiltIn_Functions/
│
├── OOPs
│   ├── Class_and_Object/         
│   ├── JavaConstructors/              
│   ├── KeywordsandInstanceof/              
│   ├── ObjectOrientedDesign_Principles/            
│   ├── Inheritance/
│   ├── EncapsulationPolymorphismInterfaceandAbstract/ 
│   
├── DSA
│   ├── LinkedList/  
│   ├── Stack_Queue_and_HashMap/  
│   ├── SortingAlgorithms/ 
│   ├── LinearAndBinarySearch/ 
│   ├── Big-O-Notation_Problems/      
│                 
├── Workshop
│   ├── NonRepeatingChar.java
│   ├── ShoppingBillingSimulator.java
│   ├── CoffeeCounterChronicles.java
│   ├── VehicleManagement/
│   ├── OnlineStoreBillingSystem/
│   ├── VehicleRental/
│   ├── FoodLoopSystem/
│   ├── BrowserHistory/
│   ├── MusicPlaylist/




```

## 👩‍💻 Prepared By:
**[Sparsh Bansal]**  
For practice under guidance of **Kajal Wankhede**  
Using Java SE Development Kit and Eclipse IDE

