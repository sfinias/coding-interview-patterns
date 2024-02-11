package io.sfinias.codintinterviewpatterns.fastslowpointers;

import static org.junit.jupiter.api.Assertions.*;

import io.sfinias.codintinterviewpatterns.fastslowpointers.LinkedListCycle.ListNode;
import org.junit.jupiter.api.Test;

class PalindromeLinkedListTest {

    @Test
    void test() {

        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(2);
        assertTrue(PalindromeLinkedList.isPalindrome(head));

        head.next.next.next.next.next = new ListNode(2);
        assertFalse(PalindromeLinkedList.isPalindrome(head));


    }
}