package multiThreading.semaphores.producer_consumer.Synchronized;

import java.util.Queue;

public class Producer implements Runnable{
    private Queue<Object> q;
    private int maxSize;
    private String name;

    public Producer(Queue<Object> q, int maxSize, String name) {
        this.q = q;
        this.maxSize = maxSize;
        this.name = name;
    }

    @Override
    public void run() {
        while (true){
            synchronized (q) {
                if (q.size() < maxSize) {
                    q.add(new Object());
                }
            }
        }
    }
}
