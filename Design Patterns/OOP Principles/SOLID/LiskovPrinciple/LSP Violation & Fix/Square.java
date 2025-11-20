
class Square implements Shape {

    private double side;

    public Square() {
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double area() {
        return side * side;
    }
}
