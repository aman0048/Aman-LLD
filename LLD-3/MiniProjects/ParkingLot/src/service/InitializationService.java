package service;

import models.Gate;
import models.ParkingFloor;
import models.ParkingLot;
import models.ParkingSpot;
import models.enums.*;
import repository.GateRepository;
import repository.ParkingFloorRepository;
import repository.ParkingLotRepository;
import repository.ParkingSpotRepository;

import java.util.ArrayList;
import java.util.List;

public class InitializationService {

    private GateRepository gateRepository;
    private ParkingLotRepository parkingLotRepository;
    private ParkingFloorRepository parkingFloorRepository;
    private ParkingSpotRepository parkingSpotRepository;

    public InitializationService(GateRepository gateRepository, ParkingLotRepository parkingLotRepository, ParkingFloorRepository parkingFloorRepository, ParkingSpotRepository parkingSpotRepository) {
        this.gateRepository = gateRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.parkingFloorRepository = parkingFloorRepository;
        this.parkingSpotRepository = parkingSpotRepository;
    }

    public ParkingLot init(){
        System.out.println("**** Initialization Started ****");
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setName("Aman Parking Center");
        parkingLot.setAddress("Somewhere inside a costly mall");
        parkingLot.setParkingLotStatus(ParkingLotStatus.OPEN);
        parkingLot.setCapacity(100);
        parkingLot.setVehicleTypesSupported(List.of(VehicleType.FOUR_WHEELER, VehicleType.TWO_WHEELER));
        List<ParkingFloor> parkingFloorList = new ArrayList<>();

        for (int i = 1; i<=10; i++){
            ParkingFloor parkingFloor = new ParkingFloor();
            parkingFloor.setParkingFloorStatus(ParkingFloorStatus.AVAILABLE);
            parkingFloor.setFloorNumber(i);
            List<ParkingSpot> parkingSpots = new ArrayList<>();
            for (int j = 1; j <= 10; j++){
                ParkingSpot parkingSpot = new ParkingSpot();
                parkingSpot.setNumber((i*100) + j);
                parkingSpot.setParkingSpotStatus(ParkingSpotStatus.EMPTY);
                parkingSpot.setVehicleType(VehicleType.FOUR_WHEELER);
                parkingSpots.add(parkingSpot);
                parkingSpotRepository.put(parkingSpot);
            }
            parkingFloor.setParkingSpots(parkingSpots);
            Gate entryGate = new Gate();
            entryGate.setId((i*1000) + 1);
            entryGate.setGateNumber((i*100) + 1);
            entryGate.setGateStatus(GateStatus.OPEN);
            entryGate.setGateType(GateType.ENTRY);
            entryGate.setOperatorName("Operator is: " + i+1);
            parkingFloor.setEntryGate(entryGate);
            gateRepository.put(entryGate);

            Gate exitGate = new Gate();
            exitGate.setId((i*1000) + 2);
            exitGate.setGateNumber((i*100) + 2);
            exitGate.setGateStatus(GateStatus.OPEN);
            exitGate.setGateType(GateType.EXIT);
            exitGate.setOperatorName("Operator is: " + i+2);
            parkingFloor.setExitGate(entryGate);
            parkingFloorList.add(parkingFloor);
            parkingFloorRepository.put(parkingFloor);
            gateRepository.put(exitGate);
        }
        parkingLot.setFloors(parkingFloorList);
        parkingLotRepository.put(parkingLot);
        return parkingLot;
    }
}
