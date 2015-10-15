package com.wuji.mathgame;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by yangzhou on 15-10-12.
 */
public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> existSet = new HashSet<Integer>();
        while (n !=1 && !existSet.contains(n)){
            existSet.add(n);
            String s = String.valueOf(n);
            n =0;
            for (int i = 0; i < s.length(); i++) {
                n+= Math.pow(Integer.parseInt(s.substring(i,i+1)),2);
            }
        }
        return n==1;
    }

    public static void main(String[] args) {
        System.out.println(new HappyNumber().isHappy(19));
    }
}
