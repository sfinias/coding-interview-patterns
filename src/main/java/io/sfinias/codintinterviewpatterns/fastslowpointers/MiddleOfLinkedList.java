package io.sfinias.codintinterviewpatterns.fastslowpointers;

import io.sfinias.codintinterviewpatterns.fastslowpointers.LinkedListCycle.ListNode;

public class MiddleOfLinkedList {

    public static ListNode findMiddle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return fast.next == null ? slow : slow.next;
    }

    // Time Complexity O(N)
    // Space Complexity O(1)

}
