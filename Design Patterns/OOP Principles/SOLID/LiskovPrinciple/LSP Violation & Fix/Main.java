
public class Main {

  public static void main(String[] args) {

    Rectangle rect = new Rectangle();
    Square sq = new Square();
    rect.setWidth(10);
    rect.setHeight(5);
    sq.setSide(6);
    System.out.println("Rectangle Width = " + rect.getWidth());
    System.out.println("Rectangle Height = " + rect.getHeight());
    System.out.println("Square Side = " + sq.getSide());
    System.out.println("Rectangle Area = " + rect.area());
    System.out.println("Square Area = " + sq.area());
  }
}
