package com.wuji;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * Given two strings s and t, write a function to determine if t is an anagram of s.

 For example,
 s = "anagram", t = "nagaram", return true.
 s = "rat", t = "car", return false.

 Note:
 You may assume the string contains only lowercase alphabets.


 * @author yangzhou.wuji
 */
public class ValidAnagram{

        // 其他人的答案
        private static final int[] PRIMES = new int[]{3, 5, 7, 11 ,13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
                73, 79, 83, 89, 97, 101, 107, 109};
        public boolean isAnagram(String s, String t) {
                return hash(s) == hash(t);
        }

        private long hash(String s) {
                long hash = 1;
                for (int i = 0; i < s.length(); i++) {
                        hash *= PRIMES[s.charAt(i) - 'a'];
                }
                return hash;
        }

        // 我的答案，没通过

//        public boolean isAnagram(String s, String t) {
//                if(s==null){
//                        return t==null;
//                }
//                Map<String,Integer> sMap = new HashMap<String,Integer>();
//                for(int i=0;i<s.length();i++){
//                        String cur = s.charAt(i) +"";
//                        if(sMap.containsKey(cur)){
//                                sMap.put(cur ,sMap.get(cur)+1);
//                        }else {
//                                sMap.put(cur,1);
//                        }
//                }
//                Map<String,Integer> tMap = new HashMap<String,Integer>();
//                for(int i=0;i<t.length();i++){
//                        String cur = t.charAt(i) +"";
//                        if(tMap.containsKey(cur)){
//                                tMap.put(cur ,tMap.get(cur)+1);
//                        }else {
//                                tMap.put(cur,1);
//                        }
//                }
//                if (sMap.keySet().size() != tMap.keySet().size()){
//                        return false;
//                }
//                for (String node : sMap.keySet()) {
//                        if (tMap.get(node) != sMap.get(node)){
//                                return false;
//                        }
//                }
//                return true;
//        }
        public static void main(String[] args) {
                boolean anagram = new ValidAnagram().isAnagram("az", "za");
                System.out.println(anagram);
        }
}
