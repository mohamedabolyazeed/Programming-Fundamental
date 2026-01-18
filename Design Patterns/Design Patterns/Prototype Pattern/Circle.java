public class Circle implements Shape {
  private String type;
  private String color;
  private int radius;

  public Circle(String color, int radius) {
    this.type = "Circle";
    this.color = color;
    this.radius = radius;
  }

  private Circle(Circle source) {
    this.type = source.type;
    this.color = source.color;
    this.radius = source.radius;
  }

  @Override
  public Shape clone() {
    return new Circle(this);
  }

  @Override
  public String getType() {
    return type;
  }

  @Override
  public String toString() {
    return "Circle{" + "type='" + type + '\'' + ", color='"
        + color + '\'' + ", radius=" + radius + '}';
  }
}
