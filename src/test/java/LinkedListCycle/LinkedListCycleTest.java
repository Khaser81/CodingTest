package LinkedListCycle;

import org.example.leetcode.LinkedList.LinkedListCycle.LinkedListCycle;
import org.example.leetcode.LinkedList.ListNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListCycleTest {
	private final LinkedListCycle linkedListCycle = new LinkedListCycle();
	@Test
	@DisplayName("Four arguments")
	void normal_pattern1() {
		ListNode listNode = new ListNode(3);
		listNode.next = new ListNode(2);
		listNode.next.next = new ListNode(0);
		listNode.next.next.next = new ListNode(-4);
		listNode.next.next.next.next = listNode.next;
		assertTrue(linkedListCycle.hasCycle(listNode));
	}

	@Test
	@DisplayName("Two arguments")
	void normal_pattern2() {
		ListNode listNode = new ListNode(1);
		listNode.next = new ListNode(2);
		listNode.next.next = listNode;
		assertTrue(linkedListCycle.hasCycle(listNode));
	}

	@Test
	@DisplayName("One arguments")
	void normal_pattern3() {
		ListNode listNode = new ListNode(1);
		assertFalse(linkedListCycle.hasCycle(listNode));
	}
}
