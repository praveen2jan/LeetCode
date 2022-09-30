package medium;

public class RemoveNthNodeFromEndOfLinkedList {

    public static void main(String[] args) {
//        LinkedListCycleII.ListNode head = new LinkedListCycleII.ListNode(1);
//        head.next = new LinkedListCycleII.ListNode(2);
//        head.next.next = new LinkedListCycleII.ListNode(3);
//        head.next.next.next = new LinkedListCycleII.ListNode(4);
//        head.next.next.next.next = new LinkedListCycleII.ListNode(5);

        LinkedListCycleII.ListNode head= new LinkedListCycleII.ListNode(1);

        int n = 1;
        printLL(head);
        head = removeNthNodeFromEnd(head, n);
        printLL(head);
    }

    private static LinkedListCycleII.ListNode removeNthNodeFromEnd(LinkedListCycleII.ListNode head, int n) {
        LinkedListCycleII.ListNode start = new LinkedListCycleII.ListNode(0);
        LinkedListCycleII.ListNode slow = start;
        LinkedListCycleII.ListNode fast = start;
        start.next = head;

        for(int i =0 ;i<=n;i++)
            fast = fast.next;

        while(fast!=null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return start.next;
    }

    private static void printLL(LinkedListCycleII.ListNode head) {
        LinkedListCycleII.ListNode temp = head;
        while(temp!=null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
