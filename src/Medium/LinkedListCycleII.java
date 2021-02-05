package Medium;

import easy.LinkedListCycleSolution;

public class LinkedListCycleII {

    // * Definition for singly-linked list.
    static class ListNode {
         int val;
         ListNode next;
         ListNode(int x) {
              val = x;
             next = null;
         }
     }
//     */
//Floyds cylce algo
    public class Solution {
    public ListNode detectCycle(ListNode head) {
        // if(head==null) return null;
        ListNode walker = head;
        ListNode runner = head;
        while (runner.next != null && runner.next.next != null) {
            walker = walker.next;
            runner = runner.next.next;
            if (walker == runner) {
                ListNode runner2 = head;
                while (runner !=runner2){
                    runner=runner.next;
                    runner2=runner2.next;

                }
                return runner;
            }
            ;
        }
        return null;
    }
}
    public static void  main (String[] args){
        int[] arr= {3,2,0,-4};
        LinkedListCycleSolution link= new LinkedListCycleSolution();

    }
}
