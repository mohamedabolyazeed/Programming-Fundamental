public class BicycleAdapter implements Vehicle {
  private Bicycle bike;

  public BicycleAdapter(Bicycle bike) {
    this.bike = bike;
  }

  @Override
  public void accelerate() {
    this.bike.pedal();
  }

  @Override
  public void pushbreak() {
    this.bike.stop();
  }

  @Override
  public void soundhorn() {
    this.bike.ringBell();
  }
}
