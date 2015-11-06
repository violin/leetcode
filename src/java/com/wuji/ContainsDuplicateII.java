package com.wuji;

import java.util.*;

/**
 * Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.
 *
 *
 * Created by yangzhou on 15/11/5.
 */
public class ContainsDuplicateII {
    /**
     * accepted , but not good enough.
     * @param nums
     * @param k
     * @return
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length==0 || nums.length==1) return false;
        Map<Integer,List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i])==null){
                map.put(nums[i],new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        for (Integer integer : map.keySet()) {
            if (map.get(integer).size()==1)continue;
            for (int i = 0; i < map.get(integer).size()-1; i++) {
                if (map.get(integer).get(i+1) -map.get(integer).get(i) <=k) return true;
            }
        }
        return false;
    }

    /**
     * hot solution by leetcoder, brilliant!
     * A set returns false when it already contains the object.
     * @param nums
     * @param k
     * @return
     */
    public boolean containsNearbyDuplicate2(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true;
        }
        return false;
    }

}
