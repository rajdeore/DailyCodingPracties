package Algo.LinkedList;

public class CircularLL {

    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node() {
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }
    }

        public boolean isCircular(Node head){
            Node slow = new Node();
            Node fast = new Node();
            slow = fast = head;


            //

            if(slow == fast){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;


return true;
        }
}
