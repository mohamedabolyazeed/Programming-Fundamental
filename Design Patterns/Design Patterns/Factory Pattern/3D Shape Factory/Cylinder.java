
public class Cylinder implements Shape3D {

    private double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }

    public String getName() {
        return "Cylinder";
    }
}
