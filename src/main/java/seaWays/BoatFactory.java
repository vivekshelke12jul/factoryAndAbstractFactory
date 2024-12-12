package seaWays;

import transports.Vehicle;
import transports.factories.VehicleFactory;

public class BoatFactory implements VehicleFactory {
    @Override
    public Vehicle getVehicle() {
        return new Boat();
    }
}
