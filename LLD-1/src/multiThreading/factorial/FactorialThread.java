package multiThreading.factorial;

import java.math.BigInteger;

public class FactorialThread extends Thread{
    private long number;
    private BigInteger result;

    private boolean isFinished;
    FactorialThread(long number){
        this.number = number;
        result = BigInteger.valueOf(0);
        isFinished = false;
    }

    @Override
    public void run() {
        result = factorial(number);
        isFinished = true;
    }

    private BigInteger factorial(long number){
        BigInteger ans = BigInteger.ONE;

        for (int i = 2; i<=number; i++){
            ans = ans.multiply(BigInteger.valueOf(i));
        }
        return ans;
    }

    public BigInteger getResult() {
        return result;
    }

    public boolean isFinished() {
        return isFinished;
    }
}
