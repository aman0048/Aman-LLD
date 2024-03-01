package multiThreading;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello From " + Thread.currentThread().getName());
        Thread t = new Thread(new Task());
        t.start();
    }
}