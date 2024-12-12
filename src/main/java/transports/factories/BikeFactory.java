package transports.factories;

import transports.Bike;
import transports.Vehicle;

public class BikeFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle() {
        return new Bike();
    }
}
