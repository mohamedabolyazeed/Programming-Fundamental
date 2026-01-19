# 👁️ Observer Pattern

> **"Stay informed, stay updated!"** The Observer pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified automatically.

[![Behavioral Pattern](https://img.shields.io/badge/Pattern-Behavioral-blue?style=flat-square)]()

---

## 🎯 Intent

Define a **one-to-many dependency** so that when one object changes state, **all dependents are notified** automatically.

---

## ❌ Problem

Tight coupling between objects that need updates:
- 🔴 **Direct dependencies** - Objects directly depend on each other
- 🔴 **Hard to maintain** - Changes affect multiple classes
- 🔴 **Rigid design** - Can't add/remove observers easily
- 🔴 **Update propagation** - Manual notification is error-prone

**Example scenario:**
```java
// ❌ Bad: Tight coupling
class WeatherStation {
    void update() {
        display.update();
        logger.update();
        alert.update();
        // What if we add more? Need to modify this class!
    }
}
```

---

## ✅ Solution

Use **observers that subscribe to a subject** - the subject notifies all observers when state changes.

**Key components:**
- 📢 **Subject interface** - Manages observers and notifies them
- 👁️ **Observer interface** - Defines update method
- 🔧 **Concrete subject** - The object being observed
- 👀 **Concrete observers** - Objects that react to changes

---

## 🏗️ Structure

```
┌──────────────┐
│   Subject    │ ◄─── Interface
│ +attach()    │
│ +detach()    │
│ +notify()    │
└──────┬───────┘
       │
┌──────▼───────┐
│   Concrete   │
│   Subject    │
│ -observers   │
│ +setState()  │
└──────┬───────┘
       │ notifies
┌──────▼───────┐
│   Observer   │ ◄─── Interface
│  +update()   │
└──────┬───────┘
       │ implements
   ┌───┴────┐
   │        │
┌──▼──┐ ┌──▼──┐
│Obs A│ │Obs B│
└─────┘ └─────┘
```

---

## 🚀 Step-by-Step Implementation

1. **Create observer interface** - Define update method
2. **Create subject interface** - Define attach/detach/notify methods
3. **Implement concrete subject** - Maintains observer list and state
4. **Implement concrete observers** - React to state changes
5. **Notify observers** - Call update when state changes

### 💻 Example Code

```java
// 1. Observer Interface
public interface Observer {
    void update(String message);
}

// 2. Subject Interface
public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}

// 3. Concrete Subject
public class NewsAgency implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String news;
    
    public void setNews(String news) {
        this.news = news;
        notifyObservers(); // Notify all observers
    }
    
    public void attach(Observer observer) {
        observers.add(observer);
    }
    
    public void detach(Observer observer) {
        observers.remove(observer);
    }
    
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }
}

// 4. Concrete Observer
public class NewsChannel implements Observer {
    private String news;
    
    @Override
    public void update(String news) {
        this.news = news;
        display();
    }
    
    public void display() {
        System.out.println("Breaking: " + news);
    }
}

// 5. Usage
NewsAgency agency = new NewsAgency();
NewsChannel channel1 = new NewsChannel();
NewsChannel channel2 = new NewsChannel();

agency.attach(channel1);
agency.attach(channel2);

agency.setNews("Important news!"); // Both channels notified
```

---

## 🎯 When to Use

✅ **Perfect for:**
- **Event handling** - React to events
- **UI updates** - Update views when model changes
- **Distributed systems** - Notify multiple services
- **Model-View architecture** - MVC, MVP patterns
- **Publish-Subscribe** - Decouple publishers and subscribers
- **Real-time notifications** - Alert multiple recipients

❌ **Avoid when:**
- Too many observers (performance issues)
- Update order matters (can be unpredictable)
- Circular dependencies

---

## ✨ Advantages

- 🔗 **Loose coupling** - Subject doesn't know concrete observers
- 🔄 **Dynamic relationships** - Add/remove observers at runtime
- 📢 **Broadcast communication** - One change, many updates
- 🎯 **Open/Closed Principle** - Easy to add new observers
- 🔧 **Flexible** - Observers can be added/removed dynamically

---

## ⚠️ Disadvantages

- 🔄 **Unexpected updates** - Observers updated even if not needed
- ⚡ **Performance** - Many observers can be slow
- 🔀 **Update order** - Not guaranteed, can cause issues
- 🐛 **Memory leaks** - Forgot to detach observers
- 🎓 **Complexity** - Can become complex with many observers

---

## 🌟 Real-World Examples

- 📰 **News Subscriptions** - Subscribe to news, get notified of updates
- 📱 **Social Media** - Follow users, get notified of posts
- 🛒 **E-commerce** - Notify customers of price drops, new products
- 🎮 **Game Development** - Notify UI of game state changes
- 📊 **Stock Market** - Notify traders of price changes
- 🎓 **Learning Platforms** - Notify students of new courses

---

## 📁 Implementations

This repository includes:

- 📚 **Learning Observer** - Notify students when new courses are available
- 🛒 **Shopping Observer** - Alert customers about price drops and new products

---

## 🔄 Push vs Pull Model

### Push Model
- Subject sends all data to observers
- Observers receive everything (even if not needed)
- More efficient if observers need all data

### Pull Model
- Subject only notifies that change occurred
- Observers pull data they need
- More flexible, observers get only what they need

```java
// Push: Send all data
observer.update(temperature, humidity, pressure);

// Pull: Just notify, observer gets data
observer.update();
int temp = subject.getTemperature();
```

---

## 💡 Best Practices

1. **Use interfaces** - Subject and Observer should be interfaces
2. **Manage lifecycle** - Always detach observers when done
3. **Handle errors** - Don't let one observer break others
4. **Consider thread safety** - If used in multi-threaded environments
5. **Document update contract** - What data is sent, when updates occur

---

## 🔗 Related Patterns

- **Mediator** - Coordinates communication (more complex)
- **Chain of Responsibility** - Pass requests along chain
- **Command** - Can use Observer for undo/redo
- **MVC** - Observer is key component of MVC

---

<div align="center">

**Stay connected, stay informed! 👁️✨**

</div>
