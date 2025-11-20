
public class Main {

    public static void main(String[] args) {
        InstantOneFactory instance1 = InstantOneFactory.oneinstance;
        InstantOneFactory instance2 = InstantOneFactory.oneinstance;

        System.out.println(instance1.hashCode());
        instance1.printdata();
        System.out.println(instance2.hashCode());
        instance2.printdata();
    }

}
