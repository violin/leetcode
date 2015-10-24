package com.wuji.geniusSolutions;

/**
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

 Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.


 * Created by yangzhou on 15-10-24.
 */
public class u_HouseRobber {
    /**
     * 思路有问题...错的
     * @param nums
     * @return
     */
    public int rob(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        if (nums.length==1){
            return nums[0];
        }
        if (nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        int rob =0,left=nums[1];
        for (int i = 0; i < nums.length; i++) {
           if (i!=0 && i!=nums.length-1 && nums[i]<left )  left= nums[i];
           rob+=nums[i];
        }
        return rob-left;
    }

    /**
     * 用动态规划 -- by leetcoder
     * @param num
     * @return
     */
    public static int rob2(int[] nums)
    {
        int ifRobbedPrevious = 0;   // max monney can get if rob current house
        int ifDidntRobPrevious = 0; // max money can get if not rob current house

        // We go through all the values, we maintain two counts, 1) if we rob this cell, 2) if we didn't rob this cell
        for(int i=0; i < nums.length; i++)
        {
            // If we rob current cell, previous cell shouldn't be robbed. So, add the current value to previous one.
            int currRobbed = ifDidntRobPrevious + nums[i];

            // If we don't rob current cell, then the count should be max of the previous cell robbed and not robbed
            int currNotRobbed = Math.max(ifDidntRobPrevious, ifRobbedPrevious);

            // Update values for the next round
            ifDidntRobPrevious  = currNotRobbed;
            ifRobbedPrevious = currRobbed;
        }

        return Math.max(ifRobbedPrevious, ifDidntRobPrevious);
    }

}
