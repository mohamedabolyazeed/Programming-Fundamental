# Singleton Pattern — Control the Creation, Control the System

Singleton Design Pattern — ليه كل Software Engineer لازم يفهمه؟

من أهم الـ Design Patterns اللي بنستخدمها يوميًا—حتى لو مش واخدين بالنا—هو الـ **Singleton Pattern**. دوره إنه يضمن وجود Instance واحدة بس من كلاس معيّن طول عمر التطبيق، وبالتالي يدّيك Centralized Control على الموارد الحساسة. ده مش مجرد Pattern محفوظ؛ ده Concept بيفرق بين Junior بيكتب كود وEngineer فاهم System Design.

> **One instance to rule them all** 🧙‍♂️  
> لو تحكمت في الإنشاء، هتتحكم في السيستم كله.

---

## 🎯 Purpose — ليه أصلاً بنستخدم Singleton؟

- Ensure One Instance per Application
- Provide Global Access Point
- Manage Shared Resources بكفاءة عالية

---

## 🔥 Real-World Use Cases

- Logging System → نفس الـ logger في كل مكان
- Configuration Manager → نقطة مركزية للإعدادات
- Database Connection/Pool → Connection واحدة أو Pool ثابت
- Caching System → Shared in-memory cache
- Thread Pools
- Print Spooler (طابعة واحدة، طابور واحد)
- Java Runtime (`java.lang.Runtime`) Singleton رسمي

---

## ⚙️ Key Features of Singleton

- Single Instance داخل الـ JVM
- Global Access Point واضح
- Lazy أو Eager Initialization على حسب الاحتياج
- Thread-Safe Implementation (لو احتجت)
- Resource Efficient
- Flexible: أكتر من طريقة للتنفيذ (Lazy, Eager, DCL, Static Inner…)

---

## 🧱 Key Components

1️⃣ **Static Member** — بيخزن الـ Instance الوحيدة.

```java
private static Singleton instance;
```

2️⃣ **Private Constructor** — يمنع أي حد من إنشاء الكلاس بإيده.

```java
private Singleton() {}
```

3️⃣ **Static Factory Method** — البوابة الرسمية للوصول للـ Instance.

```java
public static Singleton getInstance() {
    if (instance == null)
        instance = new Singleton();
    return instance;
}
```

---

## 🧩 Different Implementations

### 1. Lazy Initialization (Classic)

أبسط شكل… لكن مش Thread-Safe.

```java
class Singleton {
    private static Singleton obj;
    private Singleton() {}
    public static Singleton getInstance() {
        if (obj == null)
            obj = new Singleton();
        return obj;
    }
}
```

### 2. Thread-Safe Singleton (Synchronized)

آمن ضد الـ Threads، لكن أبطأ شوية بسبب `synchronized`.

```java
public static synchronized Singleton getInstance() {
    if (obj == null)
        obj = new Singleton();
    return obj;
}
```

### 3. Eager Initialization

Instance بتتعمل أثناء تحميل الكلاس (Thread-Safe تلقائيًا).

```java
class Singleton {
    private static final Singleton obj = new Singleton();
    private Singleton() {}
    public static Singleton getInstance() {
        return obj;
    }
}
```

### 4. Double-Checked Locking (Efficient)

أفضل توازن بين الأداء والأمان.

```java
class Singleton {
    private static volatile Singleton obj;
    private Singleton() {}
    public static Singleton getInstance() {
        if (obj == null) {
            synchronized (Singleton.class) {
                if (obj == null)
                    obj = new Singleton();
            }
        }
        return obj;
    }
}
```

### 5. Static Inner Class (Best in Java)

Guaranteed lazy + thread-safe بدون أي overhead.

```java
public class Singleton {
    private Singleton() {}
    private static class SingletonInner {
        private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance() {
        return SingletonInner.INSTANCE;
    }
}
```

---

## 📝 Example — Singleton in Action

```java
class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton Instantiated.");
    }

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }

    public static void doSomething() {
        System.out.println("Something is Done.");
    }
}

class GFG {
    public static void main(String[] args) {
        Singleton.getInstance().doSomething();
    }
}
```

```
Output:
Singleton Instantiated.
Something is Done.
```

---

## 🧠 When to Use Singleton؟

استخدمه لما:

- محتاج Instance واحدة بس تدير Resource مركزي
- في Shared State لازم يفضل ثابت
- عايز Central Resource Manager واضح
- محتاج تقرّر سلوك الكلاس قبل ما Clients يستهلكوه

⚠️ الإفراط في استخدامه = Hidden Dependencies + Testing أصعب.

---

## 🧭 Pros / Cons Snapshot

| الأسلوب      | الميزة          | العيب          |
| ------------ | --------------- | -------------- |
| Lazy         | بسيط            | مش Thread-Safe |
| Synchronized | آمن             | أبطأ           |
| Eager        | تحميل فوري      | استهلاك ريسورس |
| DCL          | أسرع + آمن      | أعقد في الفهم  |
| Static Inner | أفضل حل لـ Java | يعتمد على JVM  |

---

## 🔗 References

- https://refactoring.guru/design-patterns/singleton
- https://www.geeksforgeeks.org/singleton-design-pattern/

---

## 🏁 Summary

- Instance واحدة بس
- Global Access واضح
- Resource Optimization
- Thread Safety (حسب التنفيذ)
- Consistency في Logging / DB / Config
