
public class VehicleFactory {
  public static Vehicle getInstance(String Type) {
    if (Type == null) return null;
    if (Type.equalsIgnoreCase("CAR")) return new Car();
    if (Type.equalsIgnoreCase("BIKE")) return new Bike();
    if (Type.equalsIgnoreCase("TRUCK")) return new Truck();
    return null;
  }
}
