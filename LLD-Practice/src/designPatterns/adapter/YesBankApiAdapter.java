package designPatterns.adapter;

public class YesBankApiAdapter implements BankApiAdapter{
    YesBankApi yesBankApi = new YesBankApi();
    @Override
    public double checkBalance(User user) {
        long balance = yesBankApi.getBalance(user.getUsername(), user.getPassword());
        return (double) balance;
    }

    @Override
    public int doTransaction(User fromUser, User toUser, double amount) {
        char transaction = yesBankApi.doTransaction(fromUser.getUsername(), toUser.getUsername(), fromUser.getPassword(), amount);
        switch (transaction){
            case 'y':
                return 1;
            case 'n':
                return 0;
            default:
                return 2;
        }
    }

    @Override
    public boolean changePin(User user, int currentPin, int newPin) {
        return yesBankApi.changePin(user.getUsername(), user.getPassword(), currentPin, newPin);
    }
}
