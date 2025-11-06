# Object-Oriented Programming (OOP) Principles

## 1. Constructor

### Definition

A **constructor** is a special method that is automatically called when an object of a class is created. It initializes the object's properties and sets up the initial state.

### Key Characteristics

- Has the same name as the class
- No return type (not even void)
- Called automatically upon object creation
- Can be overloaded (multiple constructors with different parameters)

### Example

```java
public class Car {
    private String brand;
    private String model;
    private int year;
    private int mileage;
    
    // Default Constructor
    public Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 2024;
        this.mileage = 0;
    }
    
    // Parameterized Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = 0;
    }
    
    // Copy Constructor
    public Car(Car other) {
        this.brand = other.brand;
        this.model = other.model;
        this.year = other.year;
        this.mileage = other.mileage;
    }
    
    public void displayInfo() {
        System.out.println(year + " " + brand + " " + model);
    }
    
    public static void main(String[] args) {
        // Using different constructors
        Car car1 = new Car("Toyota", "Camry", 2023);
        Car car2 = new Car("Tesla", "Model 3", 2024);
        Car car3 = new Car(); // Default constructor
        Car car4 = new Car(car1); // Copy constructor
        
        car1.displayInfo(); // Output: 2023 Toyota Camry
        car2.displayInfo(); // Output: 2024 Tesla Model 3
        car3.displayInfo(); // Output: 2024 Unknown Unknown
        car4.displayInfo(); // Output: 2023 Toyota Camry
    }
}
```

### Types of Constructors

- **Default Constructor**: No parameters
- **Parameterized Constructor**: Takes parameters to initialize with custom values
- **Copy Constructor**: Creates a new object as a copy of an existing object

---

## 2. Encapsulation

### Definition

**Encapsulation** is the bundling of data (attributes) and methods that operate on that data within a single unit (class), while restricting direct access to some of the object's components. It's like putting data in a capsule.

### Key Concepts

- **Data Hiding**: Private variables cannot be accessed directly from outside
- **Access Modifiers**: public, private, protected
- **Getters and Setters**: Controlled access to private data

### Benefits

- Protects data integrity
- Increases security
- Makes code more maintainable
- Provides flexibility to change implementation

### Example

```java
public class BankAccount {
    // Private attributes (hidden from outside)
    private String accountNumber;
    private double balance;
    private String ownerName;
    
    // Constructor
    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }
    
    // Getter method - controlled read access
    public double getBalance() {
        return balance;
    }
    
    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }
    
    // Getter for owner name
    public String getOwnerName() {
        return ownerName;
    }
    
    // Setter method with validation - controlled write access
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". Remaining balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds!");
        }
    }
    
    public void displayAccountInfo() {
        System.out.println("Account: " + accountNumber);
        System.out.println("Owner: " + ownerName);
        System.out.println("Balance: $" + balance);
    }
    
    public static void main(String[] args) {
        BankAccount account = new BankAccount("ACC12345", "John Doe", 1000);
        
        // Cannot access directly: account.balance (will cause compilation error)
        System.out.println("Current Balance: $" + account.getBalance());
        
        account.deposit(500);   // Deposited $500. New balance: $1500
        account.withdraw(200);  // Withdrew $200. Remaining balance: $1300
        account.withdraw(2000); // Invalid withdrawal amount or insufficient funds!
        
        account.displayAccountInfo();
    }
}
```

---

## 3. Inheritance

### Definition

**Inheritance** is a mechanism where a new class (child/derived class) acquires properties and behaviors from an existing class (parent/base class). It represents an "IS-A" relationship.

### Key Concepts

- **Parent/Base/Super Class**: The class being inherited from
- **Child/Derived/Sub Class**: The class that inherits
- **Code Reusability**: Avoid writing duplicate code
- **Method Overriding**: Child can provide specific implementation
- **super keyword**: Used to call parent class methods and constructors

### Types of Inheritance in Java

