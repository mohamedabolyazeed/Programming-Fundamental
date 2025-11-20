public class Shape3DFactory {

    public static Shape3D createShape(String type) {
      if(type == null) return null;
      if(type.equalsIgnoreCase("CUBE")) return new Cube(5);
      if(type.equalsIgnoreCase("SPHERE")) return new Sphere(4);
      if(type.equalsIgnoreCase("CYLINDER")) return new Cylinder(3, 10);
      return null;
    }
}