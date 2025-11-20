
public class SandwichFactory {

    public static SandWich getSandwich(String Type) {
        if (Type == null) return null;
        if (Type == "Chicken") return new ChickenBurger();
        if (Type == "Cheese") return new CheeseBurger();
        return null;
    }
}
