package com.wuji;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/palindrome-number/
 * Created by yangzhou on 15-8-3.
 */
public class MajorityElement {

//    public int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        return nums[nums.length/2];
//    }

    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer> ();
        int ma= 0;
        int maCount = 0;
        for (int num : nums) {
           if (!map.containsKey(num)){
               map.put(num,1);
           }else {
               map.put(num,map.get(num)+1);
           }
            if (map.get(num)>maCount){
                ma = num;
                maCount = map.get(num);
            }
        }
        return ma;
    }

}
