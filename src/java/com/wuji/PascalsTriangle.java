package com.wuji;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yangzhou on 15-8-6.
 */
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        if (numRows>=1){
            triangle.add(Arrays.asList(1));
        }
        if (numRows>=2){
            triangle.add(Arrays.asList(1,1));
        }
        if (numRows>=3){
            for (int i = 1; i < numRows-1; i++) {
                List<Integer> pre = triangle.get(i);
                List<Integer> next = new ArrayList<Integer>();
                next.add(1);
                for (int j = 0; j < pre.size()-1; j++) {
                    next.add(pre.get(j) + pre.get(j+1));
                }
                next.add(1);
                triangle.add(next);
            }
        }
        return triangle;
    }

    public static void main(String[] args) {
        System.out.println(new PascalsTriangle().generate(5));
    }
}
