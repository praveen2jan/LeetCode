package Easy;

import static Easy.ListNode.printLL;

public class MergeSortedList {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        printLL(list1);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        printLL(list2);

        var merged = mergeTwoLists(list1, list2);

        printLL(merged);
    }




    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode(0);
        ListNode head = res;

        while (list1 != null && list2 != null ){
            if (list1.val < list2.val) {
                head.next = list1;
                list1 = list1.next;
            } else {
                head.next = list2;
                list2 = list2.next;
            }
            head = head.next;
        }

        if(list1 != null) {
            head.next = list1;
        }
        if(list2 != null) {
            head.next = list2;
        }

        return res.next;
    }

}
