package com.wuji;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yangzhou on 15-8-6.
 */
public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex ==0){
            return Arrays.asList(1);
        }
        if (rowIndex ==1){
            return Arrays.asList(1,1);
        }
        if (rowIndex>1){
            List<Integer> pre = getRow(rowIndex - 1);
            List<Integer> next = new ArrayList<Integer>();
            next.add(1);
            for (int j = 0; j < pre.size()-1; j++) {
                next.add(pre.get(j) + pre.get(j+1));
            }
            next.add(1);
            return next;
        }
        return null;

    }

    public static void main(String[] args) {
        System.out.println(new PascalsTriangleII().getRow(4));
    }
}
