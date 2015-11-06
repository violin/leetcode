package com.wuji.linkedList;

import com.wuji.common.ListNode;

/**
 * Given a linked list, remove the nth node from the end of list and return its head.

 For example,

 Given linked list: 1->2->3->4->5, and n = 2.

 After removing the second node from the end, the linked list becomes 1->2->3->5.
 Note:
 Given n will always be valid.
 Try to do this in one pass.


 * Created by yangzhou on 15/11/5.
 */
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode voidHead = new ListNode(-1);
        voidHead.next = head;
        ListNode p1 = voidHead;
        ListNode p2 = voidHead;
        while (p1.next!=null){
            p1=p1.next;
            if (n--<=0)p2=p2.next;
        }
        if (p2.next!=null) p2.next=p2.next.next;
        return voidHead.next;
    }


}
