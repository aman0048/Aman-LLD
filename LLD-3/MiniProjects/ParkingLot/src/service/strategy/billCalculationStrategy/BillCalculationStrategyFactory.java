package service.strategy.billCalculationStrategy;

public class BillCalculationStrategyFactory {
    public static BillCalculationStrategy getBill(){
        return new SimpleBillCalculationStrategy();
    }
}
