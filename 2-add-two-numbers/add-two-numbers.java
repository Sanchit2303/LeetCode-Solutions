class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = null;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            int digit = sum % 10;
            carry = sum / 10;

            head = createnode(head, digit);
        }
        
        return head;
    }

    public ListNode createnode(ListNode head, int data) {
        ListNode newnode = new ListNode(data);

        if (head == null) {
            return newnode;
        }

        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newnode;
        return head;
    }
}