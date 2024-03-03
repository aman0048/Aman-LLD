package service.strategy.billCalculationStrategy;

import models.Bill;
import models.Ticket;

public interface BillCalculationStrategy {
    int baseRateForTwoWheeler = 20;
    int baseRateForFourWheeler = 50;
    Bill generateBill(Ticket ticket);
}
