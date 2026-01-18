public abstract class VehicleTemplate {
  public final void buildVechicle() {
    collectComponent();
    integrateComponent();
    installGearBox();
    startVehicle();
    System.out.println("Vehicle is on");
  }

  protected abstract void integrateComponent();

  protected abstract void installGearBox();

  private void collectComponent() {
    System.out.println("Bring rear, front lights, tires ");
  }

  private void startVehicle() {
    System.out.println("Engine is powering Up");
  }
}
