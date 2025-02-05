public class P2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resNode = new ListNode();
        ListNode baseNode = resNode;
        ListNode prev = new ListNode();
        boolean add = false;
        while (l1 != null || l2 != null) {
            ListNode next = new ListNode();
            resNode.next = next;
            if (l1 != null && l2 != null) {
                int r = add ? l1.val + l2.val + 1 : l1.val + l2.val;
                resNode.val = r % 10;
                add = r/10 > 0;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 != null) {
                int r = add ? l1.val + 1 : l1.val;
                resNode.val = r % 10;
                add = r / 10 > 0;
                l1 = l1.next;
            } else {
                int r = add ? l2.val + 1 : l2.val;
                resNode.val = r % 10;
                add = r / 10 > 0;
                l2 = l2.next;
            }
            prev = resNode;
            resNode = next;
        }

        if (add) {
            resNode.val = 1;
        } else {
            prev.next = null;
        }

        resNode.next = null;
        return baseNode;
    }

      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

}
