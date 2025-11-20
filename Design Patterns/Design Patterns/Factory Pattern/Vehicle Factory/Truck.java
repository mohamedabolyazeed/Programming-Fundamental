public class Truck implements Vehicle {

    @Override
    public void move() {
      System.out.println("Truck is moving");       
    }

    @Override
    public void type() {
      System.out.println("Truck is a type of vehicle");       
    }
}