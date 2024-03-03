package service;

import exception.InvalidRequestException;
import models.Bill;
import models.Gate;
import models.Ticket;
import repository.GateRepository;
import repository.TicketRepository;
import service.strategy.billCalculationStrategy.BillCalculationStrategy;
import service.strategy.billCalculationStrategy.BillCalculationStrategyFactory;

public class BillService {
    private TicketRepository ticketRepository;
    private GateRepository gateRepository;

    public BillService(TicketRepository ticketRepository, GateRepository gateRepository) {
        this.ticketRepository = ticketRepository;
        this.gateRepository = gateRepository;
    }

    public Bill generateBill(int ticketId, int exitGateId){
        BillCalculationStrategy billCalculationStrategy = BillCalculationStrategyFactory.getBill();
        Ticket ticket = ticketRepository.get(ticketId);
        Bill bill = billCalculationStrategy.generateBill(ticket);
        Gate exitgate = gateRepository.get(exitGateId);
        bill.setExitGate(exitgate);
        return bill;
    }
}
