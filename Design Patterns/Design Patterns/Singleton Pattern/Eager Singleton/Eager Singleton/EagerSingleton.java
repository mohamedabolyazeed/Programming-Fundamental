
public class EagerSingleton {

    private static EagerSingleton oneInstance = new EagerSingleton();

    private EagerSingleton() {
        System.out.println("EagerSingleton instance created");
    }

    public static EagerSingleton getInstance() {
        return oneInstance;
    }

    public String getMessage() {
        return "Hello from Eager Singleton!";
    }
}
