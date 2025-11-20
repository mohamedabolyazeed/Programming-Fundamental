public class Bike implements Vehicle {

    @Override
    public void move() {
      System.out.println("Bike is moving");       
    }

    @Override
    public void type() {
      System.out.println("Bike is a type of vehicle");       
    }
}