public class TemplatePattern {

  public static void main(String[] args) {
    System.out.println("Building Car");
    VehicleTemplate Car = new Car();
    Car.buildVechicle();

    System.out.println("--------------------------------");
    System.out.println("Building Truck");
    VehicleTemplate Truck = new Truck();
    Truck.buildVechicle();
  }
}
