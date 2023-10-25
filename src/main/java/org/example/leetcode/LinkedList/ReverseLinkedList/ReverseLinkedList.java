package org.example.leetcode.LinkedList.ReverseLinkedList;

import org.example.leetcode.LinkedList.ListNode;

/**
 * 以下の図がわかりやすい。
 * https://leetcode.com/problems/reverse-linked-list/solutions/2682085/java-0ms-100-easy-understanding/
 * 参照の向き先を逆参照にしていく。
 *
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 *
 * Input: head = [1,2]
 * Output: [2,1]
 *
 * Input: head = []
 * Output: []
 */
public class ReverseLinkedList {
        public ListNode reverseList(ListNode listNode) {
            ListNode result = null;
            ListNode current = listNode; //currentにコピー


            while(current != null) {
                ListNode currentNextTmp = current.next; //次のListNodeをcurrent.nextに退避
                current.next = result; //current.nextを書き換え、前のListNodeを入れる。
                result = current; //resultにセット
                current = currentNextTmp; //次のcurrentへループ
            }
            return result;
        }
}
