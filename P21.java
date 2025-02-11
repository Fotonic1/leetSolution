import java.util.Stack;

public class P21 {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        } else if (list1 != null && list2 != null) {
            if (list1.val <= list2.val) return new ListNode(list1.val, mergeTwoLists(list1.next, list2));
            else return new ListNode(list2.val, mergeTwoLists(list1, list2.next));
        } else if (list1 != null) return new ListNode(list1.val, mergeTwoLists(list1.next, null));
        else return new ListNode(list2.val, mergeTwoLists(null, list2.next));
    }

    public static void main(String[] args) {
        System.out.println(mergeTwoLists(new ListNode(), new ListNode()));
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next;}

        @Override
        public String toString() {
            return val + " " + (next != null ? next.toString() : "");
        }
    }
}
