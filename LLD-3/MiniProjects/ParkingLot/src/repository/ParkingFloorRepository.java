package repository;

import exception.ParkingFloorNotFoundException;
import models.ParkingFloor;

import java.util.HashMap;
import java.util.Map;

public class ParkingFloorRepository {
     private final Map<Integer, ParkingFloor> parkingFloorMap;

     public ParkingFloorRepository(){
         this.parkingFloorMap = new HashMap<>();
     }

     public ParkingFloor get(int parkingFloorId){
         ParkingFloor parkingFloor = parkingFloorMap.get(parkingFloorId);
         if (parkingFloor == null){
             throw new ParkingFloorNotFoundException("ParkingFloor not found for id " + parkingFloorId);
         }
         return parkingFloor;
     }

     public void put(ParkingFloor parkingFloor){
         parkingFloorMap.put(parkingFloor.getId(), parkingFloor);
         System.out.println("ParkingFloor has been added successfully");
     }
}
