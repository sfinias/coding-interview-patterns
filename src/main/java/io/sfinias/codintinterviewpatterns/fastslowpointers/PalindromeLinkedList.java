package io.sfinias.codintinterviewpatterns.fastslowpointers;

/*
Given the head of a Singly LinkedList, write a method to check if the LinkedList is a palindrome or not.

Your algorithm should use constant space and the input LinkedList should be in the original form once the algorithm is finished. The algorithm should have O(N)O(N) time complexity where ‘N’ is the number of nodes in the LinkedList.

Example 1:

Input: 2 -> 4 -> 6 -> 4 -> 2 -> null
Output: true

Example 2:

Input: 2 -> 4 -> 6 -> 4 -> 2 -> 2 -> null
Output: false
 */

import io.sfinias.codintinterviewpatterns.fastslowpointers.LinkedListCycle.ListNode;

public class PalindromeLinkedList {

    public static boolean isPalindrome(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalfReversed = reverse(slow);

        ListNode start1 = head;
        ListNode start2 = secondHalfReversed;
        while (start1 != null && start2 != null) {
            if (start1.value != start2.value) break;
            start1 = start1.next;
            start2 = start2.next;
        }

        reverse(secondHalfReversed);
        return start1 == null || start2 == null;

    }

    private static ListNode reverse(ListNode head) {

        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }



}
