package com.wuji.geniusSolutions;

/**
 *
 * Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

 Solve it without division and in O(n).

 For example, given [1,2,3,4], return [24,12,8,6].

 Follow up:
 Could you solve it with constant space complexity? (Note: The output array does not count as extra space for the purpose of space complexity analysis.)


 * Created by yangzhou on 15-10-9.
 */
public class u_ProdectOfArrayExceptSelf {


    /**
     * 通过两次循环,解决问题.关键是如何想到的?
     * 是否可以理解为 每个元素的组成包括左和右,进一步发现所有的左可以由一次循环达成.
     * 通过不能有额外存储的前提,进而想到将每个元素的构成拆成常数个部分,然后建立每个部分之间的联系.
     * @param nums
     * @return
     */
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }
}
