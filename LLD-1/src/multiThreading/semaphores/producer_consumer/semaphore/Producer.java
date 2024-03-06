package multiThreading.semaphores.producer_consumer.semaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private Queue<Object> q;
    private int maxSize;
    private String name;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    public Producer(Queue<Object> q, int maxSize, String name, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.q = q;
        this.maxSize = maxSize;
        this.name = name;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }
    @Override
    public void run() {
        while (true){
            try {
                producerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (q.size() < maxSize) {
                q.add(new Object());
            }
            consumerSemaphore.release();
        }
    }
}
