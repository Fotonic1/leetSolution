public class P2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode headNode = new ListNode();
        ListNode current = null;
        ListNode endNode = new ListNode(0);
        int add = 0;
        while (l1 != endNode || l2 != endNode || add != 0) {
            if (current == null) {
                current = headNode;
            } else {
                current.next = new ListNode();
                current = current.next;
            }

            int sum = l1.val + l2.val + add;
            current.val = sum % 10;

            add = sum/10;
            l1 = l1.next == null ? endNode : l1.next;
            l2 = l2.next == null ? endNode : l2.next;
        }

        return headNode;
    }

      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

}
