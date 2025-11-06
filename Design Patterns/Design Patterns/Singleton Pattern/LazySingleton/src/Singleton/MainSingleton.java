package Singleton;


public class MainSingleton {

    public static void main(String[] args) {
        LazySingleton instance1 = LazySingleton.getinstance();
        LazySingleton instance2 = LazySingleton.getinstance();
        
        System.out.println(instance1.hashCode());
        instance1.printdata();
        System.out.println(instance2.hashCode());
        instance2.printdata();
    }
    
}
