package JavaConceptPracties.rough;

import java.util.LinkedList;
import java.util.Queue;

public class CustBlockingQueue {
    private LinkedList queue;
    private int size;

    public CustBlockingQueue(int size) {
        this.size = size;
        this.queue = new LinkedList();
    }

    @Override
    public String toString() {
        return "CustBlockingQueue{" +
                "queue=" + queue +
                '}';
    }

    //to insert onr element
    public synchronized void enqueue(int element){
        if(queue.size() == size){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        queue.add(element);
        notifyAll();
    }

    //to delete element
    public synchronized int dqueue(){
        if(queue.isEmpty()){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        int removed = (int) queue.removeFirst();
        notifyAll();
        return removed;
    }

    public static void main(String[] args) {
        CustBlockingQueue cbq = new CustBlockingQueue(5);

        Thread producer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("producing : " + i);
                cbq.enqueue(i);
               // cbq.notifyAll();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    //Thread.currentThread().interrupt();
                    throw new RuntimeException(e);
                }
            }
        });
        // Consumer Thread
        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    int item = cbq.dqueue();
                    System.out.println("Consuming: " + item);
                    Thread.sleep(1000); // Simulate time taken to consume
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
/*        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        System.out.println(cbq.toString());
    }
}
