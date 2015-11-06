package com.wuji.linkedList;

import com.wuji.common.ListNode;

/**
 * Remove all elements from a linked list of integers that have value val.

 Example
 Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
 Return: 1 --> 2 --> 3 --> 4 --> 5


 * Created by yangzhou on 15/11/6.
 */
public class RemoveLinkedListElements {

    /**
     * using voidHead
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements(ListNode head, int val) {
        ListNode voidHead = new ListNode(-1);
        voidHead.next=head;
        ListNode pointer = voidHead;
        while (pointer.next!=null){
            if (pointer.next.val == val){
                pointer.next = pointer.next.next;
            }else {
                pointer =pointer.next;
            }
        }
        return voidHead.next;
    }
}
