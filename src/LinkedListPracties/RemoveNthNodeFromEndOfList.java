package LinkedListPracties;

public class RemoveNthNodeFromEndOfList {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head;
        ListNode tailPosition = head;

        while(n>0){
            tailPosition = tailPosition.next;
            n--;
        }
        if(tailPosition == null)
            return head.next;

        while(tailPosition.next != null){
            current = current.next;
            tailPosition = tailPosition.next;
        }

        current.next = current.next.next;

        return head;
    }

}
