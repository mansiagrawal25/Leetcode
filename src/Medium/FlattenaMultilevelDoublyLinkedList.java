package Medium;

import java.util.Stack;

public class FlattenaMultilevelDoublyLinkedList {
    public class Node{
        public int val;
        public Node next;
        public Node prev;
        public Node child;
        public Node(){};
        public Node(int val, Node prev, Node next, Node child){
            this.val=val;
            this.child=child;
            this.next=next;
            this.prev=prev;
        }
    }
    //DFS by Iteration
    public Node flatten(Node head) {
        Node temp=head;
        Stack<Node> stack= new Stack<>();
        while (head!=null){
            if(head.child!=null){
                if(head.next!=null)stack.push(head.next);
                head.next=head.child;
                head.next.prev=head;
                head.child=null;
            }
            else if(head.next==null && !stack.isEmpty()){
                head.next=stack.pop();
                head.next.prev=head;
            }
            head=head.next;
        }
        return temp;
    }
    public Node flattenMD(Node head){
        if(head==null)return null;
        Node curr = head;
        while (curr!=null){
           if(curr.child==null){
               curr=curr.next;
           }
           else {
               Node next= curr.next;
               Node child= curr.child;
               curr.next=child;
               child.prev=curr;
               curr.child=null;
               while (child.next!=null){
                   child=child.next;
               }
               child.next=next;
               if(next!=null){
                   next.prev=child;
               }
           }
        }
        return head;
    }




}
