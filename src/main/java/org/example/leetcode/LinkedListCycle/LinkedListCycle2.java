package org.example.leetcode.LinkedListCycle;
/*
142. Linked List Cycle II
Medium
Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously
 following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer
 is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.

Do not modify the linked list.
https://leetcode.com/problems/linked-list-cycle-ii/description/
 */
public class LinkedListCycle2 {
	public ListNode detectCycle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				// If the pointers meet, there is a cycle in the linked list.
				// Reset the slow pointer to the head of the linked list, and move both pointers one step at a time
				// until they meet again. The node where they meet is the starting point of the cycle.
				slow = head;
				while (slow != fast) {
					slow = slow.next;
					fast = fast.next;
				}
				return slow;
			}
		}

		// If the fast pointer reaches the end of the list without meeting the slow pointer,
		// there is no cycle in the linked list. Return null.
		return null;
	}
}
