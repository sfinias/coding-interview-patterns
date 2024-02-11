package io.sfinias.codintinterviewpatterns.fastslowpointers;

import io.sfinias.codintinterviewpatterns.fastslowpointers.LinkedListCycle.ListNode;

public class LinkedListCycleStart {

    public static ListNode findCycleStart(ListNode head) {

        ListNode slow = head, fast = head;
        int cycleLength = 0;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                ListNode current = slow;
                int steps = 0;
                do {
                    current = current.next;
                    steps++;
                } while (current != slow);
                cycleLength = steps;
                break;
            }
        }
        slow = head;
        fast = head;
        for (int i = 0; i < cycleLength; i++) {
            fast = fast.next;
        }
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    // Time Complexity O(N)
    // Space Complexity O(1)

}
