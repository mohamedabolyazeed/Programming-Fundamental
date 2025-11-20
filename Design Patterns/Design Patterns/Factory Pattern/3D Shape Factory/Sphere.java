
public class Sphere implements Shape3D {

    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double volume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public String getName() {
        return "Sphere";
    }
}
