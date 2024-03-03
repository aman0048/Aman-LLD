package service;

import models.ParkingLot;
import models.ParkingSpot;
import models.Ticket;
import models.Vehicle;
import models.enums.ParkingSpotStatus;
import repository.GateRepository;
import repository.ParkingLotRepository;
import repository.ParkingSpotRepository;
import repository.TicketRepository;
import service.strategy.spotAllocationStrategy.SpotAllocationStrategy;
import service.strategy.spotAllocationStrategy.SpotAllocationStrategyFactory;

import java.time.LocalDateTime;

public class TicketService {

    private TicketRepository ticketRepository;
    private ParkingLotRepository parkingLotRepository;
    private GateRepository gateRepository;
    private ParkingSpotRepository parkingSpotRepository;

    public TicketService(TicketRepository ticketRepository, ParkingLotRepository parkingLotRepository, GateRepository gateRepository, ParkingSpotRepository parkingSpotRepository) {
        this.ticketRepository = ticketRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.gateRepository = gateRepository;
        this.parkingSpotRepository = parkingSpotRepository;
    }

    public Ticket generateTicket(Vehicle vehicle, int gateId, int parkingLotId){
        SpotAllocationStrategy spotAllocationStrategy = SpotAllocationStrategyFactory.getSpotAllocation();
        ParkingLot parkingLot = parkingLotRepository.get(parkingLotId);

        ParkingSpot parkingSpot = spotAllocationStrategy.getSpotForVehicle(parkingLot, vehicle);
        parkingSpot.setParkingSpotStatus(ParkingSpotStatus.OCCUPIED);
        parkingSpot.setVehicle(vehicle);
        parkingSpotRepository.put(parkingSpot);
        Ticket ticket = new Ticket();
        ticket.setEntryTime(LocalDateTime.now());
        ticket.setVehicle(vehicle);
        ticket.setParkingSpot(parkingSpot);
        ticket.setEntryGate(gateRepository.get(gateId));
        return ticketRepository.put(ticket);
    }
}
