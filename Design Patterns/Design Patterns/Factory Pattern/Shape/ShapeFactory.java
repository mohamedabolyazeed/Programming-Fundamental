
public class ShapeFactory {

    public static Shape getShape(String Type) {

        if (Type == null) {
            return null;
        }
        if (Type.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        if (Type.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        if (Type.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
