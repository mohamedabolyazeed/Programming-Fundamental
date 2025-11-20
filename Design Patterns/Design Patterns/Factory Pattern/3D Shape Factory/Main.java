
public class Main {

    public static void main(String[] args) {
        Shape3D shape = Shape3DFactory.createShape("CUBE");
        System.out.println(shape.getName());
        System.out.println(shape.volume());

        shape = Shape3DFactory.createShape("SPHERE");
        System.out.println(shape.getName());
        System.out.println(shape.volume());

        shape = Shape3DFactory.createShape("CYLINDER");
        System.out.println(shape.getName());
        System.out.println(shape.volume());
    }
}
