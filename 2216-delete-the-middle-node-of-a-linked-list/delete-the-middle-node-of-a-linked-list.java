/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null){
            return head;
        }

        if(head.next == null){
            return null;
        }

        ListNode temp = head;
        int i = 0;

        while(temp != null){
            temp = temp.next;
            i++;
        }

        temp = head;

        for(int k = 1; k < (i / 2); k++){
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }
}
