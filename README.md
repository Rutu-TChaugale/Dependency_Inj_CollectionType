# 📦 Dependency Injection in Java Using Collection Types  
*A Practical Demonstration with Setter-Based and Constructor-Based Injection*

---

## 📌 Overview

This project demonstrates **Dependency Injection (DI)** in Java using both **setter-based** and **constructor-based** approaches with **collection types** like `List`, `Set`, and `Map`. It provides a hands-on understanding of how to inject grouped data into a class using plain Java, promoting the principles of **loose coupling**, **modularity**, and **testability**—the foundations for scalable application design.

---

## 🎯 Objectives

- Understand the **concept and importance** of Dependency Injection.
- Learn and compare two primary forms of DI:
  - Setter-Based Injection
  - Constructor-Based Injection
- Explore the usage of Java collection types in DI:
  - `List<T>` – Ordered collections
  - `Set<T>` – Unique collections
  - `Map<K, V>` – Key-value mappings
- Build readiness for adopting DI in enterprise Java frameworks like Spring.

---

## 📁 Project Structure

```

collection-di/
├── Student.java           # POJO representing a student.
├── TestSetterDI.java      # Demonstrates setter-based DI with collections.
├── TestConstructorDI.java # Demonstrates constructor-based DI with collections.
└── README.md              # Project documentation.

````

---

## 🛠️ Dependency Injection Types

### 🔹 1. Setter-Based Dependency Injection

- Dependencies are passed using public setter methods.
- The object is created first, and then its dependencies are set.
- Useful when:
  - Dependencies are optional.
  - You want flexibility in modifying dependencies after object creation.

### 🔸 2. Constructor-Based Dependency Injection

- Dependencies are provided via the class constructor at the time of object creation.
- Ensures that required dependencies are not forgotten.
- Preferred when:
  - Dependencies are mandatory.
  - You want to ensure complete initialization in a single step.

---

## 📚 Collection Types in Java DI

| Collection | Description | Use Case |
|------------|-------------|----------|
| `List<T>` | Maintains insertion order and allows duplicates | Student attendance or sequential operations |
| `Set<T>`  | Stores unique elements without duplicates | Unique student IDs or tags |
| `Map<K,V>`| Key-value pairs for fast lookup | Mapping student names to records |

---

## 🚀 How to Run

### 🖥 Requirements
- Java Development Kit (JDK) 8 or above
- Java-compatible IDE (e.g., Eclipse, IntelliJ, VS Code)

### 🧪 Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/collection-di.git
   cd collection-di
````

2. Open the project in your IDE.

3. Run the files:

   * `TestSetterDI.java` for setter-based injection.
   * `TestConstructorDI.java` for constructor-based injection.

4. Observe the output showing injected student data through both DI approaches.

---

## 📖 Educational Value

This project helps in understanding:

* Practical DI in pure Java (no frameworks)
* Real-world scenarios like student management
* How to manage grouped data via collections
* The difference between setter and constructor injection

It serves as a bridge to advanced topics such as:

* Spring Framework’s DI container
* Inversion of Control (IoC)
* Annotation-based and XML-based configuration

---

## 📘 Real-World Applications

This project mirrors many real-life application scenarios:

* **University Systems**: Injecting course or student data into services
* **e-Governance Tools**: Managing awareness program participants
* **HR Tools**: Managing teams, projects, and employees
* **Inventory/CRM Systems**: Handling products or customer info as collections

---

## 🤝 Contributing

Contributions are welcome to enhance this learning demo:

```bash
# Fork -> Clone -> Branch -> Commit -> Push -> PR
```

You can:

* Add examples using custom classes
* Integrate with XML-based configuration
* Extend to Spring Framework usage

---

## 📚 Resources

* [Martin Fowler: Inversion of Control and Dependency Injection](https://martinfowler.com/articles/injection.html)
* [Spring Dependency Injection (Docs)](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans)

---

## 🙌 Acknowledgments

Thanks to the Java open-source community and educators who make foundational patterns like DI accessible to learners everywhere. This project is built to support academic, personal, and career development use cases.

---
