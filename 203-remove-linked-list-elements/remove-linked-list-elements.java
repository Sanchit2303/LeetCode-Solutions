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
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val == val){
            head = head.next;
        }
        if(head == null){
            return head;
        }
        ListNode begin = head;
        ListNode temp = head.next;
        while(temp!=null){
            if(temp.val == val){
                begin.next = temp.next;
            }
            else{
                begin = begin.next;
            }
            temp = temp.next;
        }
        return head;
    }
}