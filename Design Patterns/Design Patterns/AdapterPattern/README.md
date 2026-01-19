# 🔌 Adapter Pattern

> **"Making incompatible things work together!"** The Adapter pattern allows objects with incompatible interfaces to collaborate by acting as a bridge between them.

[![Structural Pattern](https://img.shields.io/badge/Pattern-Structural-purple?style=flat-square)]()

---

## 🎯 Intent

Convert the **interface of a class** into another interface that **clients expect**, enabling classes with incompatible interfaces to work together.

---

## ❌ Problem

Incompatible interfaces cannot work together:
- 🔴 **Legacy code integration** - Old system with different interface
- 🔴 **Third-party libraries** - Different API than expected
- 🔴 **Interface mismatch** - Client expects one interface, class provides another
- 🔴 **Refactoring resistance** - Can't change existing code

**Real-world scenario:**
```java
// Client expects this interface
interface MediaPlayer {
    void play(String audioType, String fileName);
}

// But we have this incompatible class
class AdvancedMediaPlayer {
    void playVlc(String fileName) { }
    void playMp4(String fileName) { }
}
```

---

## ✅ Solution

Create an **adapter** that wraps the incompatible class and translates requests.

**Key components:**
- 🎯 **Target interface** - What the client expects
- 🔧 **Adaptee class** - The incompatible class we want to use
- 🔌 **Adapter class** - Bridges the gap between them

---

## 🏗️ Structure

```
┌──────────────┐
│   Client     │
└──────┬───────┘
       │ uses
┌──────▼───────┐
│   Target     │ ◄─── Expected interface
│  Interface   │
└──────┬───────┘
       │ implements
┌──────▼───────┐
│   Adapter    │
│ - adaptee    │ ◄─── Wraps adaptee
│ +request()   │ ◄─── Translates calls
└──────┬───────┘
       │ uses
┌──────▼───────┐
│   Adaptee    │ ◄─── Incompatible class
└──────────────┘
```

---

## 🚀 Step-by-Step Implementation

1. **Identify the target interface** - What the client expects
2. **Identify the adaptee** - The incompatible class
3. **Create adapter class** implementing target interface
4. **Store adaptee reference** in adapter
5. **Delegate calls** to adaptee methods (translate if needed)

### 💻 Example Code

```java
// 1. Target Interface (what client expects)
public interface Vehicle {
    void accelerate();
}

// 2. Adaptee (incompatible class)
public class Bicycle {
    public void pedal() {
        System.out.println("Pedaling bicycle");
    }
}

// 3. Adapter
public class BicycleAdapter implements Vehicle {
    private Bicycle bicycle;
    
    public BicycleAdapter(Bicycle bicycle) {
        this.bicycle = bicycle;
    }
    
    @Override
    public void accelerate() {
        bicycle.pedal(); // Translate call
    }
}

// 4. Usage
Bicycle bike = new Bicycle();
Vehicle vehicle = new BicycleAdapter(bike);
vehicle.accelerate(); // Works!
```

---

## 🎯 When to Use

✅ **Perfect for:**
- **Integrating legacy code** - Old systems with different interfaces
- **Third-party libraries** - APIs that don't match your needs
- **Interface mismatch** - Need to use a class with incompatible interface
- **Gradual migration** - Slowly replace old system
- **Reusing existing classes** - Can't modify but need to use

❌ **Avoid when:**
- Can modify the incompatible class directly
- Simple interface mismatch (just change the interface)
- Over-engineering simple problems

---

## ✨ Advantages

- ♻️ **Reuse existing code** - Don't need to rewrite
- 🔗 **Loose coupling** - Client doesn't depend on adaptee
- 🔧 **Flexible** - Can swap adapters easily
- 🎯 **Single Responsibility** - Adapter has one job: translation
- 🛡️ **Non-invasive** - Don't modify existing code

---

## ⚠️ Disadvantages

- 📚 **More classes** - Requires adapter class
- 🔄 **Extra layer** - Additional indirection
- ⚡ **Slight overhead** - Translation adds minimal cost
- 🎓 **Complexity** - Can become complex with many adapters

---

## 🌟 Real-World Examples

- 🔌 **Power Adapters** - Convert one plug type to another (real-world analogy!)
- 📱 **API Adapters** - Convert REST API to your application's interface
- 🗄️ **Database Adapters** - JDBC adapters for different databases
- 🎨 **UI Adapters** - Adapt different UI libraries to common interface
- 📧 **Email Adapters** - Convert between different email service APIs
- 💳 **Payment Adapters** - Integrate different payment gateways

---

## 📁 Implementations

This repository includes:

- 🚲 **Car Adapter** - Make a Bicycle work as a Vehicle
- 📄 **Convert File Adapter** - Transform XML data to JSON format for analytics

---

## 🔄 Adapter Variants

### Object Adapter (Composition)
- Adapter contains adaptee as object
- More flexible, can adapt multiple adaptees
- Used in this repository

### Class Adapter (Inheritance)
- Adapter extends adaptee
- Less flexible, single inheritance limitation
- Not possible in Java (no multiple inheritance)

---

## 💡 Best Practices

1. **Keep adapters simple** - Just translation, no business logic
2. **Name clearly** - `BicycleAdapter`, `XMLToJSONAdapter`
3. **Document purpose** - Explain what's being adapted
4. **Consider caching** - If translation is expensive
5. **Handle errors** - Translate exceptions appropriately

---

## 🔗 Related Patterns

- **Bridge** - Separates interface from implementation (similar structure)
- **Decorator** - Adds behavior, Adapter changes interface
- **Facade** - Simplifies interface, Adapter translates interface
- **Proxy** - Controls access, Adapter translates interface

---

<div align="center">

**Bridge the gap, connect the incompatible! 🔌✨**

</div>
