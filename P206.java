public class P206 {
    public static ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }

    public static ListNode reverse(ListNode head, ListNode newHead) {
        if (head == null) return newHead;
        else {
            ListNode next = head.next;
            head.next = newHead;
            return reverse(next, head);
        }
    }

    public static void main(String[] args) {
//        System.out.println(hasCycle());
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
