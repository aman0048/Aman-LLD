package service.strategy.billCalculationStrategy;

import models.Bill;
import models.Ticket;
import models.enums.BillStatus;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class SimpleBillCalculationStrategy implements BillCalculationStrategy{

    // 1sec = 1Rs
    @Override
    public Bill generateBill(Ticket ticket) {
        LocalDateTime entryTime = ticket.getEntryTime();
        LocalDateTime exitTime = LocalDateTime.now();
        Duration duration = Duration.between(entryTime, exitTime);
        long numberOfSeconds = duration.getSeconds();
        // Ensure the amount is not negative
        long amount = Math.max(0, numberOfSeconds);
        Bill bill = new Bill();
        bill.setAmount(amount);
        bill.setTicket(ticket);
        bill.setExitTime(exitTime);
        bill.setId(exitTime.hashCode());
        bill.setStatus(BillStatus.UNPAID);
        return bill;
    }
}
