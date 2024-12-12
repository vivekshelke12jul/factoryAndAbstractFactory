import seaWays.Boat;
import seaWays.BoatFactory;
import transports.Vehicle;
import transports.factories.CarFactory;
import transports.factories.TruckFactory;
import transports.factories.VehicleFactory;

public class App {
    public static void main(String[] args) {

        VehicleFactory vehicleFactory = new BoatFactory();
        Vehicle vehicle = vehicleFactory.getVehicle();
        vehicle.drive();
    }
}
