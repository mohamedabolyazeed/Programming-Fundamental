# 🎨 Design Patterns Collection

> **Master the art of elegant software design!** This repository is your comprehensive guide to understanding and implementing design patterns in Java. Each pattern is a proven solution to common programming challenges, helping you write cleaner, more maintainable, and scalable code.

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/)
[![Design Patterns](https://img.shields.io/badge/Design%20Patterns-GoF-blue?style=for-the-badge)](https://en.wikipedia.org/wiki/Design_Patterns)
[![Educational](https://img.shields.io/badge/Purpose-Educational-green?style=for-the-badge)]()

---

## 📚 Table of Contents

- [🎯 Overview](#-overview)
- [🏗️ Creational Patterns](#️-creational-patterns)
- [🔧 Structural Patterns](#-structural-patterns)
- [⚡ Behavioral Patterns](#-behavioral-patterns)
- [🚀 Getting Started](#-getting-started)
- [📊 Quick Reference](#-quick-reference)

---

## 🎯 Overview

Design patterns are **reusable solutions** to common problems in software design. Think of them as blueprints that you can customize to solve a particular design problem in your code. This repository contains **10 essential design patterns** with multiple real-world implementations.

### Why Learn Design Patterns?

- ✅ **Solve recurring problems** with proven solutions
- ✅ **Improve code quality** and maintainability
- ✅ **Enhance communication** with a common vocabulary
- ✅ **Ace technical interviews** and code reviews
- ✅ **Build scalable applications** with better architecture

---

## 🏗️ Creational Patterns

> *"Give me the power to create, and I'll build you a world of objects!"*

Creational patterns provide **flexible object creation mechanisms** that increase code reusability and reduce coupling.

### 🔒 Singleton Pattern
**The One and Only** - Ensures a class has only one instance and provides global access to it.

**💡 Real-world analogy:** Like a company's CEO - there's only one, and everyone knows how to reach them.

**📁 Implementations:**
- 🟢 `Eager Singleton/` - Instantiated at class loading time
- 🟡 `LazySingleton/` - Created only when first needed (thread-safe variations included)

**🎯 Use cases:** Loggers, Configuration managers, Database connections, Cache managers

---

### 🏭 Factory Pattern
**The Object Creator** - Provides an interface for creating objects without specifying their exact classes.

**💡 Real-world analogy:** Like a restaurant menu - you order "pizza" and the kitchen decides which type to make.

**📁 Implementations:**
- 🎨 `3D Shape Factory/` - Create 3D shapes (Cube, Cylinder, Sphere)
- 👾 `FactoryPatternEnemy/` - Spawn different enemy types in games
- 🥪 `FactoryPatternSandwich/` - Build various sandwich types
- 📧 `Notification Factory/` - Create different notification channels
- 📐 `Shape/` - Generate 2D geometric shapes
- 🚗 `Vehicle Factory/` - Manufacture different vehicle types

**🎯 Use cases:** UI components, Game entities, Payment processors, Notification systems

---

### 🔨 Builder Pattern
**The Step-by-Step Constructor** - Constructs complex objects step by step, allowing different representations.

**💡 Real-world analogy:** Like building a house - you add foundation, walls, roof, and decorations in order.

**📁 Implementations:**
- 🚗 `Car Builder/` - Configure cars with engines, wheels, colors, and features
- 💻 `Computer System/` - Assemble computers with CPU, RAM, storage, and peripherals
- 🍕 `Pizza Builder/` - Create pizzas with various toppings and sizes

**🎯 Use cases:** Configuration objects, Query builders, HTTP clients, Test data builders

---

### 🧬 Prototype Pattern
**The Cloning Machine** - Creates objects by cloning existing instances instead of creating from scratch.

**💡 Real-world analogy:** Like photocopying a document - you get an exact copy without retyping.

**📁 Implementation:**
- 🎨 `Prototype Pattern/` - Clone shapes (Circle, Rectangle) with a registry system

**🎯 Use cases:** Object creation is expensive, Need many similar objects, Runtime object configuration

---

## 🔧 Structural Patterns

> *"Assemble the pieces, build the structure, create the masterpiece!"*

Structural patterns explain how to **assemble objects and classes** into larger structures while keeping them flexible and efficient.

### 🔌 Adapter Pattern
**The Universal Translator** - Allows objects with incompatible interfaces to work together.

**💡 Real-world analogy:** Like a power adapter - converts one plug type to another so devices can work.

**📁 Implementations:**
- 🚲 `Car Adapter/` - Make a Bicycle work as a Vehicle
- 📄 `Convert File Adapter/` - Transform XML data to JSON format for analytics

**🎯 Use cases:** Legacy code integration, Third-party library integration, API versioning

---

### 🎁 Decorator Pattern
**The Gift Wrapper** - Attaches new behaviors to objects dynamically without modifying their structure.

**💡 Real-world analogy:** Like adding toppings to ice cream - you can add chocolate, nuts, or sprinkles without changing the base.

**📁 Implementations:**
- 📱 `Notifier Decorate/` - Add SMS, Facebook, and Slack notifications to a base notifier
- 🥪 `Sandwich Decorate/` - Layer toppings (Foul, Salta, Zethar) on sandwiches

**🎯 Use cases:** GUI components, Stream processing, Middleware, Feature toggles

---

### 🛡️ Proxy Pattern
**The Security Guard** - Provides a placeholder to control access to another object.

**💡 Real-world analogy:** Like a receptionist - controls who can access the CEO's office.

**📁 Implementations:**
- 🗄️ `Database Proxy/` - Control and log database access
- 📁 `FileAccess Proxy/` - Manage file permissions and access
- 🌐 `Internet Proxy/` - Filter and monitor internet connections

**🎯 Use cases:** Lazy loading, Access control, Logging, Caching, Remote proxies

---

## ⚡ Behavioral Patterns

> *"Orchestrate the dance of objects, define their interactions, create the symphony!"*

Behavioral patterns are concerned with **algorithms and the assignment of responsibilities** between objects.

### 👁️ Observer Pattern
**The News Broadcaster** - Defines one-to-many dependency so when one object changes, all dependents are notified.

**💡 Real-world analogy:** Like a newsletter subscription - when news is published, all subscribers get notified.

**📁 Implementations:**
- 📚 `Learning Observer/` - Notify students when new courses are available
- 🛒 `Shopping Observer/` - Alert customers about price drops and new products

**🎯 Use cases:** Event handling, Model-View architecture, Real-time notifications, Pub/Sub systems

---

### 🎮 Command Pattern
**The Remote Control** - Encapsulates requests as objects, allowing parameterization, queuing, and undo operations.

**💡 Real-world analogy:** Like a remote control - each button is a command that can be pressed, stored, or undone.

**📁 Implementation:**
- 📺 `CommandPattern/` - TV remote with commands: Turn On, Turn Off, Increase/Decrease Volume

**🎯 Use cases:** Undo/Redo functionality, Macro recording, Queue operations, Transaction logging

---

### 📋 Template Method Pattern
**The Recipe Framework** - Defines the skeleton of an algorithm, letting subclasses customize specific steps.

**💡 Real-world analogy:** Like a recipe template - the steps are fixed, but ingredients can vary.

**📁 Implementation:**
- 🚛 `TemplatePattern/` - Vehicle manufacturing template with Car and Truck variations

**🎯 Use cases:** Framework design, Algorithm families, Code generators, Test frameworks

---

## 🚀 Getting Started

### Prerequisites
- ☕ Java JDK 8 or higher
- 📝 A text editor or IDE (IntelliJ IDEA, Eclipse, VS Code)
- 💻 Basic knowledge of Java and OOP concepts

### Quick Start Guide

1. **Clone or navigate to a pattern folder:**
   ```bash
   cd "Design Patterns/[PatternName]"
   ```

2. **Compile the Java files:**
   ```bash
   javac *.java
   ```

3. **Run the main class:**
   ```bash
   java Main
   # or
   java [PatternName]
   ```

### 📖 Learning Path

1. **Start with Creational Patterns** - Understand object creation
2. **Move to Structural Patterns** - Learn object composition
3. **Master Behavioral Patterns** - Control object interactions
4. **Read individual READMEs** - Each pattern has detailed documentation
5. **Experiment with code** - Modify examples to see how they work
6. **Apply to real projects** - Use patterns in your own code

---

## 📊 Quick Reference

| Category | Pattern | Complexity | Use Frequency |
|----------|---------|------------|---------------|
| **Creational** | Singleton | ⭐⭐ | ⭐⭐⭐⭐⭐ |
| **Creational** | Factory | ⭐⭐ | ⭐⭐⭐⭐⭐ |
| **Creational** | Builder | ⭐⭐⭐ | ⭐⭐⭐⭐ |
| **Creational** | Prototype | ⭐⭐ | ⭐⭐⭐ |
| **Structural** | Adapter | ⭐⭐ | ⭐⭐⭐⭐ |
| **Structural** | Decorator | ⭐⭐⭐ | ⭐⭐⭐⭐ |
| **Structural** | Proxy | ⭐⭐ | ⭐⭐⭐⭐ |
| **Behavioral** | Observer | ⭐⭐ | ⭐⭐⭐⭐⭐ |
| **Behavioral** | Command | ⭐⭐⭐ | ⭐⭐⭐⭐ |
| **Behavioral** | Template Method | ⭐⭐ | ⭐⭐⭐ |

---

## 🎓 Learning Resources

- 📚 Each pattern folder contains detailed README files
- 💻 Well-commented Java source code
- 🔍 Both `.java` source files and compiled `.class` files
- 📖 Follows **Gang of Four (GoF)** design patterns principles
- 🎯 Real-world examples and use cases

---

## 🤝 Contributing

Found a bug? Have a suggestion? Want to add more examples?

**Contributions are welcome!** Feel free to:
- 🐛 Report issues
- 💡 Suggest improvements
- ➕ Add new pattern implementations
- 📝 Improve documentation
- ⭐ Star this repository if you find it helpful!

---

## 📜 License

This project is for **educational purposes**. Feel free to use, modify, and learn from it!

---

## 👨‍💻 Author

**Mohamed Abu Al‑Yazid**  
Cyber Security & Computer Science Student  
🔗 [GitHub Profile](https://github.com/mohamedabolyazeed)

---

<div align="center">

### ⭐ If you find this repository helpful, consider giving it a star! ⭐

**Happy Coding! 🚀**

</div>

