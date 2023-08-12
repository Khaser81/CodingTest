import org.example.leetcode.LinkedListCycle.LinkedListCycle;
import org.example.leetcode.LinkedListCycle.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListCycleTest {
	private final LinkedListCycle linkedListCycle = new LinkedListCycle();
	@Test
	void normal_pattern1() {
		ListNode listNode = new ListNode(3);
		listNode.next = new ListNode(2);
		listNode.next.next = new ListNode(0);
		listNode.next.next.next = new ListNode(-4);
		listNode.next.next.next.next = listNode.next;
		assertEquals(true, linkedListCycle.hasCycle(listNode));
	}

	@Test
	void normal_pattern2() {
		ListNode listNode = new ListNode(1);
		listNode.next = new ListNode(2);
		listNode.next.next = listNode;
		assertEquals(true, linkedListCycle.hasCycle(listNode));
	}

	@Test
	void normal_pattern3() {
		ListNode listNode = new ListNode(1);
		assertEquals(false, linkedListCycle.hasCycle(listNode));
	}
}
