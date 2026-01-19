# 🏭 Factory Pattern

> **"Don't call us, we'll create you!"** The Factory pattern provides an interface for creating objects without specifying their exact classes.

[![Creational Pattern](https://img.shields.io/badge/Pattern-Creational-green?style=flat-square)]()

---

## 🎯 Intent

Define an **interface for creating objects**, but let **subclasses or a factory class** decide which class to instantiate.

---

## ❌ Problem

Direct object creation using `new` leads to:
- 🔴 **Tight coupling** - Client code depends on concrete classes
- 🔴 **Hard to extend** - Adding new types requires changing client code
- 🔴 **Violates Open/Closed Principle** - Must modify existing code for new types
- 🔴 **Complex instantiation logic** - Scattered throughout the codebase

**Example:**
```java
// ❌ Bad: Tight coupling
if (type.equals("circle")) {
    Shape shape = new Circle();
} else if (type.equals("rectangle")) {
    Shape shape = new Rectangle();
}
```

---

## ✅ Solution

**Move object creation logic** to a separate factory class that encapsulates the instantiation process.

**Key components:**
- 🎨 **Product interface** - Common interface for all products
- 🔧 **Concrete products** - Specific implementations
- 🏭 **Factory class** - Creates and returns appropriate products

---

## 🏗️ Structure

```
        ┌─────────────┐
        │   Client    │
        └──────┬──────┘
               │ uses
        ┌──────▼──────┐
        │   Factory   │
        │ +create()   │
        └──────┬──────┘
               │ creates
        ┌──────▼──────┐
        │  Product    │ ◄─── Interface
        └──────┬──────┘
               │ implements
    ┌──────────┼──────────┐
    │          │          │
┌───┴───┐ ┌───┴───┐ ┌───┴───┐
│Product│ │Product│ │Product│
│   A   │ │   B   │ │   C   │
└───────┘ └───────┘ └───────┘
```

---

## 🚀 Step-by-Step Implementation

1. **Create a common interface** or abstract class (Product)
2. **Implement multiple concrete classes** (Concrete Products)
3. **Create a factory class** with a creation method
4. **Use conditionals or polymorphism** to decide which object to return
5. **Client uses factory** instead of `new` keyword

### 💻 Example Code

```java
// 1. Product Interface
public interface Shape {
    void draw();
}

// 2. Concrete Products
public class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

// 3. Factory
public class ShapeFactory {
    public Shape createShape(String type) {
        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}

// 4. Client Usage
ShapeFactory factory = new ShapeFactory();
Shape shape = factory.createShape("circle");
shape.draw();
```

---

## 🎯 When to Use

✅ **Perfect for:**
- Object creation depends on **input or configuration**
- Want to **hide instantiation logic** from clients
- Need to **centralize object creation**
- Creating objects is **complex** (requires setup, validation, etc.)
- Want to **decouple** client from concrete classes

❌ **Avoid when:**
- Simple object creation (overkill)
- Only one type of product
- Object creation doesn't vary

---

## ✨ Advantages

- 🔗 **Loose coupling** - Client doesn't depend on concrete classes
- 🔧 **Easy to extend** - Add new products without changing client code
- 📦 **Centralized creation** - All object creation in one place
- 🧹 **Clean code** - Removes conditional logic from client
- ✅ **Open/Closed Principle** - Open for extension, closed for modification

---

## ⚠️ Disadvantages

- 📚 **More classes** - Requires factory and product classes
- 🔄 **Can grow complex** - Many products = complex factory logic
- 🎯 **Single Responsibility** - Factory handles all product types
- ⚡ **Slight overhead** - Extra layer of abstraction

---

## 🌟 Real-World Examples

- 🎮 **Game Development** - Create enemies, weapons, or power-ups based on level
- 🏦 **Payment Processing** - Create payment handlers (CreditCard, PayPal, etc.)
- 🚗 **Vehicle Manufacturing** - Create different vehicle types
- 📧 **Notification Systems** - Create different notification channels
- 🎨 **UI Frameworks** - Create buttons, dialogs, windows based on platform

---

## 📁 Implementations

This repository includes multiple factory examples:

- 🎨 **3D Shape Factory** - Create 3D shapes (Cube, Cylinder, Sphere)
- 👾 **Enemy Factory** - Spawn different enemy types in games
- 🥪 **Sandwich Factory** - Build various sandwich types
- 📧 **Notification Factory** - Create different notification channels
- 📐 **Shape Factory** - Generate 2D geometric shapes
- 🚗 **Vehicle Factory** - Manufacture different vehicle types

---

## 🔄 Factory Pattern Variants

### 1. Simple Factory
- Single factory class with static method
- Uses conditionals to create objects

### 2. Factory Method
- Abstract factory with factory methods
- Subclasses decide which class to instantiate

### 3. Abstract Factory
- Factory of factories
- Creates families of related objects

---

## 💡 Best Practices

1. **Use meaningful names** - `createShape()` not `getShape()`
2. **Return interfaces** - Not concrete classes
3. **Handle errors** - Return null or throw exceptions for invalid types
4. **Consider using enums** - For type safety instead of strings
5. **Document factory logic** - Explain creation criteria

---

## 🔗 Related Patterns

- **Abstract Factory** - Creates families of related objects
- **Builder** - Constructs complex objects step by step
- **Prototype** - Creates objects by cloning
- **Singleton** - Factory can be a Singleton

---

<div align="center">

**Create objects like a pro! 🏭✨**

</div>
