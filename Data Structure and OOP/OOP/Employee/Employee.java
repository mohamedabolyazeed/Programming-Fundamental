/*
    OOP Concepts Used:
    1. Inheritance           (ready for extension)
    2. Instance Initializer Block  (executes before every constructor)
    3. Encapsulation          (private fields + public getters/setters)
    4. Immutable design ready (you can make fields final later)
 */
public class Employee {

    private String name;
    private int age;
    private int id;
    private boolean isMale;

    {
        System.out.println("Employee Details:");
    }

    // default constructor
    public Employee() {
    }

    public Employee(String name, int age, int id, boolean isMale) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.isMale = isMale;
    }

    // getters and setters...
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    public boolean getIsMale() {
        return isMale;
    }

    void printData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
        System.out.println("Gender: " + (isMale ? "Male" : "Female"));
    }
}
