import controller.InitializationController;
import models.ParkingLot;
import repository.GateRepository;
import repository.ParkingFloorRepository;
import repository.ParkingLotRepository;
import repository.ParkingSpotRepository;
import service.InitializationService;

public class ParkingLotMain {
    public static void main(String[] args) {
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository();
        ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();
        GateRepository gateRepository = new GateRepository();

        InitializationService initializationService = new InitializationService(gateRepository, parkingLotRepository, parkingFloorRepository, parkingSpotRepository);

        InitializationController initializationController = new InitializationController(initializationService);
        ParkingLot parkingLot = initializationController.init();
        System.out.println("END");
    }
}