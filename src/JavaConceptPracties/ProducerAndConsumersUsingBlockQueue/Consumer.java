package JavaConceptPracties.ProducerAndConsumersUsingBlockQueue;

import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread {
    BlockingQueue<String> queue = null;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }


    @Override
    public void run() {

        while (true) {
            try {
                System.out.println("Consumimg :" + queue.take());
            } catch (InterruptedException e) {
                e.getStackTrace();
            }
        }
    }
}
