package linkedlist;

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode(int _val) {
        val = _val;
    }
}

public class Utils {

    /**
     * Create a singly-linked list from a int array
     *
     * @param arr
     * @return
     */
    public static ListNode createLinkedListByArr(int[] arr) {

        ListNode currentNode = null;
        ListNode previousNode = null;
        int index = 0;

        while (index < arr.length) {

            ListNode innerNode = new ListNode(arr[index]);

            if (currentNode == null) {
                currentNode = innerNode;
            } else {
                previousNode.next = innerNode;
            }
            previousNode = innerNode;
            index++;
        }

        return currentNode;
    }

    /**
     * Create a cycled singly-linked list from a int array,
     * integer pos represents the position (0-indexed) in the linked list where tail connects to.
     *
     * @param arr
     * @param pos
     * @return
     */
    public static ListNode createCycledLinkedListByArr(int[] arr, int pos) {

        ListNode listNode = createLinkedListByArr(arr);
        ListNode cur = listNode;
        ListNode con = null;

        int cPos = 0;

        if (pos == -1) {
            return listNode;
        }

        while (cur != null) {

            if (cPos == pos) {
                con = cur;
            }

            if (cur.next == null) {
                cur.next = con;
                break;
            }

            cur = cur.next;
            cPos++;
        }
        return listNode;
    }

    /**
     * Print ListNode's value in order
     *
     * @param listNode
     * @return
     */
    public static StringBuffer printListNode(ListNode listNode) {

        List<ListNode> nodeArrayList = new ArrayList<>();
        ListNode curNode = listNode;
        StringBuffer stringBuffer = new StringBuffer();

        while (curNode != null) {
            nodeArrayList.add(curNode);
            curNode = curNode.next;
        }

        for (ListNode node : nodeArrayList) {
            stringBuffer.append(node.val);
        }
        return stringBuffer;
    }


}
