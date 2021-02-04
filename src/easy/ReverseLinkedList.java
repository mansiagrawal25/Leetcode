package easy;

public class ReverseLinkedList {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        while(head!=null){
            ListNode nextNode = head.next;
            head.next=prev;
            prev = head;
            head= nextNode;
        }
        return prev;

    }
}
