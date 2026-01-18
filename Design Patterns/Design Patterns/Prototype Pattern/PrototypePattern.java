package prototypepattern;

public class PrototypePattern {

    public static void main(String[] args) {
        ShapeRegistry registry = new ShapeRegistry();

        registry.registerShape("circle", new Circle("Red", 10));
        registry.registerShape("rectangle", new Rectangle("Blue", 20, 30));

        Shape circleFromRegistry = registry.getShape("circle");
        Shape rectangleFromRegistry = registry.getShape("rectangle");

        Shape circlePrototype = new Circle("Green", 15);
        Shape circleDirectClone = circlePrototype.clone();

        System.out.println("Circle from Registry: " + circleFromRegistry);
        System.out.println("Rectangle from Registry: " + rectangleFromRegistry);
        System.out.println("Circle Directly Cloned: " + circleDirectClone);

    }
}







