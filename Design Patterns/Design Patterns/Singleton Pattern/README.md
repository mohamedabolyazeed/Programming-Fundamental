# 🔒 Singleton Pattern

> **"One instance to rule them all!"** The Singleton pattern ensures a class has only one instance and provides global access to it.

[![Creational Pattern](https://img.shields.io/badge/Pattern-Creational-green?style=flat-square)]()

---

## 🎯 Intent

Ensure that a class has **only one instance** and provide a **global access point** to it.

---

## ❌ Problem

Multiple instances of a class may lead to:
- 🔴 **Inconsistent state** - Different instances have different data
- 💾 **Resource waste** - Unnecessary object creation
- 🔄 **Synchronization issues** - Race conditions in multi-threaded environments
- 🎯 **Loss of control** - Can't manage the instance lifecycle

**Real-world scenario:** 
- ❌ Creating multiple database connections (wasteful)
- ❌ Multiple logger instances (inconsistent logs)
- ❌ Several configuration managers (conflicting settings)

---

## ✅ Solution

**Restrict object creation** and expose a **controlled access method**.

**Key components:**
- 🔐 Private constructor - Prevents external instantiation
- 📦 Private static instance - Holds the single instance
- 🌐 Public static getInstance() - Provides global access

---

## 🏗️ Structure

```
┌──────────────────────┐
│     Singleton        │
├──────────────────────┤
│ - instance: Singleton│ ◄─── Private static instance
│ - Singleton()        │ ◄─── Private constructor
│ + getInstance()      │ ◄─── Public static accessor
└──────────────────────┘
```

---

## 🚀 Step-by-Step Implementation

### 1️⃣ Eager Initialization (Simple but always created)

```java
public class Singleton {
    private static final Singleton instance = new Singleton();
    
    private Singleton() {} // Private constructor
    
    public static Singleton getInstance() {
        return instance;
    }
}
```

### 2️⃣ Lazy Initialization (Created when needed)

```java
public class Singleton {
    private static Singleton instance;
    
    private Singleton() {}
    
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

### 3️⃣ Thread-Safe Lazy Initialization

```java
public class Singleton {
    private static volatile Singleton instance;
    
    private Singleton() {}
    
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
```

---

## 🎯 When to Use

✅ **Perfect for:**
- 📝 **Logging systems** - One logger instance for the entire application
- ⚙️ **Configuration managers** - Single source of configuration
- 🗄️ **Database connections** - Connection pooling and management
- 🎮 **Game managers** - Single game state manager
- 🖥️ **Window managers** - GUI applications with single window manager
- 🎵 **Audio managers** - Single audio system instance

❌ **Avoid when:**
- Need multiple instances
- Testing becomes difficult
- Global state causes issues
- Simple utility classes (use static methods instead)

---

## ✨ Advantages

- 🎯 **Controlled access** - Single point of access
- 💾 **Memory efficient** - Only one instance exists
- 🔄 **State consistency** - All code uses the same instance
- 🌐 **Global access** - Available throughout the application
- 🔒 **Instance control** - Can manage creation and lifecycle

---

## ⚠️ Disadvantages

- 🧪 **Difficult to test** - Hard to mock or replace
- 🔄 **Thread safety complexity** - Requires careful implementation
- 🚫 **Hidden dependencies** - Global state can hide coupling
- 🔒 **Inflexible** - Hard to extend or modify
- ⚠️ **Can hide bad design** - Sometimes used as a quick fix

---

## 🌟 Real-World Examples

- 🎮 **Game Engine** - Single renderer, audio manager, or input handler
- 🌐 **Web Server** - Single connection pool manager
- 📱 **Mobile App** - Single settings manager or cache
- 🏢 **Enterprise App** - Single service locator or registry

---

## 📁 Implementations

This repository includes:

### 🟢 Eager Singleton
- Instance created at class loading time
- Simple and thread-safe
- Always available (even if never used)

### 🟡 Lazy Singleton
- Instance created on first access
- More memory efficient
- Requires thread-safety mechanisms

---

## 🔒 Thread Safety Considerations

| Approach | Thread-Safe? | Performance | Complexity |
|----------|--------------|-------------|------------|
| Eager | ✅ Yes | ⚡ Fast | ⭐ Simple |
| Lazy (basic) | ❌ No | ⚡ Fast | ⭐ Simple |
| Lazy (synchronized) | ✅ Yes | 🐌 Slower | ⭐⭐ Medium |
| Double-checked locking | ✅ Yes | ⚡ Fast | ⭐⭐⭐ Complex |

---

## 💡 Best Practices

1. **Use enum for simplicity** (Java-specific):
   ```java
   public enum Singleton {
       INSTANCE;
       // methods here
   }
   ```

2. **Consider dependency injection** instead of Singleton for testability

3. **Document why Singleton is needed** - Don't use "just because"

4. **Ensure thread safety** if used in multi-threaded environments

---

## 🔗 Related Patterns

- **Factory Pattern** - Can return Singleton instances
- **Abstract Factory** - Factories can be Singletons
- **Builder Pattern** - Builders can be Singletons
- **Prototype Pattern** - Alternative for object creation control

---

<div align="center">

**One instance, infinite possibilities! 🚀**

</div>
