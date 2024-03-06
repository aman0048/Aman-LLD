package multiThreading.semaphores.producer_consumer.Synchronized;

import java.util.Queue;

public class Consumer implements Runnable{
    private Queue<Object> q;
    private int maxSize;
    private String name;

    public Consumer(Queue<Object> q, int maxSize, String name) {
        this.q = q;
        this.maxSize = maxSize;
        this.name = name;
    }

    @Override
    public void run() {
        while (true){
            synchronized (q) {
                if (q.size() > 0) {
                    q.remove();
                }
            }
        }
    }
}
