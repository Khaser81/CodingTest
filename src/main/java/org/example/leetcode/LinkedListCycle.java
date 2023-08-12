package org.example.leetcode;

/*
141. Linked List Cycle
Easy
Given head, the head of a linked list, determine if the linked list has a cycle in it.
There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
Return true if there is a cycle in the linked list. Otherwise, return false.

https://leetcode.com/problems/linked-list-cycle/description/
 */
public class LinkedListCycle {

	public boolean hasCycle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;

		while(fast != null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow==fast){
				return true;
			}
		}
		return false;
	}


	/**
	 * Definition for singly-linked list.
	 * class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) {
	 *         val = x;
	 *         next = null;
	 *     }
	 * }
	 */
}

class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	  }

  class main {
	  public static void main(String[] args) {
		  ListNode listNode = new ListNode(3);
		  listNode.next = new ListNode(2);
		  listNode.next.next = new ListNode(0);
		  listNode.next.next.next = new ListNode(-4);
		  listNode.next.next.next.next = listNode.next;
		  System.out.println(new LinkedListCycle().hasCycle(listNode));
	  }
  }
