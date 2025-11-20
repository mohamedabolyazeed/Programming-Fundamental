
public class Cube implements Shape3D {

    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double volume() {
        return side * side * side;
    }

    public String getName() {
        return "Cube";
    }
}
