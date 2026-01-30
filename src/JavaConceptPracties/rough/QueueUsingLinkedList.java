package JavaConceptPracties.rough;

import java.util.LinkedList;

public class QueueUsingLinkedList {
    private LinkedList linkedList;
    //private int size;

    public QueueUsingLinkedList() {
        //this.size = size;
        linkedList = new LinkedList<>();
    }

    public void enqueue(int num){
        linkedList.addLast(num);
    }

    public void dequeue(){
        if(linkedList.isEmpty()){
            System.out.println("Queue is empty ");
        }
        System.out.println((int) linkedList.removeFirst());
    }

    @Override
    public String toString() {
        return "QueueUsingLinkedList{" +
                "linkedList=" + linkedList +
                '}';
    }

    public static void main(String[] args) {
        QueueUsingLinkedList queueUsingLinkedList = new QueueUsingLinkedList();

        queueUsingLinkedList.enqueue(1);
        queueUsingLinkedList.enqueue(2);
        queueUsingLinkedList.enqueue(3);
        queueUsingLinkedList.dequeue();
        queueUsingLinkedList.enqueue(4);
        queueUsingLinkedList.enqueue(6);
        queueUsingLinkedList.dequeue();

        System.out.println(queueUsingLinkedList.toString());


    }


}
