package designPatterns.adapter;

public class PhonePe {
    private final BankApiAdapter bankApiAdapter;

    public PhonePe(BankApiAdapter bankApiAdapter){
        this.bankApiAdapter = new YesBankApiAdapter();
    }

    public void checkBalance(User user){
        double balance = bankApiAdapter.checkBalance(user);
        System.out.println("Balance: " + balance);
    }

    public void transferMoney(User fromUser, User toUser, double amount){
        if(bankApiAdapter.checkBalance(fromUser) < amount){
            System.out.println("Insufficient balance");
        }

        int status = bankApiAdapter.doTransaction(fromUser, toUser, amount);
        switch (status){
            case 1:
                System.out.println("Transaction is Successful");
                break;
            case 0:
                System.out.println("Transaction Failed");
                break;
            default:
                System.out.println("Transaction InProgress");
                break;
        }
    }

    @Override
    public String toString() {
        return "PhonePe{" +
                "bankApiAdapter=" + bankApiAdapter +
                '}';
    }
}
