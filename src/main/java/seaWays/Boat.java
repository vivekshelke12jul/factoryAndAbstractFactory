package seaWays;

import transports.Vehicle;

public class Boat implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a Boat");
    }
}
