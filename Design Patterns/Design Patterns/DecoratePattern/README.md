# 🎁 Decorator Pattern

> **"Layer by layer, feature by feature!"** The Decorator pattern attaches additional responsibilities to objects dynamically, providing a flexible alternative to subclassing.

[![Structural Pattern](https://img.shields.io/badge/Pattern-Structural-purple?style=flat-square)]()

---

## 🎯 Intent

Attach **additional responsibilities** to an object **dynamically**, providing a flexible alternative to subclassing.

---

## ❌ Problem

Subclassing leads to:
- 🔴 **Class explosion** - Too many subclasses for combinations
- 🔴 **Rigid design** - Can't add features at runtime
- 🔴 **Inflexible** - Features are fixed at compile time
- 🔴 **Tight coupling** - Subclasses tightly bound to parent

**Example problem:**
```
Base: Coffee
Subclasses needed:
- CoffeeWithMilk
- CoffeeWithSugar
- CoffeeWithMilkAndSugar
- CoffeeWithCream
- CoffeeWithMilkAndCream
- CoffeeWithSugarAndCream
- CoffeeWithMilkSugarAndCream
... (exponential growth!)
```

---

## ✅ Solution

**Wrap objects with decorators** that add functionality dynamically.

**Key components:**
- 🎨 **Component interface** - Common interface for objects and decorators
- 🔧 **Concrete component** - Base object to be decorated
- 🎁 **Decorator base class** - Base class for all decorators
- ✨ **Concrete decorators** - Specific feature additions

---

## 🏗️ Structure

```
┌──────────────────┐
│   Component      │ ◄─── Interface
│   +operation()   │
└────────┬─────────┘
         │
    ┌────┴────┐
    │         │
┌───▼───┐ ┌───▼──────────┐
│Concrete│ │   Decorator  │
│Component│ │ - component  │
└─────────┘ └──────┬───────┘
                   │ wraps
           ┌───────┴───────┐
           │               │
    ┌──────▼──────┐ ┌──────▼──────┐
    │ Decorator A │ │ Decorator B │
    └─────────────┘ └─────────────┘
```

---

## 🚀 Step-by-Step Implementation

1. **Define component interface** - Common interface
2. **Implement base component** - Basic object
3. **Create abstract decorator** - Base decorator class
4. **Implement concrete decorators** - Specific features
5. **Wrap objects dynamically** - Compose decorators at runtime

### 💻 Example Code

```java
// 1. Component Interface
public interface Coffee {
    String getDescription();
    double getCost();
}

// 2. Concrete Component
public class SimpleCoffee implements Coffee {
    public String getDescription() {
        return "Simple Coffee";
    }
    
    public double getCost() {
        return 2.0;
    }
}

// 3. Decorator Base Class
public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;
    
    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}

// 4. Concrete Decorators
public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }
    
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }
    
    public double getCost() {
        return coffee.getCost() + 0.5;
    }
}

// 5. Usage
Coffee coffee = new MilkDecorator(
    new SugarDecorator(
        new SimpleCoffee()
    )
);
```

---

## 🎯 When to Use

✅ **Perfect for:**
- **Add features at runtime** - Dynamic behavior addition
- **Avoid class explosion** - Too many subclass combinations
- **Flexible composition** - Mix and match features
- **Extend functionality** - Without modifying existing code
- **Single Responsibility** - Each decorator adds one feature

❌ **Avoid when:**
- Simple feature addition (overkill)
- Features are always needed (use inheritance)
- Performance critical (extra layers)

---

## ✨ Advantages

- ✅ **Open/Closed Principle** - Open for extension, closed for modification
- 🔄 **Flexible** - Add/remove features at runtime
- 🎯 **Single Responsibility** - Each decorator does one thing
- 🔧 **Composable** - Mix decorators in any order
- ♻️ **Reusable** - Decorators can be reused
- 📦 **No class explosion** - Avoids exponential subclass growth

---

## ⚠️ Disadvantages

- 🐛 **Harder debugging** - Multiple layers can be confusing
- 📚 **More objects** - Creates many small objects
- 🔄 **Order matters** - Decorator order can affect behavior
- 🎓 **Complexity** - Can become complex with many decorators
- ⚡ **Slight overhead** - Extra method calls

---

## 🌟 Real-World Examples

- ☕ **Coffee Shop** - Add milk, sugar, cream, whipped cream, etc.
- 🎨 **Graphics Software** - Add borders, shadows, filters to images
- 📱 **UI Components** - Add scrolling, borders, shadows to widgets
- 📧 **Email System** - Add encryption, compression, logging
- 🎮 **Game Development** - Add power-ups, effects to characters
- 🥪 **Sandwich Builder** - Add toppings, sauces, extras

---

## 📁 Implementations

This repository includes:

- 📱 **Notifier Decorator** - Add SMS, Facebook, and Slack notifications to a base notifier
- 🥪 **Sandwich Decorator** - Layer toppings (Foul, Salta, Zethar) on sandwiches

---

## 💡 Decorator vs Inheritance

| Aspect | Inheritance | Decorator |
|--------|-------------|-----------|
| **Flexibility** | Compile-time | Runtime |
| **Class Count** | Exponential | Linear |
| **Modification** | Need new class | Wrap existing |
| **Composition** | Fixed | Dynamic |

---

## 🔗 Related Patterns

- **Adapter** - Changes interface, Decorator adds behavior
- **Composite** - Decorator can be used in tree structures
- **Proxy** - Controls access, Decorator adds behavior
- **Strategy** - Different approach to behavior modification

---

<div align="center">

**Layer your features, decorate your objects! 🎁✨**

</div>
