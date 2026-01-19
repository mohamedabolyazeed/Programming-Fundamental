# 🛡️ Proxy Pattern

> **"Control access, manage resources, protect your objects!"** The Proxy pattern provides a placeholder or surrogate to control access to another object, adding a layer of indirection for various purposes.

[![Structural Pattern](https://img.shields.io/badge/Pattern-Structural-purple?style=flat-square)]()

---

## 🎯 Intent

Provide a **surrogate or placeholder** to **control access** to another object.

---

## ❌ Problem

Direct access to an object may need:
- 🔴 **Security control** - Restrict who can access
- 🔴 **Performance optimization** - Lazy loading, caching
- 🔴 **Logging/monitoring** - Track access and usage
- 🔴 **Remote access** - Access objects in different address spaces
- 🔴 **Resource management** - Control expensive object creation

**Example scenarios:**
- Expensive database connection (create only when needed)
- Large image file (load on demand)
- Sensitive data (add authentication)
- Remote service (handle network communication)

---

## ✅ Solution

Introduce a **proxy class** that manages access to the real object.

**Key components:**
- 🎯 **Subject interface** - Common interface for proxy and real object
- 🔧 **Real subject** - The actual object being proxied
- 🛡️ **Proxy** - Controls access to real subject

---

## 🏗️ Structure

```
┌──────────────┐
│   Client     │
└──────┬───────┘
       │ uses
┌──────▼───────┐
│   Subject    │ ◄─── Interface
│  Interface   │
└──────┬───────┘
       │ implements
    ┌──┴──┐
    │     │
┌───▼──┐ ┌▼──────┐
│Proxy │ │ Real │
│      │ │Subject│
│-real │ │       │
│+req()│ │+req() │
└───┬──┘ └───────┘
    │ controls
    └───────────┘
```

---

## 🚀 Step-by-Step Implementation

1. **Define a common interface** - For proxy and real object
2. **Implement the real object** - Actual functionality
3. **Create a proxy class** - Implementing same interface
4. **Add access control logic** - Security, lazy loading, logging, etc.
5. **Proxy delegates to real object** - When access is granted

### 💻 Example Code

```java
// 1. Subject Interface
public interface Image {
    void display();
}

// 2. Real Subject
public class RealImage implements Image {
    private String filename;
    
    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk(); // Expensive operation
    }
    
    private void loadFromDisk() {
        System.out.println("Loading " + filename);
    }
    
    public void display() {
        System.out.println("Displaying " + filename);
    }
}

// 3. Proxy
public class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;
    
    public ProxyImage(String filename) {
        this.filename = filename;
    }
    
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename); // Lazy loading
        }
        realImage.display();
    }
}

// 4. Usage
Image image = new ProxyImage("photo.jpg");
// Image not loaded yet
image.display(); // Now it loads and displays
```

---

## 🎯 When to Use

✅ **Perfect for:**
- **Security checks** - Control who can access
- **Lazy initialization** - Create expensive objects on demand
- **Logging/monitoring** - Track access and operations
- **Caching** - Cache results of expensive operations
- **Remote access** - Access objects in different address spaces
- **Access control** - Restrict operations based on permissions

❌ **Avoid when:**
- Simple object access (overkill)
- No need for access control
- Performance overhead is unacceptable

---

## ✨ Advantages

- 🛡️ **Controlled access** - Add security, logging, validation
- ⚡ **Performance** - Lazy loading, caching
- 🔒 **Security** - Add authentication/authorization
- 📊 **Monitoring** - Track usage and performance
- 🔄 **Flexible** - Can add/remove proxy features
- 🎯 **Transparent** - Client doesn't know about proxy

---

## ⚠️ Disadvantages

- 📚 **More classes** - Requires proxy class
- 🔄 **Extra layer** - Additional indirection
- ⚡ **Slight overhead** - Extra method calls
- 🎓 **Complexity** - Can become complex with many proxies
- 🐛 **Debugging** - Harder to trace through proxy

---

## 🌟 Real-World Examples

- 🖼️ **Image Loading** - Load large images on demand
- 🗄️ **Database Connection** - Connection pooling and lazy initialization
- 🔐 **Security Proxy** - Add authentication to services
- 📁 **File Access** - Control file permissions
- 🌐 **Web Proxy** - Cache web pages, filter content
- 💳 **Payment Gateway** - Add validation and logging

---

## 📁 Implementations

This repository includes:

- 🗄️ **Database Proxy** - Control and log database access
- 📁 **FileAccess Proxy** - Manage file permissions and access
- 🌐 **Internet Proxy** - Filter and monitor internet connections

---

## 🔄 Proxy Types

### 1. Virtual Proxy
- **Lazy loading** - Creates expensive objects on demand
- Example: Loading images only when displayed

### 2. Protection Proxy
- **Access control** - Controls access based on permissions
- Example: File access based on user roles

### 3. Remote Proxy
- **Remote access** - Represents object in different address space
- Example: RMI, web services

### 4. Cache Proxy
- **Caching** - Caches results of expensive operations
- Example: Database query results

### 5. Logging Proxy
- **Monitoring** - Logs access and operations
- Example: API call logging

---

## 💡 Best Practices

1. **Keep proxy transparent** - Client shouldn't know it's using a proxy
2. **Single responsibility** - Each proxy handles one concern
3. **Document purpose** - Clearly explain what the proxy does
4. **Handle errors** - Proxy should handle errors gracefully
5. **Consider performance** - Don't add unnecessary overhead

---

## 🔗 Related Patterns

- **Adapter** - Changes interface, Proxy controls access
- **Decorator** - Adds behavior, Proxy controls access
- **Facade** - Simplifies interface, Proxy controls access
- **Bridge** - Separates interface, Proxy adds access control

---

<div align="center">

**Control access, optimize performance, protect your objects! 🛡️✨**

</div>
