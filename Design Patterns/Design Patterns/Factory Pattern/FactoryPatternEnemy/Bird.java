public class Bird implements Enemy {

    @Override
    public String name() {
        return "Bird";
    }

    @Override
    public int damage() {
        return 15;
    }

    @Override
    public int health() {
        return 50;
    }
}