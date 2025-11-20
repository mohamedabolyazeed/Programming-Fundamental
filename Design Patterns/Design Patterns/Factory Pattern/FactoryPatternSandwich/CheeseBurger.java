
public class CheeseBurger implements SandWich {

    @Override
    public String name() {
        System.out.println("Cheese Burger");
        return "Cheese Burger";
    }

    @Override
    public int calories() {
        System.out.println("150");
        return 150;
    }
}
