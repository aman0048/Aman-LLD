package designPatterns.adapter;

public class IciciBankApiAdapter implements BankApiAdapter{
    IciciBankApi iciciBankApi = new IciciBankApi();
    @Override
    public double checkBalance(User user) {
        return iciciBankApi.checkBalance(validateToken(user));
    }

    @Override
    public int doTransaction(User fromUser, User toUser, double amount) {
        return iciciBankApi.transferMoney(validateToken(fromUser), validateToken(toUser), amount);
    }

    @Override
    public boolean changePin(User user, int currentPin, int newPin) {
        return iciciBankApi.changePin(validateToken(user), currentPin, newPin);
    }

    private String validateToken(User user){
        return user.getUsername() + user.getPassword();
    }
}
