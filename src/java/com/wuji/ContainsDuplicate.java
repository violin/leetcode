package com.wuji;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by yangzhou on 15-8-20.
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        final Set<Integer> distinct = new HashSet<Integer>();
        for(int num : nums) {
            if(distinct.contains(num)) {
                return true;
            }
            distinct.add(num);
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(new ContainsDuplicate().containsDuplicate(new int[]{1,3}));
    }
}
