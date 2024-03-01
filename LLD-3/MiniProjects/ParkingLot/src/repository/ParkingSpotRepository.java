package repository;

import exception.ParkingSpotNotFoundException;
import models.ParkingSpot;

import java.util.HashMap;
import java.util.Map;

public class ParkingSpotRepository {
     private final Map<Integer, ParkingSpot> parkingSpotMap;

     public ParkingSpotRepository(){
         this.parkingSpotMap = new HashMap<>();
     }

     public ParkingSpot get(int parkingSpotId){
         ParkingSpot parkingSpot = parkingSpotMap.get(parkingSpotId);
         if (parkingSpot == null){
             throw new ParkingSpotNotFoundException("ParkingSpot not found for id " + parkingSpotId);
         }
         return parkingSpot;
     }

     public void put(ParkingSpot parkingSpot){
         parkingSpotMap.put(parkingSpot.getId(), parkingSpot);
         System.out.println("ParkingSpot has been added successfully");
     }
}
