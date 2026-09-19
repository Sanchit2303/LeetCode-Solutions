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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        int size = 1;//size initialy one cuz we are calc length till temp.next!=null
        if(head == null){
            return head;
        }
        while(temp.next!=null){
            temp = temp.next;
            size++;
        }
        //no of effective rotatioins
        k = k%size;
        if(k==0){
            return head;
        }
        temp.next = head;
        temp = head;
        for(int i=1 ; i<(size - k) ; i++){
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }
}