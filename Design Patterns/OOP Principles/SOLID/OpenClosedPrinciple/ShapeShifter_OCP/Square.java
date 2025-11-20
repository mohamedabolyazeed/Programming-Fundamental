
public class Square extends Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square [side = " + side + "]");
    }

    @Override
    public double area() {
        return side * side;
    }
}
