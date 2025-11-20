
public class Main {

    public static void main(String[] args) {
        ShapePrinter printer = new ShapePrinter();

        System.out.println("=== Drawing Different Shapes (Open/Closed Principle Demo) ===\n");

        // We can add as many new shapes as we want - NO changes to ShapePrinter!
        printer.drawShape(new Rectangle(10, 5));
        printer.drawShape(new Square(6));
        printer.drawShape(new Circle(4));
    }
}
