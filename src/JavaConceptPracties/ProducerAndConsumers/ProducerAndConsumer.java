package JavaConceptPracties.ProducerAndConsumers;



import java.util.LinkedList;

//Queue as linkedList




public class ProducerAndConsumer {


    public static void main(String[] args) {
        Buffer b = new Buffer(3);
        b.printQueue();
    }

            /*Producer p1 = new Producer(b, 1, 10);*/






/*
    Queue<Integer> queue = new PriorityQueue<>(10);

    public void producer() {
        synchronized (queue) {

            if (queue.size() == 10) {
                System.out.println("queue is full");
            } else {
                queue.add((int) Math.random());
            }
        }
    }

    public void consume() throws InterruptedException {
        synchronized (queue){
            if(queue.isEmpty()){
                System.out.println("queue is empty");
                wait();
            }else{
                queue.remove();
                notify();
            }
        }
    }
*/


}
