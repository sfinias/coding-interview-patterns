package io.sfinias.codintinterviewpatterns.fastslowpointers;

import static org.junit.jupiter.api.Assertions.*;

import io.sfinias.codintinterviewpatterns.fastslowpointers.LinkedListCycle.ListNode;
import org.junit.jupiter.api.Test;

class MiddleOfLinkedListTest {

    @Test
    void test() {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        assertEquals(3, MiddleOfLinkedList.findMiddle(head).value);

        head.next.next.next.next.next = new ListNode(6);
        assertEquals(4, MiddleOfLinkedList.findMiddle(head).value);

        head.next.next.next.next.next.next = new ListNode(6);
        assertEquals(4, MiddleOfLinkedList.findMiddle(head).value);

    }
}