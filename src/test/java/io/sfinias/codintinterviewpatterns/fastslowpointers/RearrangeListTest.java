package io.sfinias.codintinterviewpatterns.fastslowpointers;

import static org.junit.jupiter.api.Assertions.*;

import io.sfinias.codintinterviewpatterns.fastslowpointers.LinkedListCycle.ListNode;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class RearrangeListTest {

    @Test
    void test() {


        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(8);
        head.next.next.next.next = new ListNode(10);
        head.next.next.next.next.next = new ListNode(12);

        RearrangeList.reorder(head);

        List<Integer> result = new ArrayList<>();
        ListNode node = head;
        while (node != null) {
            result.add(node.value);
            node = node.next;
        }

        assertEquals(List.of(2, 12, 4, 10, 6, 8), result);

    }
}