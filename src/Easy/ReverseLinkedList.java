package Easy;

import java.awt.*;

import static Easy.ListNode.printLL;

public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next  = new ListNode(5);

        ListNode reversedList = reverseLinkedList(node);

        printLL(reversedList);
    }

    private static ListNode reverseLinkedList(ListNode node) {

        ListNode prev = null;
        ListNode cur = node;
        ListNode next = null;
        while(cur!=null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;

    }
}
