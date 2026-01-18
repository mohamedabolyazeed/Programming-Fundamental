public class AdapterPattern {

  public static void main(String[] args) {
    System.out.println("Using Car :");
    Vehicle car = new Car();
    useVehicle(car);
    System.out.println("--------------------------------");
    System.out.println("Using Bicycle :");
    Vehicle bike = new BicycleAdapter(new Bicycle());
    useVehicle(bike);
  }

  public static void useVehicle(Vehicle vehicle) {
    vehicle.accelerate();
    vehicle.pushbreak();
    vehicle.soundhorn();
  }
}
