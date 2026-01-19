# 🔨 Builder Pattern

> **"Build it step by step, make it perfect!"** The Builder pattern constructs complex objects step by step, allowing you to produce different types and representations using the same construction code.

[![Creational Pattern](https://img.shields.io/badge/Pattern-Creational-green?style=flat-square)]()

---

## 🎯 Intent

**Separate the construction** of a complex object from its **representation**, allowing the same construction process to create different representations.

---

## ❌ Problem

Constructors with many parameters become:
- 🔴 **Unreadable** - Hard to understand what each parameter means
- 🔴 **Error-prone** - Easy to mix up parameter order
- 🔴 **Inflexible** - Can't skip optional parameters easily
- 🔴 **Telescoping constructors** - Multiple constructors for different combinations

**Example of the problem:**
```java
// ❌ Bad: Too many parameters, unclear what each means
Car car = new Car("Toyota", "Camry", 2023, "Red", true, false, true, "Leather", "V6");
```

---

## ✅ Solution

Use a **builder object** to construct the final object step by step with a fluent interface.

**Key components:**
- 🎯 **Product class** - The complex object being built
- 🔨 **Builder class** - Constructs the product step by step
- 🎬 **Director (optional)** - Orchestrates the building process

---

## 🏗️ Structure

```
┌──────────────┐
│   Director   │ ◄─── Optional
└──────┬───────┘
       │ uses
┌──────▼───────┐
│   Builder    │
│ +setField1() │
│ +setField2() │
│ +build()     │
└──────┬───────┘
       │ creates
┌──────▼───────┐
│   Product    │
└──────────────┘
```

---

## 🚀 Step-by-Step Implementation

1. **Create the product class** with all fields
2. **Make constructor private** (or package-private)
3. **Create a builder class** with the same fields
4. **Provide chained setter methods** (return `this`)
5. **Add a `build()` method** to create and return the product

### 💻 Example Code

```java
// 1. Product Class
public class Car {
    private String brand;
    private String model;
    private int year;
    private String color;
    private boolean hasSunroof;
    private boolean hasGPS;
    // ... more fields
    
    private Car(CarBuilder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        // ... set all fields
    }
    
    // Getters...
}

// 2. Builder Class
public class CarBuilder {
    private String brand;
    private String model;
    private int year;
    private String color;
    private boolean hasSunroof = false;
    private boolean hasGPS = false;
    
    public CarBuilder setBrand(String brand) {
        this.brand = brand;
        return this; // Fluent interface
    }
    
    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }
    
    // ... more setters
    
    public Car build() {
        // Validation can go here
        return new Car(this);
    }
}

// 3. Usage
Car car = new CarBuilder()
    .setBrand("Toyota")
    .setModel("Camry")
    .setYear(2023)
    .setColor("Red")
    .setHasSunroof(true)
    .build();
```

---

## 🎯 When to Use

✅ **Perfect for:**
- Objects with **many optional parameters**
- Need **immutable objects** (set once, never change)
- Want **readable object construction**
- Different **representations** of the same object
- **Validation** during construction

❌ **Avoid when:**
- Simple objects with few parameters
- All parameters are required
- Overkill for simple cases

---

## ✨ Advantages

- 📖 **Readable code** - Clear, self-documenting construction
- 🔧 **Flexible construction** - Easy to add/remove optional parameters
- ✅ **Validation** - Can validate before object creation
- 🔒 **Immutable objects** - Product can be made immutable
- 🎯 **Fluent interface** - Method chaining is elegant
- 🔄 **Reusable builders** - Can create multiple similar objects

---

## ⚠️ Disadvantages

- 📚 **More classes** - Requires builder class
- 🔧 **More code** - Additional boilerplate
- ⚡ **Slight overhead** - Extra object creation
- 🎓 **Learning curve** - May be complex for beginners

---

## 🌟 Real-World Examples

- 🍕 **Pizza Builder** - Add toppings, choose size, select crust
- 🏗️ **SQL Query Builder** - Build complex queries step by step
- 🚗 **Car Configuration** - Customize car features
- 💻 **Computer Builder** - Select components for PC
- 🏠 **House Builder** - Configure house features
- 📧 **Email Builder** - Set subject, body, attachments, etc.

---

## 📁 Implementations

This repository includes:

- 🚗 **Car Builder** - Configure cars with engines, wheels, colors, and features
- 💻 **Computer System Builder** - Assemble computers with CPU, RAM, storage, and peripherals
- 🍕 **Pizza Builder** - Create pizzas with various toppings and sizes

---

## 💡 Advanced Features

### Validation in Builder
```java
public Car build() {
    if (brand == null || model == null) {
        throw new IllegalStateException("Brand and model are required");
    }
    return new Car(this);
}
```

### Director Pattern (Optional)
```java
public class CarDirector {
    public Car buildSportsCar(CarBuilder builder) {
        return builder
            .setBrand("Ferrari")
            .setModel("488")
            .setHasGPS(true)
            .setHasSunroof(false)
            .build();
    }
}
```

---

## 🔗 Related Patterns

- **Factory Pattern** - Creates objects, but Builder constructs them step by step
- **Abstract Factory** - Can use Builder to construct products
- **Composite** - Builder can construct complex tree structures
- **Prototype** - Can clone a builder's configuration

---

<div align="center">

**Build complex objects with elegance! 🔨✨**

</div>
