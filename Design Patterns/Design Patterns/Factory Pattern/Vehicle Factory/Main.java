
public class Main {

    public static void main(String[] args) {
        System.out.println("Details of Car");
        Vehicle car = VehicleFactory.getInstance("CAR");
        car.move();
        car.type();
        System.out.println(" ");
        System.out.println("Details of Bike");
        Vehicle bike = VehicleFactory.getInstance("BIKE");
        bike.move();
        bike.type();
        System.out.println(" ");
        System.out.println("Details of Truck");
        Vehicle truck = VehicleFactory.getInstance("TRUCK");
        truck.move();
        truck.type();
    }
}
