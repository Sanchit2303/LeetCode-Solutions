
class Solution {

    public ListNode addnode(ListNode temp, int data) {
        ListNode newnode = new ListNode(data);

        if (temp == null) {
            return newnode;
        }

        temp.next = newnode;
        return newnode;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode list = null;
        ListNode temp = null;

        ListNode temp1 = list1;
        ListNode temp2 = list2;

        while (temp1 != null && temp2 != null) {

            if (temp1.val <= temp2.val) {
                if (list == null) {
                    list = addnode(list, temp1.val);
                    temp = list;
                } else {
                    temp = addnode(temp, temp1.val);
                }
                temp1 = temp1.next;
            } else {
                if (list == null) {
                    list = addnode(list, temp2.val);
                    temp = list;
                } else {
                    temp = addnode(temp, temp2.val);
                }
                temp2 = temp2.next;
            }
        }

        while (temp1 != null) {
            if (list == null) {
                list = addnode(list, temp1.val);
                temp = list;
            } else {
                temp = addnode(temp, temp1.val);
            }
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            if (list == null) {
                list = addnode(list, temp2.val);
                temp = list;
            } else {
                temp = addnode(temp, temp2.val);
            }
            temp2 = temp2.next;
        }

        return list;
    }
}
