package com.wuji.array;

/**
 *
 * Given an array and a value, remove all instances of that value in place and return the new length.

 The order of elements can be changed. It doesn't matter what you leave beyond the new length.


 * Created by yangzhou on 15-10-20.
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int find = 0;
        for (int i = 0; i + find < nums.length; i++) {
            if (nums[i] == val ) {
               nums[i] = nums[nums.length-1-find];
               i--;
               find++;
            }
        }
        return nums.length - find;
    }


    /**
     * solutions by leetcoder, 正向的更新有时候比反向置换更清晰.
     * @param A
     * @param n
     * @param elem
     * @return
     */
    int removeElement2(int A[], int n, int elem) {
        int begin=0;
        for(int i=0;i<n;i++) if(A[i]!=elem) A[begin++]=A[i];
        return begin;
    }

}
