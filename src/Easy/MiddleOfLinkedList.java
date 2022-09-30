package Easy;

import static Easy.ListNode.printLL;

public class MiddleOfLinkedList {

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        node.next.next.next.next.next = new ListNode(6);
        printLL(node);
        System.out.println(getMiddleNode(node).val);
    }

    private static ListNode getMiddleNode(ListNode node) {

        ListNode slow = node;
        ListNode fast = node;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
