package LinkedListCycle;

import org.example.leetcode.LinkedList.LinkedListCycle.LinkedListCycle2;
import org.example.leetcode.LinkedList.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LinkedListCycle2Test {
	private final LinkedListCycle2 linkedListCycle2 = new LinkedListCycle2();
	@Test
	@DisplayName("Four arguments")
	void normal_pattern1() {
		ListNode listNode = new ListNode(3);
		listNode.next = new ListNode(2);
		listNode.next.next = new ListNode(0);
		listNode.next.next.next = new ListNode(-4);
		listNode.next.next.next.next = listNode.next;
		Assertions.assertEquals(listNode.next, linkedListCycle2.detectCycle(listNode));
	}

	@Test
	@DisplayName("Two arguments")
	void normal_pattern2() {
		ListNode listNode = new ListNode(1);
		listNode.next = new ListNode(2);
		listNode.next.next = listNode;
		Assertions.assertEquals(listNode.next.next, linkedListCycle2.detectCycle(listNode));
	}

	@Test
	@DisplayName("One arguments")
	void normal_pattern3() {
		ListNode listNode = new ListNode(1);
		Assertions.assertEquals(null, linkedListCycle2.detectCycle(listNode));
	}
}
