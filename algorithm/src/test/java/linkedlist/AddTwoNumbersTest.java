package linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AddTwoNumbersTest {

    AddTwoNumbers clazz = new AddTwoNumbers();

    @Test
    public void add_NormalCase() {

        ListNode n1 = Utils.createLinkedListByArr(new int[]{2, 4, 3});
        ListNode n2 = Utils.createLinkedListByArr(new int[]{5, 6, 4});

        ListNode n3 = clazz.add(n1,n2);
        assertEquals("708", Utils.printListNode(n3).toString());
    }

    @Test
    public void add_WhenDifferentLength() {

        ListNode n1 = Utils.createLinkedListByArr(new int[]{2, 4, 3});
        ListNode n2 = Utils.createLinkedListByArr(new int[]{5, 6, 9, 9});

        ListNode n3 = clazz.add(n1,n2);
        assertEquals("70301", Utils.printListNode(n3).toString());
    }

    @Test
    public void add_WhenOneZeroNode() {

        ListNode n1 = Utils.createLinkedListByArr(new int[]{0});
        ListNode n2 = Utils.createLinkedListByArr(new int[]{1, 8});

        ListNode n3 = clazz.add(n1,n2);
        assertEquals("18", Utils.printListNode(n3).toString());
    }
}