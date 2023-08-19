public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        ListNode list1 = generateListFromValues(new int[] { 1, 2, 3, 3, 4, 4, 5 });
        ListNode list2 = generateListFromValues(new int[] { 1, 1, 1, 2, 3 });
        ListNode list3 = generateListFromValues(new int[] {});
        ListNode list4 = generateListFromValues(new int[] { 1, 1, 1, 1 });

        printList(sol.deleteDuplicates(list1));
        printList(sol.deleteDuplicates(list2));
        printList(sol.deleteDuplicates(list3));
        printList(sol.deleteDuplicates(list4));
    }

    public static ListNode generateListFromValues(int[] values) {
        ListNode list = new ListNode(-1, null);
        ListNode listPtr = list;
        for (int val : values) {
            listPtr.next = new ListNode(val);
            listPtr = listPtr.next;
        }
        return list;
    }

    public static void printList(ListNode list) {
        String val = "[";
        while (list != null) {
            val += " " + list.val + " ";
            list = list.next;
        }
        System.out.println(val + "]");
    }
}
