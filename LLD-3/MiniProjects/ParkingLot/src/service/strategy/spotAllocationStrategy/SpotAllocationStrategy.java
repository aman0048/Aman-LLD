package service.strategy.spotAllocationStrategy;

import models.ParkingSpot;
import models.Vehicle;

public interface SpotAllocationStrategy {
    ParkingSpot getSpotForVehicle(Vehicle vehicle);
}