- **Single Inheritance**: One parent, one child
- **Multilevel Inheritance**: Chain of inheritance (grandparent → parent → child)
- **Hierarchical Inheritance**: One parent, multiple children
- **Note**: Java does NOT support multiple inheritance with classes (but supports it with interfaces)

### Example

```java
// Base class (Parent)
class Animal {
    protected String name;
    protected int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void eat() {
        System.out.println(name + " is eating...");
    }
    
    public void sleep() {
        System.out.println(name + " is sleeping...");
    }
    
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Derived class 1 (Child)
class Dog extends Animal {
    private String breed;
    
    public Dog(String name, int age, String breed) {
        super(name, age); // Call parent constructor
        this.breed = breed;
    }
    
    // Method overriding
    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof! Woof!");
    }
    
    // New method specific to Dog
    public void fetch() {
        System.out.println(name + " is fetching the ball!");
    }
    
    public void wagTail() {
        System.out.println(name + " is wagging its tail!");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }
}

// Derived class 2 (Child)
class Cat extends Animal {
    private String color;
    
    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }
    
    // Method overriding
    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }
    
    // New method specific to Cat
    public void scratch() {
        System.out.println(name + " is scratching the furniture!");
    }
    
    public void purr() {
        System.out.println(name + " is purring softly...");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Color: " + color);
    }
}

// Derived class 3 (Child)
class Bird extends Animal {
    private double wingSpan;
    
    public Bird(String name, int age, double wingSpan) {
        super(name, age);
        this.wingSpan = wingSpan;
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " says: Chirp! Chirp!");
    }
    
    public void fly() {
        System.out.println(name + " is flying in the sky!");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Wing Span: " + wingSpan + " cm");
    }
}

// Main class to test inheritance
public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("=== Dog Demo ===");
        Dog dog = new Dog("Max", 3, "Golden Retriever");
        dog.displayInfo();
        dog.eat();         // Inherited method
        dog.makeSound();   // Overridden method
        dog.fetch();       // Dog-specific method
        dog.wagTail();
        
        System.out.println("\n=== Cat Demo ===");
        Cat cat = new Cat("Whiskers", 2, "Orange");
        cat.displayInfo();
        cat.sleep();       // Inherited method
        cat.makeSound();   // Overridden method
        cat.scratch();     // Cat-specific method
        cat.purr();
        
        System.out.println("\n=== Bird Demo ===");
        Bird bird = new Bird("Tweety", 1, 25.5);
        bird.displayInfo();
        bird.eat();        // Inherited method
        bird.makeSound();  // Overridden method
        bird.fly();        // Bird-specific method
    }
}
```

---

## 4. Polymorphism

### Definition

**Polymorphism** means "many forms". It allows objects of different classes to be treated as objects of a common parent class, and it enables the same method to behave differently based on the object calling it.

### Key Concepts

- **Method Overriding** (Runtime Polymorphism): Same method name in parent and child, different implementations
- **Method Overloading** (Compile-time Polymorphism): Same method name with different parameters
- **Dynamic Method Dispatch**: Method call is resolved at runtime

### Types

- **Compile-time Polymorphism**: Method overloading, operator overloading
- **Runtime Polymorphism**: Method overriding

### Benefits

- Flexibility in code
- Code reusability
- Easy to extend and maintain
- Loose coupling

### Example 1: Method Overriding (Runtime Polymorphism)

