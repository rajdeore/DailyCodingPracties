package Interview.Old.Zenser;

import java.util.Queue;

public class CustomBlockingQueue {
    //Zenser
    private Queue<Integer> queue;
    private int size;

    public CustomBlockingQueue(int size) {
        this.size = size;
        this.queue = new java.util.LinkedList<>();
    }

    public synchronized void enqueue(int item) throws InterruptedException {
        while (queue.size() == size) {
            wait();
        }
        queue.add(item);
        notifyAll();
    }

    public synchronized int dequeue() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }
        int item = queue.remove();
        notifyAll();
        return item;
    }


    public static void main(String[] args) {
        CustomBlockingQueue cbq = new CustomBlockingQueue(2);

        // Producer Thread
        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Producing: " + i);
                    cbq.enqueue(i);
                    Thread.sleep(500); // Simulate time taken to produce
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Consumer Thread
        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    int item = cbq.dequeue();
                    System.out.println("Consuming: " + item);
                    Thread.sleep(1000); // Simulate time taken to consume
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
    }



}
