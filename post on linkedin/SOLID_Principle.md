# 💡 SOLID Principles — Detailed Java Guide

SOLID Principles هي خمس قواعد أساسية في **OOP** بتخلي الكود:

* **Clean**
* **Scalable**
* **Maintainable**
* **Testable**

باتباعهم، الكود هيبقى **مرن، قابل للتطوير، وأسهل للصيانة**.

---

## 🔹 1. Single Responsibility Principle (SRP)

**المبدأ:** كل Class لازم يكون له **سبب واحد للتغيير**.
**الفائدة:** يقلل التعقيد، يسهل الصيانة والاختبار.

**Example:** إدارة مخبز

```java
// Class responsible for baking bread
class BreadBaker {
    public void bakeBread() {
        System.out.println("Baking high-quality bread...");
    }
}

// Class responsible for inventory management
class InventoryManager {
    public void manageInventory() {
        System.out.println("Managing inventory...");
    }
}

// Class responsible for serving customers
class CustomerService {
    public void serveCustomer() {
        System.out.println("Serving customers...");
    }
}

public class MainSRP {
    public static void main(String[] args) {
        BreadBaker baker = new BreadBaker();
        InventoryManager inventory = new InventoryManager();
        CustomerService service = new CustomerService();

        baker.bakeBread();
        inventory.manageInventory();
        service.serveCustomer();
    }
}
```

---

## 🔹 2. Open/Closed Principle (OCP)

**المبدأ:** الكود **Open for extension, Closed for modification**.
**الفائدة:** يمكن إضافة Features جديدة بدون تعديل الكود القديم.

```java
abstract class PaymentProcessor {
    public abstract void processPayment(double amount);
}

class CreditCardPaymentProcessor extends PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

// New feature without changing existing code
class PayPalPaymentProcessor extends PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

public class MainOCP {
    public static void processPayment(PaymentProcessor processor, double amount) {
        processor.processPayment(amount);
    }

    public static void main(String[] args) {
        CreditCardPaymentProcessor creditCard = new CreditCardPaymentProcessor();
        PayPalPaymentProcessor paypal = new PayPalPaymentProcessor();

        processPayment(creditCard, 100.0);
        processPayment(paypal, 150.0);
    }
}
```

---

## 🔹 3. Liskov Substitution Principle (LSP)

**المبدأ:** أي Subclass لازم تقدر تحل محل الـParent بدون كسر السيستم.
**الفائدة:** الحفاظ على ثبات الكود عند الوراثة.

```java
class Rectangle {
    protected double width, height;

    public Rectangle(double w, double h) { width = w; height = h; }

    public double area() { return width * height; }

    public void setWidth(double w) { width = w; }
    public void setHeight(double h) { height = h; }
}

class Square extends Rectangle {
    public Square(double size) { super(size, size); }

    @Override
    public void setWidth(double w) { width = height = w; }
    @Override
    public void setHeight(double h) { width = height = h; }
}

public class MainLSP {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        System.out.println("Rectangle area: " + rect.area());

        Rectangle square = new Square(5);
        square.setWidth(10);
        System.out.println("Square area: " + square.area());
    }
}
```

---

## 🔹 4. Interface Segregation Principle (ISP)

**المبدأ:** لا تجبر الـClients على تنفيذ واجهات غير مطلوبة.
**الفائدة:** Classes أصغر وأكثر تركيزاً، يقلل الـUnused Methods.

```java
import java.util.*;

interface IVegetarianMenu { List<String> getVegetarianItems(); }
interface INonVegetarianMenu { List<String> getNonVegetarianItems(); }

class VegetarianMenu implements IVegetarianMenu {
    public List<String> getVegetarianItems() {
        return Arrays.asList("Paneer Tikka", "Salad", "Vegetable Curry");
    }
}

class NonVegetarianMenu implements INonVegetarianMenu {
    public List<String> getNonVegetarianItems() {
        return Arrays.asList("Chicken Curry", "Fish Fry", "Mutton Biryani");
    }
}

public class MainISP {
    public static void main(String[] args) {
        IVegetarianMenu vegMenu = new VegetarianMenu();
        INonVegetarianMenu nonVegMenu = new NonVegetarianMenu();

        System.out.println("Vegetarian Menu: " + vegMenu.getVegetarianItems());
        System.out.println("Non-Vegetarian Menu: " + nonVegMenu.getNonVegetarianItems());
    }
}
```

---

## 🔹 5. Dependency Inversion Principle (DIP)

**المبدأ:** اعتمد على **Abstractions** مش على Classes جاهزة.
**الفائدة:** يسهل تغيير Implementation بدون التأثير على الكود العالي المستوى.

```java
interface IVersionControl {
    void commit(String message);
    void push();
    void pull();
}

class GitVersionControl implements IVersionControl {
    public void commit(String message) { System.out.println("Committing changes: " + message); }
    public void push() { System.out.println("Pushing changes to Git."); }
    public void pull() { System.out.println("Pulling changes from Git."); }
}

class DevelopmentTeam {
    private IVersionControl versionControl;

    public DevelopmentTeam(IVersionControl vc) { this.versionControl = vc; }

    public void makeCommit(String message) { versionControl.commit(message); }
    public void performPush() { versionControl.push(); }
    public void performPull() { versionControl.pull(); }
}

public class MainDIP {
    public static void main(String[] args) {
        IVersionControl git = new GitVersionControl();
        DevelopmentTeam team = new DevelopmentTeam(git);

        team.makeCommit("Initial commit");
        team.performPush();
        team.performPull();
    }
}
```

---

### 📝 Summary

باتباع **SOLID Principles**:

* كودك هيبقى **مرن وقابل للتطوير**
* أسهل في **الصيانة والاختبار**
* **منظم وواضح** لكل اللي هيشتغلوا عليه بعدك

> ده الأساس قبل أي Design Patterns زي Singleton، Factory، Observer أو غيرهم.

