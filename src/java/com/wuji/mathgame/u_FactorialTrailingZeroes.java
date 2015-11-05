package com.wuji.mathgame;

/**
 * Given an integer n, return the number of trailing zeroes in n!.
 * <p/>
 * Note: Your solution should be in logarithmic time complexity.
 * <p/>
 * <p/>
 * <p/>
 * <p/>
 * Created by yangzhou on 15/10/28.
 */
public class u_FactorialTrailingZeroes {


    /**
     * 2的因子肯定够,所以看的是阶乘后有几个5
     * @param n
     * @return
     */
    public int trailingZeroes(int n) {
        int s = 0;
        while (n > 1) s += (n /= 5);
        return s;
    }

}
