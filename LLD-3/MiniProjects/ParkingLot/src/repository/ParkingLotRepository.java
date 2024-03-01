package repository;

import exception.ParkingLotNotFoundException;
import models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
     private final Map<Integer, ParkingLot> parkingLotMap;
     private static int counter = 0;
     public ParkingLotRepository(){
         this.parkingLotMap = new HashMap<>();
     }

     public ParkingLot get(int parkingLotId){
         ParkingLot parkingLot = parkingLotMap.get(parkingLotId);
         if (parkingLot == null){
             throw new ParkingLotNotFoundException("ParkingLot not found for id " + parkingLotId);
         }
         return parkingLot;
     }

     public void put(ParkingLot parkingLot){
         parkingLot.setId(++counter);
         parkingLotMap.put(parkingLot.getId(), parkingLot);
         System.out.println("ParkingLot has been added successfully");
     }
}
