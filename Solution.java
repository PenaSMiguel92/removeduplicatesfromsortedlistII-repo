import java.util.List;
import java.util.ArrayList;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;

        List<Integer> duplicates = generateDuplicatesList(head);
        System.gc();
        ListNode ptr1 = head;
        ListNode ptr2 = new ListNode(-1, head);
        ListNode prevNode = ptr2;

        while (ptr1 != null) {
            System.out.println(ptr1.val + ":" + duplicates.contains(ptr1.val));
            if (!duplicates.contains(ptr1.val)) {
                prevNode.next = ptr1;
                prevNode = prevNode.next;
            }
            ptr1 = ptr1.next;
        }
        prevNode.next = null;
        return ptr2.next;
    }
    
    public List<Integer> generateDuplicatesList(ListNode head) {
        List<Integer> uniqueList = new ArrayList<>();
        List<Integer> duplicateList = new ArrayList<>();
        while (head != null) {
            if (!uniqueList.contains(head.val)) {
                uniqueList.add(head.val);
            } else if (uniqueList.contains(head.val) && !duplicateList.contains(head.val)) {
                duplicateList.add(head.val);
            }
            head = head.next;
        }
        System.out.println("unique: " + uniqueList.toString());
        System.out.println("duplicate: " + duplicateList.toString());
        return duplicateList;
    }
}
