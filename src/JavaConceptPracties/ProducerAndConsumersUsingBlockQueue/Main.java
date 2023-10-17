package JavaConceptPracties.ProducerAndConsumersUsingBlockQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(3);

        Producer p1 = new Producer(queue);
        Consumer c1 = new Consumer(queue);
       // Consumer c2 = new Consumer(queue);

        Thread producerThread = new Thread(p1);
        Thread consumerThread = new Thread(c1);

        producerThread.start();
        consumerThread.start();

    }

}
