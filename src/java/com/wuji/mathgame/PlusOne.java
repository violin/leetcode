package com.wuji.mathgame;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 * Given a non-negative number represented as an array of digits, plus one to the number.

 The digits are stored such that the most significant digit is at the head of the list.


 * Created by yangzhou on 15-9-6.
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        List<Integer> ds = new ArrayList<Integer>();
        for (int digit : digits) {
            ds.add(digit);
        }
        boolean jinwei = true;

        for (int i = ds.size()-1; i >=0 ; i--) {
           if (ds.get(i) != 9){
               ds.set(i,ds.get(i)+1);
               jinwei = false;
               break;
           }else {
               ds.set(i,0);
           }
        }

        if (jinwei){
            ds.add(0,1);
        }
        int[] returnInts = new int[ds.size()];
        for (int j = 0; j < ds.size(); j++) {
            returnInts[j] = ds.get(j);
        }
        return  returnInts;
    }

    /**
     * other solution by leetcoder
     * @param digits
     * @return
     */
    public int[] plusOne2(int[] digits) {
        for (int i = digits.length - 1; i >=0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (digits[0] == 0) {
            int[] res = new int[digits.length+1];
            res[0] = 1;
            return res;
        }
        return digits;
    }
    public static void main(String[] args) {
        int[] ints = new PlusOne().plusOne(new int[]{1, 2, 3});
        int[] ints2 = new PlusOne().plusOne(new int[]{1, 2, 9});
        int[] ints3 = new PlusOne().plusOne(new int[]{9, 9, 9});
        System.out.println("hel");
    }

}
