# 🧬 Prototype Pattern

> **"Why create when you can clone?"** The Prototype pattern creates objects by cloning existing instances instead of creating from scratch, making object creation fast and efficient.

[![Creational Pattern](https://img.shields.io/badge/Pattern-Creational-green?style=flat-square)]()

---

## 🎯 Intent

Create new objects by **copying existing ones** instead of creating them from scratch.

---

## ❌ Problem

Object creation can be:
- 🔴 **Expensive** - Complex initialization, database queries, network calls
- 🔴 **Time-consuming** - Heavy computation or resource-intensive setup
- 🔴 **Complex** - Many dependencies or configuration steps
- 🔴 **Inefficient** - Creating similar objects repeatedly

**Example scenarios:**
- Loading objects from database (slow)
- Complex calculations during construction
- Objects with many dependencies
- Need many similar objects with slight variations

---

## ✅ Solution

**Clone an existing object** (prototype) to create new instances quickly.

**Key components:**
- 🧬 **Prototype interface** - Defines cloning capability (Cloneable in Java)
- 🔧 **Concrete prototype** - Implements cloning
- 📦 **Prototype registry** - Stores and manages prototypes (optional)

---

## 🏗️ Structure

```
┌──────────────────┐
│   Prototype      │ ◄─── Interface (Cloneable)
│   +clone()       │
└────────┬─────────┘
         │ implements
┌────────▼─────────┐
│ ConcretePrototype│
│ +clone()         │ ◄─── Returns copy
└──────────────────┘
         ▲
         │ clones
┌────────┴─────────┐
│     Client       │
└──────────────────┘
```

---

## 🚀 Step-by-Step Implementation

1. **Implement `Cloneable`** interface (Java) or create clone method
2. **Override the `clone()` method** to return a copy
3. **Create a prototype object** (original instance)
4. **Clone it when needed** instead of creating new

### 💻 Example Code

```java
// 1. Prototype Interface (Cloneable in Java)
public abstract class Shape implements Cloneable {
    protected String type;
    
    abstract void draw();
    
    // 2. Clone method
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

// 3. Concrete Prototype
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }
    
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

// 4. Usage
Shape originalCircle = new Circle();
Shape clonedCircle = (Shape) originalCircle.clone();
```

---

## 🎯 When to Use

✅ **Perfect for:**
- **Costly object creation** - Expensive initialization
- Need **multiple similar objects** - Slight variations
- **Runtime object configuration** - Don't know exact type until runtime
- **Avoiding subclass proliferation** - Instead of many subclasses
- **Performance critical** - Cloning is faster than creation

❌ **Avoid when:**
- Simple object creation (overkill)
- Objects are very different (no benefit)
- Deep cloning is too complex
- Cloning introduces bugs

---

## ✨ Advantages

- ⚡ **Fast object creation** - Cloning is faster than construction
- 💾 **Reduced initialization cost** - Reuse expensive setup
- 🔧 **Dynamic configuration** - Configure at runtime
- 📦 **Hide complexity** - Client doesn't know concrete classes
- 🔄 **Flexible** - Add/remove prototypes dynamically

---

## ⚠️ Disadvantages

- 🔄 **Deep cloning complexity** - Nested objects need special handling
- 🐛 **Clone implementation** - Easy to make mistakes
- 🎯 **Circular references** - Can cause issues in deep cloning
- 📚 **More code** - Need to implement cloning logic
- 🔒 **Shallow vs Deep** - Must understand the difference

---

## 🔄 Shallow vs Deep Cloning

### Shallow Clone
- Copies object and primitive fields
- References point to same objects
- Faster but shared state

### Deep Clone
- Copies object and all referenced objects
- Completely independent copy
- Slower but truly independent

```java
// Shallow clone (default)
public Object clone() {
    return super.clone(); // Only copies primitives and references
}

// Deep clone (custom)
public Object clone() {
    MyClass clone = (MyClass) super.clone();
    clone.nestedObject = (NestedClass) this.nestedObject.clone();
    return clone;
}
```

---

## 🌟 Real-World Examples

- 🎮 **Game Development** - Clone enemies, bullets, power-ups
- 📊 **Document Processing** - Clone templates with different data
- 🎨 **Graphics Software** - Clone shapes, layers, effects
- 🏗️ **CAD Systems** - Clone design elements
- 📝 **Form Builders** - Clone form templates

---

## 📁 Implementation

This repository includes:
- 🎨 **Shape Prototype** - Clone shapes (Circle, Rectangle) with a registry system
- 📦 **ShapeRegistry** - Manages and retrieves prototypes

---

## 💡 Prototype Registry Pattern

Store frequently used prototypes in a registry:

```java
public class ShapeRegistry {
    private Map<String, Shape> shapes = new HashMap<>();
    
    public void addShape(String key, Shape shape) {
        shapes.put(key, shape);
    }
    
    public Shape getShape(String key) {
        return (Shape) shapes.get(key).clone();
    }
}
```

---

## 🔗 Related Patterns

- **Factory Pattern** - Can use prototypes to create objects
- **Composite** - Prototypes can be used in tree structures
- **Memento** - Similar copying mechanism
- **Abstract Factory** - Can use prototypes for product creation

---

<div align="center">

**Clone your way to efficiency! 🧬✨**

</div>
