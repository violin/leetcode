package com.wuji.dynamicProgramming;

/**
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 * <p/>
 * Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
 * <p/>
 * <p/>
 * Created by yangzhou on 15/10/27.
 */
public class u_HouseRobber {


    /**
     * 动态规划
     * 基于以下判断:x长度的数组的rob最大值由两种情况产生- 第x个包含和不包含.
     * 第x个包含 = (x-1)数组的不包含加上第x个元素
     * 第x个不包含 = (x-1)数组的rob最大值
     *
     * tempResult的二维数组代表包含与不包含情况的rob最大值
     * @param nums
     * @return
     */
    public int rob(int[] nums) {
        int[][] tempResult = new int[nums.length+1][2];
        for (int i = 1; i < nums.length+1 ; i++) {
            tempResult[i][0] = Math.max(tempResult[i-1][1],tempResult[i-1][0]);
            tempResult[i][1] = tempResult[i-1][0] + nums[i-1];
        }
        return Math.max(tempResult[nums.length][0],tempResult[nums.length][1]);
    }
}
