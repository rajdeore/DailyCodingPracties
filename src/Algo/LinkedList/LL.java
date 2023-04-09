package Algo.LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;
    //constructor to initialize size
    public LL() {
        this.size = 0;
    }

    //Node
    private class Node {
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


    // to insert first element in the list
    public void insertForFront(int val) {
        Node newNode = new Node(val);
        //if list is empty
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;

        }
        size += size;
 /*       newNode.next = head;
        head = newNode;*/
    }

    //to display List
    public void displayList(){
       //Node itaratorNode = head;
        Node itaratorNode = head;
        if(itaratorNode == null){
            System.out.println("Linked List is empty");
        }else {
            while(itaratorNode != null){
                System.out.print(itaratorNode.value + " ");
                itaratorNode = itaratorNode.next;
            }
            System.out.println();
        }
    }

    //method to insert in middle with give position
    public void insertByPosition(int newNodePosition, int newNodeValue){
        Node newNode = new Node(newNodeValue);
        Node iteratorNode = head;

        if(head == null){
            System.out.println("empty linked list");
        }else if(newNodePosition == 1){
            insertForFront(newNodeValue);
        }else {
            try {
                int i = 1;
                while (i < newNodePosition - 1) {
                    iteratorNode = iteratorNode.next;
                    i++;
                }
                newNode.next = iteratorNode.next;
                iteratorNode.next = newNode;
            } catch (NullPointerException e) {
                System.out.println("position not in linked list ");
            }
        }

    }
}
