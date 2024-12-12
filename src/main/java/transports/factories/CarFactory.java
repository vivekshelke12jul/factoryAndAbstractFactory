package transports.factories;

import transports.Car;
import transports.Vehicle;

public class CarFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle() {
        return new Car();
    }
}
