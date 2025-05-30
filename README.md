
# 📚 Setter-Based Dependency Injection with Collection Types in Java

Welcome to this Java-based demonstration project that explores the principles and application of **Dependency Injection (DI)** using **setter methods** in combination with **Java collection types** (`List`, `Set`, `Map`). The objective of this project is to simplify the understanding of object-oriented programming (OOP) design principles such as **loose coupling**, **modularity**, and **maintainability**, with a specific focus on **injecting grouped data** into objects through standard Java practices.

---

## 🔍 Overview

This project is designed to serve as a practical example for beginners and intermediate Java learners to:
- Understand **what dependency injection is** and **why it's useful**.
- Learn how to **inject collection-type dependencies** into objects using **setter methods**.
- Appreciate the value of organizing related object data (e.g., student records) using collections.
- Prepare for more advanced topics such as **Spring Framework's Dependency Injection** features.

Setter-based DI is one of the most fundamental patterns in Java that sets the foundation for writing testable, flexible, and maintainable code.

---

## 🧠 Learning Objectives

Through this project, learners will be able to:

- Recognize the importance of **Dependency Injection** in modern Java applications.
- Distinguish between **setter injection**, **constructor injection**, and **field injection**.
- Understand how Java collection types such as:
  - `List<T>` (ordered list of objects),
  - `Set<T>` (unique, unordered collection),
  - `Map<K, V>` (key-value pair mapping)
  can be used to manage and inject structured data.
- Implement real-world scenarios where multiple related objects need to be grouped and managed using these collection types.

---

## 📁 Project Structure

```

collection-di-setter/
├── Student.java       # A Plain Old Java Object (POJO) representing the student entity.
├── Test.java          # The main class demonstrating setter-based injection using collection types.
└── README.md          # This documentation file.

````

---

## 🌟 Why Use Dependency Injection?

Dependency Injection is a design pattern that enables the development of loosely coupled code. Instead of classes creating their own dependencies (tight coupling), DI allows external entities to provide the required dependencies to the class. This pattern enhances:

- **Testability**: Easier to test individual components in isolation.
- **Reusability**: Objects are more modular and reusable.
- **Maintainability**: Changing the implementation of a dependency does not require changing the dependent class.
- **Flexibility**: Easily swap out components (e.g., mock objects for testing).

Setter injection specifically is useful when:
- The dependency is optional.
- You need to reconfigure the dependency after the object is constructed.
- You prefer bean-style configuration.

---

## 📦 Java Collection Types in DI

This project focuses on injecting the following collection types:

### 1. `List<T>`
- Maintains insertion order.
- Allows duplicate elements.
- Suitable for storing ordered sequences like a list of students.

### 2. `Set<T>`
- Does **not** allow duplicates.
- Useful when you want to ensure uniqueness, such as student IDs or unique records.

### 3. `Map<K, V>`
- Stores key-value pairs.
- Useful for retrieving student data by unique keys like names or registration numbers.

These collections can be populated and then injected into classes using public setter methods to provide dynamic and flexible object relationships.

---

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or above
- An IDE like IntelliJ IDEA, Eclipse, or Visual Studio Code
- Git (optional, for cloning the repository)

### Steps to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/collection-di-setter.git
````

2. Open the project in your IDE of choice.

3. Locate the `Test.java` file, which contains the `main` method.

4. Run the program to see how dependencies (collections of students) are injected and utilized.

---

## 🎓 Real-World Use Cases

The principles demonstrated in this project are widely applicable:

* **School Management Systems**: Managing lists of students, teachers, or courses.
* **E-commerce Platforms**: Handling collections of products, users, orders, etc.
* **Government Portals**: Injecting datasets into services (e.g., for e-Governance or awareness campaigns).
* **Volunteer Management**: Injecting group data like NSS volunteers, activities, or awareness programs.

---

## 📖 Educational Value

This project is especially suited for:

* Computer Science students learning Java OOP and design patterns.
* Developers preparing for interviews focused on design principles.
* Learners transitioning from core Java to enterprise frameworks like Spring, where DI is a core concept.
* Hobbyists building personal or academic projects that involve structured data handling.

---

## 🤝 Contributions

Contributions are highly welcome. You can:

* Improve documentation
* Add constructor-based DI or annotation-based variants
* Integrate with Spring Framework for advanced examples
* Provide test cases or sample use cases

To contribute:

1. Fork the repository
2. Create a new branch (`git checkout -b feature-branch`)
3. Commit your changes (`git commit -m "Added a new feature"`)
4. Push to the branch (`git push origin feature-branch`)
5. Create a pull request

---

## 📄 License

This project is licensed under the [MIT License](LICENSE). You are free to use, modify, and distribute this project with attribution.

---

## 🔗 Useful Resources

* [Oracle Java Documentation](https://docs.oracle.com/en/java/)
* [Java Collections Framework](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/overview.html)
* [Martin Fowler on Dependency Injection](https://martinfowler.com/articles/injection.html)
* [Spring Framework DI](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans)

---

## 🙌 Acknowledgements

Special thanks to the open-source community and educational platforms that continuously support learners and developers in their journey to mastering object-oriented design and software architecture.

---
