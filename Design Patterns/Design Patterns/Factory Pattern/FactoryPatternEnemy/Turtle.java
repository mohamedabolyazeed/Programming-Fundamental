
public class Turtle implements Enemy {

    @Override
    public String name() {
        return "Turtle";
    }

    @Override
    public int damage() {
        return 5;
    }

    @Override
    public int health() {
        return 100;
    }
}
