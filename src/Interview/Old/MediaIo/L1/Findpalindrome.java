package Interview.Old.MediaIo.L1;


import java.lang.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class SolveLLP {

    static boolean isPalindrome(Node head) {

        //to find middle
        Node slow = head, fast = head, cur = null, pre = null;
        while (fast.next != null && fast.next.next != null) {
            //to reverse
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;

            pre.next = cur;
            cur = pre;
        }

        if (fast.next == null) {
            slow = slow.next;
        } else {
            pre = slow;
            pre.next = cur;
        }

        printLL(slow);
        System.out.println();
        printLL(pre);

        while (slow != null) {
            if (slow.data != pre.data) {
                return false;
            }
            slow = slow.next;
            pre = pre.next;
        }
        return true;
    }

    static void printLL(Node head) {
        Node pointer = head;
        while (pointer != null) {
            System.out.print(pointer.data);
            pointer = pointer.next;
        }

    }

    public static void main(String[] args) {

        // Linked list : 1->2->3->2->1
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        // Linked list : 1->2->2->1
/*
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
*/

        //printLL(head);

        boolean result = isPalindrome(head);

        System.out.println();

        if (result)
            System.out.println("true");
        else
            System.out.println("false");
    }
}

