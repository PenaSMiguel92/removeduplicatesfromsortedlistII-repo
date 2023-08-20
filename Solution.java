public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode answer = new ListNode(-1, head);
        ListNode current = answer;

        while (current.next != null && current.next.next != null) {
            if (current.next.val == current.next.next.val) {
                int duplicate = current.next.val;
                while (current.next != null && current.next.val == duplicate) {
                    current.next = current.next.next;
                }
            } else {
                current = current.next;
            }
        }

        return answer.next;
    }
}
