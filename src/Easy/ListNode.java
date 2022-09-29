package Easy;

public class ListNode {

    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static void printLL(ListNode list) {
        while (list!=null) {
            System.out.print(list.val +" ");
            list = list.next;
        }
        System.out.println();
    }
}
