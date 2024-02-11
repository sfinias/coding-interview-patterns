package io.sfinias.codintinterviewpatterns.fastslowpointers;

// Given the head of a Singly LinkedList, write a function to determine if the LinkedList has a cycle in it or not.

public class LinkedListCycle {

    static class ListNode {

        int value;
        ListNode next;

        public ListNode(int value) {

            this.value = value;
        }
    }

    public static boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) return true;
        }
        return false;
    }

    // Time Complexity O(N)
    // Space Complexity O(1)
}
