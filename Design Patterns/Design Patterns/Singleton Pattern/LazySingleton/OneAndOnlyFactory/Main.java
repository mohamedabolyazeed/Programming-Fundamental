
public class Main {

    public static void main(String[] args) {
        OneAndOnlyFactory instance1 = OneAndOnlyFactory.getinstance();
        OneAndOnlyFactory instance2 = OneAndOnlyFactory.getinstance();

        System.out.println(instance1.hashCode());
        instance1.printdata();
        System.out.println(instance2.hashCode());
        instance2.printdata();
    }

}