```java
// Base class
abstract class Shape {
    protected String color;
    
    public Shape(String color) {
        this.color = color;
    }
    
    // Abstract methods to be overridden
    public abstract double area();
    public abstract double perimeter();
    
    public void displayColor() {
        System.out.println("Color: " + color);
    }
}

// Derived class 1
class Rectangle extends Shape {
    private double width;
    private double height;
    
    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }
    
    @Override
    public double area() {
        return width * height;
    }
    
    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}

// Derived class 2
class Circle extends Shape {
    private double radius;
    
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// Derived class 3
class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;
    
    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    @Override
    public double area() {
        // Using Heron's formula
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    
    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}

// Main class demonstrating polymorphism
class PolymorphismDemo1 {
    public static void main(String[] args) {
        // Polymorphism: Parent reference, child objects
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle("Red", 5, 10);
        shapes[1] = new Circle("Blue", 7);
        shapes[2] = new Triangle("Green", 3, 4, 5);
        
        System.out.println("=== Polymorphism in Action ===\n");
        
        // Same method call, different behavior
        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + ":");
            shape.displayColor();
            System.out.printf("  Area: %.2f\n", shape.area());
            System.out.printf("  Perimeter: %.2f\n", shape.perimeter());
            System.out.println();
        }
    }
}
```

### Example 2: Method Overloading (Compile-time Polymorphism)

```java
class Calculator {
    // Method overloading - same name, different parameters
    
    // Method 1: Add two integers
    public int add(int a, int b) {
        System.out.println("Adding two integers");
        return a + b;
    }
    
    // Method 2: Add three integers
    public int add(int a, int b, int c) {
        System.out.println("Adding three integers");
        return a + b + c;
    }
    
    // Method 3: Add two doubles
    public double add(double a, double b) {
        System.out.println("Adding two doubles");
        return a + b;
    }
    
    // Method 4: Concatenate two strings
    public String add(String a, String b) {
        System.out.println("Concatenating two strings");
        return a + b;
    }
}

class OverloadingDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("Result: " + calc.add(5, 10));           // Calls method 1
        System.out.println("Result: " + calc.add(5, 10, 15));       // Calls method 2
        System.out.println("Result: " + calc.add(5.5, 10.5));       // Calls method 3
        System.out.println("Result: " + calc.add("Hello ", "World")); // Calls method 4
    }
}
```

### Example 3: Polymorphism with Payment System

```java
// Base class
abstract class Payment {
    protected double amount;
    
    public Payment(double amount) {
        this.amount = amount;
    }
    
    // Abstract method to be implemented by subclasses
    public abstract void processPayment();
    
    public void displayAmount() {
        System.out.println("Amount: $" + amount);
    }
}

// Derived class 1
class CreditCardPayment extends Payment {
    private String cardNumber;
    private String cardHolderName;
    
    public CreditCardPayment(double amount, String cardNumber, String cardHolderName) {
        super(amount);
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }
    
    @Override
    public void processPayment() {
        System.out.println("Processing Credit Card Payment");
        System.out.println("Card Holder: " + cardHolderName);
        System.out.println("Card ending in: " + cardNumber.substring(cardNumber.length() - 4));
        displayAmount();
        System.out.println("Payment authorized and completed!");
    }
}

// Derived class 2
class PayPalPayment extends Payment {
    private String email;
    
    public PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }
    
    @Override
    public void processPayment() {
        System.out.println("Processing PayPal Payment");
        System.out.println("PayPal Account: " + email);
        displayAmount();
        System.out.println("Payment sent successfully!");
    }
}

// Derived class 3
class BitcoinPayment extends Payment {
    private String walletAddress;
    
    public BitcoinPayment(double amount, String walletAddress) {
        super(amount);
        this.walletAddress = walletAddress;
    }
    
    @Override
    public void processPayment() {
        System.out.println("Processing Bitcoin Payment");
        System.out.println("Wallet: " + walletAddress.substring(0, 8) + "...");
        displayAmount();
        System.out.println("Transaction confirmed on blockchain!");
    }
}

// Main class demonstrating polymorphism
class PaymentDemo {
    // Polymorphic method - accepts any Payment type
    public static void checkout(Payment payment) {
        payment.processPayment();
        System.out.println("----------------------------");
    }
    
    public static void main(String[] args) {
        System.out.println("=== Payment System Demo ===\n");
        
        // Different payment methods, same interface
        Payment creditCard = new CreditCardPayment(100, "1234-5678-9012-3456", "John Doe");
        Payment paypal = new PayPalPayment(75, "user@example.com");
        Payment bitcoin = new BitcoinPayment(50, "1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa");
        
        // Polymorphism in action
        checkout(creditCard);  // Uses CreditCardPayment implementation
        checkout(paypal);      // Uses PayPalPayment implementation
        checkout(bitcoin);     // Uses BitcoinPayment implementation
    }
}
```

