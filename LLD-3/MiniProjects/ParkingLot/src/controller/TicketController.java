package controller;

import exception.InvalidRequestException;
import models.Ticket;
import models.Vehicle;
import service.TicketService;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public Ticket generateTicket(Vehicle vehicle, int gateId, int parkingLotId){
        if(gateId < 1 && parkingLotId < 1 ){
            throw new InvalidRequestException("Please Enter the Valid Request");
        }
        return ticketService.generateTicket(vehicle, gateId, parkingLotId);
    }
}
