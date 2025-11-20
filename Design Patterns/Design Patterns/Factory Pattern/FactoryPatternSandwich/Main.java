
public class Main {

    public static void main(String[] args) {
        SandWich sandwich1 = SandwichFactory.getSandwich("Cheese");
        if (sandwich1 != null) {
            sandwich1.name();
            sandwich1.calories();
        }

        SandWich sandwich2 = SandwichFactory.getSandwich("Chicken");
        if (sandwich2 != null) {
            sandwich2.name();
            sandwich2.calories();
        }

    }
}
