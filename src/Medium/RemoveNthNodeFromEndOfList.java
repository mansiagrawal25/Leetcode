package Medium;

import easy.IntersectionOfTwoLinkedLists;

public class RemoveNthNodeFromEndOfList {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {};
        ListNode(int x) {
            val = x;
            next = null;
        }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode first = dummy;
        ListNode second = dummy;
        for(int i=0;i<=n;i++){
            first= first.next;
        }
        while(first!=null){
            first=first.next;
            second=second.next;
        }
        second.next=second.next.next;
        return dummy.next;
    }

}
