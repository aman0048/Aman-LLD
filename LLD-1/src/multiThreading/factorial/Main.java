package multiThreading.factorial;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Long> inputNumbers = List.of(10000L, 234L, 4567L);
        List<FactorialThread> threadList = new ArrayList<>();

        for (long number : inputNumbers){
            FactorialThread t = new FactorialThread(number);
            threadList.add(t);
        }

        for (Thread t : threadList){
            t.start();
        }

        for (Thread t : threadList){
            t.join(3000);
        }

        for (int i=0; i<inputNumbers.size(); i++){
            FactorialThread t = threadList.get(i);
            if (t.isFinished()){
                System.out.println("***********");
                System.out.println(t.getResult());
            }
            else {
                System.out.println("couldn't calculate in 3 sec");
            }
        }
// Calculating Factorial of a number
//        FactorialThread t = new FactorialThread(4);
//        t.start();
////        Thread.sleep(2000);
//        t.join(1000);
//        System.out.println(t.getResult());
        System.out.println("Main is Completed");
    }
}
