public class Car implements Vehicle {

    @Override
    public void move() {
      System.out.println("Car is moving");       
    }

    @Override
    public void type() {
      System.out.println("Car is a type of vehicle");       
    }
}