package io.sfinias.codintinterviewpatterns.fastslowpointers;

import static org.junit.jupiter.api.Assertions.*;

import io.sfinias.codintinterviewpatterns.fastslowpointers.LinkedListCycle.ListNode;
import org.junit.jupiter.api.Test;

class LinkedListCycleStartTest {

    @Test
    void test() {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        head.next.next.next.next.next.next = head.next.next;
        assertEquals(3, LinkedListCycleStart.findCycleStart(head).value);

        head.next.next.next.next.next.next = head.next.next.next;
        assertEquals(4, LinkedListCycleStart.findCycleStart(head).value);

        head.next.next.next.next.next.next = head;
        assertEquals(1, LinkedListCycleStart.findCycleStart(head).value);
    }
}