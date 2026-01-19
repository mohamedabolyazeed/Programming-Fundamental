# 📋 Template Method Pattern

> **"Define the skeleton, customize the steps!"** The Template Method pattern lets you define the structure of an algorithm in a base class while allowing subclasses to override specific steps.

[![Behavioral Pattern](https://img.shields.io/badge/Pattern-Behavioral-blue?style=flat-square)]()

---

## 🎯 Intent

Define the **skeleton of an algorithm** in a base class and let subclasses **redefine certain steps** without changing the algorithm structure.

---

## ❌ Problem

Multiple classes share the **same algorithm structure** but differ in specific steps, leading to:
- 🔴 Code duplication
- 🔴 Inconsistent implementations
- 🔴 Hard to maintain

**Example:** Different vehicles (Car, Truck, Motorcycle) all follow the same manufacturing process but with different implementations for each step.

---

## ✅ Solution

Move the **common algorithm** to a superclass and **defer varying steps** to subclasses.

---

## 🏗️ Structure

```
┌─────────────────────┐
│ AbstractTemplate    │
├─────────────────────┤
│ + templateMethod() │ ◄─── Final method (defines algorithm)
│ # step1()           │ ◄─── Abstract/hook methods
│ # step2()           │
│ # step3()           │
└─────────────────────┘
         ▲
         │
    ┌────┴────┐
    │         │
┌───┴───┐ ┌───┴───┐
│Concrete│ │Concrete│
│Class A │ │Class B │
└────────┘ └────────┘
```

**Components:**
- 🎨 **Abstract Template class** - Defines the algorithm structure
- 🔒 **Template method** - Final method that orchestrates the steps
- 🎯 **Abstract/Hook methods** - Steps that vary (to be overridden)
- 🔧 **Concrete subclasses** - Implement specific steps

---

## 🚀 Step-by-Step Implementation

1. **Create an abstract class** with the common algorithm
2. **Define a `final` template method** that outlines algorithm steps
3. **Declare abstract methods** for steps that vary
4. **Implement those steps** in concrete subclasses
5. **Client calls** the template method

### 💻 Example Code Structure

```java
public abstract class VehicleTemplate {
    // Template method - defines the algorithm
    public final void manufacture() {
        assembleBody();
        installEngine();
        paintVehicle();
    }
    
    // Abstract methods - to be implemented by subclasses
    protected abstract void assembleBody();
    protected abstract void installEngine();
    protected abstract void paintVehicle();
}
```

---

## 🎯 When to Use

✅ **Use when:**
- Same workflow, different implementations
- Want to avoid code duplication
- Need consistent algorithm structure
- Framework design (define algorithm, let users customize)

❌ **Don't use when:**
- Algorithm steps change frequently
- Need flexible algorithm order
- Simple cases where inheritance is overkill

---

## ✨ Advantages

- ♻️ **Code reuse** - Common algorithm in one place
- 📐 **Consistent structure** - All subclasses follow same pattern
- 🔒 **Control flow** - Base class controls the algorithm
- 🎯 **Open/Closed Principle** - Open for extension, closed for modification
- 🧹 **Reduced duplication** - No repeated algorithm code

---

## ⚠️ Disadvantages

- 🔒 **Inflexible order** - Algorithm steps are fixed
- 📚 **More classes** - Requires inheritance hierarchy
- 🎓 **Learning curve** - May be complex for beginners
- 🔧 **Limited flexibility** - Hard to change algorithm structure

---

## 🌟 Real-World Examples

- 🍳 **Recipe templates** - Same steps, different ingredients
- 🏭 **Manufacturing processes** - Same workflow, different products
- 🎮 **Game frameworks** - Same game loop, different game logic
- 📊 **Report generators** - Same structure, different content

---

## 📁 Implementation

Check out the `TemplatePattern/` folder for a complete implementation with:
- 🚗 Car manufacturing example
- 🚛 Truck manufacturing example
- 🎨 Vehicle template base class

---

## 🔗 Related Patterns

- **Strategy Pattern** - Similar but uses composition instead of inheritance
- **Factory Method** - Often used together with Template Method
- **Hook Method** - Template Method uses hook methods for customization

---

<div align="center">

**Master the template, customize the details! 🎨**

</div>
