package transports.factories;

import transports.Truck;
import transports.Vehicle;

public class TruckFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle() {
        return new Truck();
    }
}
