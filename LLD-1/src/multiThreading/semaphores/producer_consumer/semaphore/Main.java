package multiThreading.semaphores.producer_consumer.semaphore;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Queue<Object> q = new ConcurrentLinkedQueue<>();
        int maxSize = 6;
        Semaphore producerSemaphore = new Semaphore(maxSize);
        Semaphore consumerSemaphore = new Semaphore(0);

        List<Producer> p = List.of(
                new Producer(q,maxSize,"p1", producerSemaphore, consumerSemaphore),
                new Producer(q,maxSize,"p2", producerSemaphore, consumerSemaphore),
                new Producer(q,maxSize,"p3", producerSemaphore, consumerSemaphore)
        );
        List<Consumer> c = List.of(
                new Consumer(q,maxSize,"c1", producerSemaphore, consumerSemaphore),
                new Consumer(q,maxSize,"c2", producerSemaphore, consumerSemaphore),
                new Consumer(q,maxSize,"c3", producerSemaphore, consumerSemaphore)
        );

        List<Thread> t = new ArrayList<>();

        for (int i = 0; i< p.size(); i++ ){
            t.add(new Thread(p.get(i)));
        }

        for (int i = 0; i< c.size(); i++ ){
            t.add(new Thread(c.get(i)));
        }

        for (Thread t1 : t){
            t1.start();
        }
    }
}
