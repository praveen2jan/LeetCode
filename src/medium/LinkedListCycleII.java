package medium;


import java.util.List;

public class LinkedListCycleII {

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode cycle = new ListNode(2);
        head.next =cycle;
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = cycle;

        System.out.println(detectCycle(head).val);
    }

    static class ListNode {
     int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public static ListNode detectCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                slow = head;
                while(fast!=slow){
                    slow = slow.next;
                    fast = fast.next;
                }
                return fast;
            }
        }
        return null;

    }
}
