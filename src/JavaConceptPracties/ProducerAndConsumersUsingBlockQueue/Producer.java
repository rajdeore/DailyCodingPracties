package JavaConceptPracties.ProducerAndConsumersUsingBlockQueue;

import java.util.concurrent.BlockingQueue;

public class Producer extends Thread {
    BlockingQueue<String> queue = null;

    public Producer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Producing element 1  ");
                queue.put("Element 1");
                Thread.sleep(1000);
                System.out.println("Producing element 2  ");
                queue.put("Element 2");
                Thread.sleep(1000);
                System.out.println("Producing element 3  ");
                queue.put("Element 3");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
             //  throw new RuntimeException(e);
                e.getStackTrace();
            }

        }
    }
}
