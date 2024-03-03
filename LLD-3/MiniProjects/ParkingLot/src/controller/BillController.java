package controller;

import exception.InvalidRequestException;
import models.Bill;
import service.BillService;

public class BillController {
    private BillService billService;

    public BillController(BillService billService) {
        this.billService = billService;
    }

    public Bill generateBill(int ticketId, int exitGateId){
        if (ticketId < 1 && exitGateId < 1){
            throw new InvalidRequestException("Please Enter the Valid Request");
        }
        return billService.generateBill(ticketId, exitGateId);
    }
}

