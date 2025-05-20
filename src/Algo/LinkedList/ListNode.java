package Algo.LinkedList;

public class ListNode {
    int val;
    ListNode next;

    //constructor
    ListNode(){};
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
