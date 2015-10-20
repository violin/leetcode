package com.wuji.mathgame;

/**
 *
 * Given an array of integers, every element appears twice except for one. Find that single one.

 Note:
 Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?


 * Created by yangzhou on 15-8-20.
 */
public class SingleNumber {


    /**
     * 异或的作用!!!
     * @param A
     * @return
     */
    public int singleNumber(int[] A) {
        int a=0;
        for(int i:A)
            a^=i;
        return a;
    }
}
