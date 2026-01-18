public class Car extends VehicleTemplate {

  @Override
  protected void integrateComponent() {
    System.out.println("integrete Mirrors, Windows, Join the parts in the Car Body");
  }

  @Override
  protected void installGearBox() {
    System.out.println("Installing 5 shifts gear box");
  }

}
