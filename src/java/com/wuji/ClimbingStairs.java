package com.wuji;


/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 * <p/>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * <p/>
 * <p/>
 * Created by yangzhou on 15-10-12.
 */
public class ClimbingStairs {

    //there are 2 ways( recursive and iterative), using latter.
    public int climbStairs(int n) {
        int solution;
        int[] solutions = new int[n + 2];
        solutions[1] = 1;
        solutions[2] = 2;

        for (int i = 3; i <= n; i++) {
            solutions[i] = solutions[i-2]+solutions[i-1];
        }
        return solutions[n];
    }

    public static void main(String[] args) {
        System.out.println(new ClimbingStairs().climbStairs(10));
    }
}
