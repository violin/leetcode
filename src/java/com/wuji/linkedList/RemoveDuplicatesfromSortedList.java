package com.wuji.linkedList;

import com.wuji.common.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.

 For example,
 Given 1->1->2, return 1->2.
 Given 1->1->2->3->3, return 1->2->3.



 * Created by yangzhou on 15-10-12.
 */
public class RemoveDuplicatesfromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> s = new HashSet<Integer>();
        ListNode cur = head;
        ListNode pre = new ListNode(0);
        pre.next = head;
        while(cur!=null){
            if(s.contains(new Integer(cur.val))){
                pre.next = cur.next;
            }else{
                s.add(new Integer(cur.val));
                pre = pre.next;
            }
            cur = cur.next;
        }
        return head;
    }
}
