package service.strategy.spotAllocationStrategy;

import exception.ParkingSpotNotFoundException;
import exception.ParkingSpotNotFoundForVehicleException;
import models.ParkingFloor;
import models.ParkingLot;
import models.ParkingSpot;
import models.Vehicle;
import models.enums.ParkingSpotStatus;

import java.util.List;

public class LinearSpotAllocationStrategy implements SpotAllocationStrategy{
    @Override
    public ParkingSpot getSpotForVehicle(ParkingLot parkingLot, Vehicle vehicle) {
        List<ParkingFloor> parkingFloorList = parkingLot.getFloors();

        for (ParkingFloor parkingFloor : parkingFloorList){
            for (ParkingSpot parkingSpot : parkingFloor.getParkingSpots()){
                if (parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.EMPTY) &&
                    parkingSpot.getVehicleType().equals(vehicle.getVehicleType())){
                        return parkingSpot;
                }
            }
        }
        throw new ParkingSpotNotFoundForVehicleException("Please go home, eat and sleep");

    }
}
