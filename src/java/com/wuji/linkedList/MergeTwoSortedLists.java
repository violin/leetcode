package com.wuji.linkedList;

import com.wuji.common.ListNode;

/**
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 *
 *
 * Created by yangzhou on 15-10-20.
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode curNode = new ListNode(-1);
        ListNode headNode = curNode;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curNode.next = l1;
                l1 = l1.next;
            } else {
                curNode.next = l2;
                l2 = l2.next;
            }
            curNode = curNode.next;
        }
        if (l1 == null) {
            curNode.next = l2;
        } else if (l2 == null) {
            curNode.next = l1;
        }
        return headNode.next;
    }
}
