public class Truck extends VehicleTemplate {

  @Override
  protected void integrateComponent() {
    System.out.println("Adding extra Truck Container");
  }

  @Override
  protected void installGearBox() {
    System.out.println("Installing 6 gearbox for truck");
  }

}
