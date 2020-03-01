package linkedlist;

public class AddTwoNumbers {

    public ListNode add(ListNode a, ListNode b) {

        int carry = 0;

        // result node, current node
        ListNode rNode = null, cNode = null;

        while (a != null || b != null || carry != 0) {

            int va, vb, val;

            // get value from ListNode, set to zero if node is null
            va = a == null ? 0 : a.val;
            vb = b == null ? 0 : b.val;

            // set quotient to val and set remainder to carry
            val = (va + vb + carry) % 10;
            carry = (va + vb + carry) / 10;

            // create header node if result node is null
            // set up next node if result node is exists
            // move current node to next
            if (rNode == null) {
                rNode = new ListNode(val);
                cNode = rNode;
            } else {
                cNode.next = new ListNode(val);
                cNode = cNode.next;
            }

            // move pointer to next if
            if (a != null) a = a.next;
            if (b != null) b = b.next;

        }

        return rNode;
    }
}