---

## Summary Comparison

| Principle | Key Concept | Real-World Analogy | Java Keywords |
|-----------|-------------|-------------------|---------------|
| **Constructor** | Initializes object state | Setting up a new phone when you first turn it on | `new`, `this`, overloading |
| **Encapsulation** | Data hiding and protection | A medicine capsule that protects ingredients inside | `private`, `public`, `protected`, getters/setters |
| **Inheritance** | Code reusability through parent-child relationship | Children inheriting traits from parents | `extends`, `super`, `@Override` |
| **Polymorphism** | Same interface, different implementations | A universal remote that works with different devices | `@Override`, method overloading, `abstract` |

---

## Best Practices

### Constructor

- Keep constructors simple and focused on initialization
- Use `this()` to call other constructors in the same class
- Validate input parameters in constructors
- Consider using builder pattern for objects with many parameters

### Encapsulation

- Make attributes private by default
- Provide public getters/setters only when necessary
- Validate data in setter methods
- Use meaningful names for getters and setters
- Consider using immutable objects when possible

### Inheritance

- Use inheritance for "IS-A" relationships only
- Don't create deep inheritance hierarchies (prefer composition)
- Use `@Override` annotation to avoid mistakes
- Call `super()` constructor when needed
- Make classes `final` if they shouldn't be extended

### Polymorphism

- Program to interfaces/abstract classes, not implementations
- Use abstract classes for common behavior
- Use interfaces for contracts
- Avoid instanceof checks; use polymorphism instead
- Keep methods focused and single-purpose

---

## Additional Concepts

### Abstract Classes vs Interfaces

**Abstract Class:**

- Can have both abstract and concrete methods
- Can have instance variables
- Can have constructors
- Use `extends` keyword (single inheritance)
- Use when classes share common behavior

**Interface:**

- All methods are abstract by default (before Java 8)
- Can only have constants (static final variables)
- No constructors
- Use `implements` keyword (multiple inheritance)
- Use for defining contracts

### Example

```java
// Abstract class
abstract class Vehicle {
    protected String brand;
    
    public Vehicle(String brand) {
        this.brand = brand;
    }
    
    public abstract void start();
    
    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Interface
interface Electric {
    void charge();
    int getBatteryLevel();
}

// Class implementing both
class TeslaCar extends Vehicle implements Electric {
    private int batteryLevel;
    
    public TeslaCar(String brand) {
        super(brand);
        this.batteryLevel = 100;
    }
    
    @Override
    public void start() {
        System.out.println("Tesla starting silently...");
    }
    
    @Override
    public void charge() {
        batteryLevel = 100;
        System.out.println("Tesla fully charged!");
    }
    
    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }
}
```

---

## Common Interview Questions

### 1. What is the difference between constructor and method?

- Constructor has no return type, method has return type
- Constructor is called automatically when object is created
- Constructor name must match class name
- Methods perform operations, constructors initialize objects

### 2. Why do we need encapsulation?

- Data protection and security
- Flexibility to change implementation
- Better control over data
- Easy maintenance

### 3. What is the difference between method overloading and overriding?

- **Overloading**: Same method name, different parameters (compile-time)
- **Overriding**: Same method signature in parent and child (runtime)

### 4. Can we override static methods?

- No, static methods cannot be overridden (they can be hidden)
- Static methods belong to the class, not instances

### 5. What is the difference between abstract class and interface?

- Abstract class can have concrete methods, interface cannot (before Java 8)
- A class can extend only one abstract class but implement multiple interfaces
- Abstract class can have constructors, interface cannot
