
public class ShapePrinter {

    public void drawShape(Shape shape) {
        shape.draw();
        System.out.printf("Area: %.2f%n", shape.area());
        System.out.println("---");
    }
}
