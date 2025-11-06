package factorypattern;

public class FactoryPattern {

    public static void main(String[] args) {
        SandWich sandwich1 = SandwichFactory.createsandwich(SandwichFactory.CHEESE_BURGER);
        sandwich1.prepare();
        SandWich sandwich2 = SandwichFactory.createsandwich(SandwichFactory.CHICKEN_BURGER);
        sandwich2.prepare();
    }
    
}
