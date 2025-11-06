package Singleton;


public class MainSingleton {

    public static void main(String[] args) {
        EagerSingleton instance1 = EagerSingleton.oneinstance;
        EagerSingleton instance2 = EagerSingleton.oneinstance;
        
        System.out.println(instance1.hashCode());
        instance1.printdata();
        System.out.println(instance2.hashCode());
        instance2.printdata();
    }
    
}
