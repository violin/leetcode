package com.wuji.geniusSolutions;

import com.wuji.common.ListNode;

/**
 * Given a linked list, determine if it has a cycle in it.
 * <p/>
 * Follow up:
 * Can you solve it without using extra space?
 * <p/>
 * <p/>
 * Created by yangzhou on 15-10-8.
 */
public class u_LinkedListCycle {



    /**
     * leetcoder's solution 1
     *
     * comment : The program gives every visited node a sign by pointing next to the node itself.
     *
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        ListNode p = head, pre = head;
        while (p != null && p.next != null) {
            if (p.next == head) return true;
            p = p.next;
            pre.next = head;
            pre = p;
        }
        return false;
    }


    /**
     * leetcoder's solution 2
     *
     * comment : Use two pointers, walker and runner.
     walker moves step by step. runner moves two steps at time.
     if the Linked List has a cycle walker and runner will meet at some point.

     ps . No extra space usually means constant space.
     * @param head
     * @return
     */
    public boolean hasCycle2(ListNode head) {
        if(head==null) return false;
        ListNode walker = head;
        ListNode runner = head;
        while(runner.next!=null && runner.next.next!=null) {
            walker = walker.next;
            runner = runner.next.next;
            if(walker==runner) return true;
        }
        return false;
    }
}
