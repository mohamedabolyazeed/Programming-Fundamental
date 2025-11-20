
public class Main {

    public static void main(String[] args) {
        System.out.println("Eager Singleton");
        EagerSingleton s1 = EagerSingleton.getInstance();
        EagerSingleton s2 = EagerSingleton.getInstance();
        System.out.println("Message: " + s1.getMessage());
        System.out.println("s1 hashCode: " + s1.hashCode());
        System.out.println("s2 hashCode: " + s2.hashCode());
        System.out.println("Same object? " + (s1 == s2));
    }
}
