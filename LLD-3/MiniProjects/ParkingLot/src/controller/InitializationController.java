package controller;

import models.ParkingLot;
import service.InitializationService;

public class InitializationController {
    private InitializationService initializationService;

    public InitializationController(InitializationService initializationService) {
        this.initializationService = initializationService;
    }

    public ParkingLot init(){
        return initializationService.init();
    }
}
