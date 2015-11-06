package com.wuji.linkedList;

import com.wuji.common.ListNode;

/**
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 * <p/>
 * <p/>
 * For example, the following two linked lists:
 * <p/>
 * A:          a1 → a2
 * ↘
 * c1 → c2 → c3
 * ↗
 * B:     b1 → b2 → b3
 * begin to intersect at node c1.
 * <p/>
 * <p/>
 * Notes:
 * <p/>
 * If the two linked lists have no intersection at all, return null.
 * The linked lists must retain their original structure after the function returns.
 * You may assume there are no cycles anywhere in the entire linked structure.
 * Your code should preferably run in O(n) time and use only O(1) memory.
 * <p/>
 * <p/>
 * Created by yangzhou on 15-8-20.
 */
public class IntersectionofTwoLinkedLists {

    /**
     * 常规解法
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        int lenA = 0, lenB = 0;
        ListNode currA = headA, currB = headB;
        while(currA != null) {
            lenA++;
            currA = currA.next;
        }
        while(currB != null) {
            lenB++;
            currB = currB.next;
        }
        currA = headA;
        currB = headB;
        if(lenA > lenB) {
            for(int i=0; i<lenA-lenB; i++)
                currA = currA.next;
        } else {
            for(int i=0; i<lenB-lenA; i++)
                currB = currB.next;
        }
        while(currA != currB) {
            currA = currA.next;
            currB = currB.next;
        }
        return currA;
    }

    /**
     * 该解法是网上一个人的,比较精妙.但实际上效率不如普通解法高
     *
     * @param headA
     * @param headB
     * @return
     */
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB;

        if (p1 == null || p2 == null) return null;

        while (p1 != null && p2 != null && p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;

            //
            // Any time they collide or reach end together without colliding
            // then return any one of the pointers.
            //
            if (p1 == p2) return p1;

            //
            // If one of them reaches the end earlier then reuse it
            // by moving it to the beginning of other list.
            // Once both of them go through reassigning,
            // they will be equidistant from the collision point.
            //
            if (p1 == null) p1 = headB;
            if (p2 == null) p2 = headA;
        }

        return p1;
    }
}
