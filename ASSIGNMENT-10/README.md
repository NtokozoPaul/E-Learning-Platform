# 🏗️ Assignment 10 – Creational Patterns in Java

## 💡 Language Choice: Java
Java is chosen for its strong object-oriented support and robust tooling (JUnit, Maven, etc.).

## ✅ Implemented Creational Patterns

| Pattern          | Location                               | Use Case                                 |
|------------------|----------------------------------------|-------------------------------------------|
| Simple Factory   | `creational_patterns/simple_factory/`  | Centralized vehicle creation              |
| Factory Method   | `creational_patterns/factory_method/`  | Payment processing abstraction            |
| Abstract Factory | `creational_patterns/abstract_factory/`| GUI toolkit generation                    |
| Builder          | `creational_patterns/builder/`         | Pizza building process                    |
| Prototype        | `creational_patterns/prototype/`       | Object cloning for performance            |
| Singleton        | `creational_patterns/singleton/`       | Shared database connection                |

## ✅ Justification Example
Used **Builder** for the Pizza class due to many optional ingredients like cheese, crust, and toppings.

## 🧪 Testing
- All patterns are tested under `/tests/` using JUnit.
- Run with `mvn test` or `gradle test`.
