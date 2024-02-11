package io.sfinias.codintinterviewpatterns.fastslowpointers;

import static org.junit.jupiter.api.Assertions.*;

import io.sfinias.codintinterviewpatterns.fastslowpointers.LinkedListCycle.ListNode;
import org.junit.jupiter.api.Test;

class LinkedListCycleTest {

    @Test
    void test() {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        assertFalse(LinkedListCycle.hasCycle(head));

        head.next.next.next.next.next.next = head.next.next;
        assertTrue(LinkedListCycle.hasCycle(head));

        head.next.next.next.next.next.next = head.next.next.next;
        assertTrue(LinkedListCycle.hasCycle(head));
    }
}