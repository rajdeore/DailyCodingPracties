package JavaConceptPracties.ProducerAndConsumers;

import java.util.LinkedList;

class Buffer {
    private LinkedList<Integer> queue = new LinkedList<>();
    private int capacity;

    public Buffer(int capacity) {
        this.queue = queue;
        this.capacity = capacity;
    }

    //To add in buffer
    public void addItem(int item, int producerId) {
        System.out.println("Producer " + producerId + " is adding item " + item);
        queue.add(item);
        System.out.println("item " + item + "successfully added");
    }

    //To consume from buffer
    public void consumeItem(int consumerId) {
        System.out.println("consumer : " + consumerId + "is trying to consume");
        queue.remove(0);
    }

    public void printQueue() {
        for (int val : queue) {
            System.out.println(val);
        }
    }
}
