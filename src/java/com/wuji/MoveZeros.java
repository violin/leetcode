package com.wuji;

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * <p/>
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 * <p/>
 * Note:
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 * <p/>
 * <p/>
 * Created by yangzhou on 15-10-6.
 */
public class MoveZeros {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 0){
                switchzero(nums, i);
            }
        }
    }

    private void switchzero(int[] nums, int i) {
        for (int j = i+1;j<nums.length; j++) {
            if (nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i = j;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        new MoveZeros().moveZeroes(nums);
        System.out.println(nums);
    }


    // best solution: 自插入排序
    public void moveZeroes2(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int insertPos = 0;
        for (int num: nums) {
            if (num != 0) nums[insertPos++] = num;
        }

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
}
