# 🎓 E-Learning Platform – Creational Patterns Implementation

## 🧠 Overview
This project demonstrates the implementation of all **six creational design patterns** using an E-Learning Platform as the domain model. It includes:

- Java-based class implementation from the class diagram.
- Patterns applied in real-world use cases (e.g., Vehicle Factory, Payment System).
- Unit testing with JUnit for pattern validation.

---

## 🧱 Language & Design Choice
**Language:** Java  
**Why Java?** Java provides strong OOP support and mature tooling (JUnit, Maven, IntelliJ) ideal for demonstrating design patterns.  

Domain classes are organized in `/src/main/java/com/elearning/model/`. Patterns are in `/creational_patterns/`.

---

## 🏗️ Patterns Implemented

| Pattern          | Folder                          | Use Case                                             |
|------------------|----------------------------------|------------------------------------------------------|
| Simple Factory   | `simple_factory/`               | Create vehicles from a single factory method         |
| Factory Method   | `factory_method/`               | Subclass determines how to process payments          |
| Abstract Factory | `abstract_factory/`             | Return MacOS or Windows GUI components               |
| Builder          | `builder/`                      | Construct a complex `Pizza` object                   |
| Prototype        | `prototype/`                    | Clone shapes to avoid re-instantiation               |
| Singleton        | `singleton/`                    | Global access to a single DB connection              |

---

## 🧪 Unit Testing

Tests for all patterns are located in `/tests/`.  
**Testing Framework:** JUnit 4  
**How to Run Tests (Maven):**
```bash
mvn test
