
package prototypepattern;

public class Rectangle implements Shape{
    private String type;
    private String color;
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        this.type = "Rectangle";
        this.color = color;
        this.width = width;
        this.height = height;
    }

    private Rectangle(Rectangle source) {
        this.type = source.type;
        this.color = source.color;
        this.width = source.width;
        this.height = source.height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "type='" + type + '\'' + ", color='" 
                + color + '\'' + ", width=" + width + ", height=" + height + '}';
    }
}
