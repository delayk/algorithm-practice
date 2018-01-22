package com.kai.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddTwoNumbersTest {
    @Test
    public void addTwoNumbers() throws Exception {
        AddTwoNumbers.ListNode node = AddTwoNumbers.addTwoNumbers(new AddTwoNumbers.ListNode(7), new AddTwoNumbers.ListNode(3));
        assertEquals(0, node.val);
        assertEquals(1, node.next.val);
        assertNull(node.next.next);

        node = AddTwoNumbers.addTwoNumbers(new AddTwoNumbers.ListNode(7), new AddTwoNumbers.ListNode(2));
        assertEquals(9, node.val);
        assertNull(node.next);
    }

}