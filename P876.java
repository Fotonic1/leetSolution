public class P876 {
    public static ListNode middleNode(ListNode head) {
        int length = 1;
        ListNode node = head;
        while (node.next != null) {
            length++;
            node = node.next;
        }
        int cur = 0;
        while (++cur < length/2)
            head = head.next;
        return head;
    }

    public static void main(String[] args) {
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
