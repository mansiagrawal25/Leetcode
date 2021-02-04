package Medium;
import Medium.LinkedListCycleII.ListNode;
public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if(head!=null){
            ListNode curr= head, even=head.next, evenHead=even;
            while(curr.next!=null&&curr.next.next!=null){
                curr.next = even.next;
                curr = curr.next;
                even.next = curr.next;
                even = even.next;
            }
            curr.next= evenHead;
        }
        return head;

    }
}
