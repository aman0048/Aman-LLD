package multiThreading;

public class Task implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello From " + Thread.currentThread().getName());
    }
}
