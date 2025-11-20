
public class ChickenBurger implements SandWich {

    @Override
    public String name() {
        System.out.println("Chicken Burger");
        return "Chicken Burger";
    }
    @Override
    public int calories() {
        System.out.println("200");
        return 200;
    }
}
