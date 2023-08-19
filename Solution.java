public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return head;
        if (head.next == null)
            return head;

        ListNode ptr1 = head;
        ListNode ptr2 = head;
        int count = 0;
        while (ptr1.next != null) {
            ptr1 = ptr1.next;
            if (ptr1.val != ptr2.val) {
                if (count <= 1) {
                    ptr2 = ptr2.next;
                    ptr2.val = ptr1.val;
                }
            } else if (ptr1.val == ptr2.val) {
                count++;
            }
        }
        return head;
    }
}
