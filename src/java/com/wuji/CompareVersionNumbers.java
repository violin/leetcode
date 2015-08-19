package com.wuji;

/**
 * https://leetcode.com/problems/palindrome-number/
 * Created by yangzhou on 15-8-3.
 */
public class CompareVersionNumbers {

    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int i = 0;
        while (v1.length >i && v2.length>i){
            int node1 = Integer.parseInt(v1[i]);
            int node2 = Integer.parseInt(v2[i]);
            if (node1!=node2){
                return (node1-node2)/ Math.abs(node1-node2);
            }

            i++;
        }
        if (v1.length!=v2.length){

            if (v2.length>v1.length){
                for (;i<v2.length;i++){
                    int temp = Integer.parseInt(v2[i]);
                    if (temp != 0) return -1;
                }
            }
            if (v1.length>v2.length){
                for (;i<v1.length;i++){
                    int temp = Integer.parseInt(v1[i]);
                    if (temp != 0) return 1;
                }
            }
            return 0;
        }else {
            return 0;
        }

    }

    public static void main(String[] args) {
        System.out.println(new CompareVersionNumbers().compareVersion("1","1"));
        System.out.println(new CompareVersionNumbers().compareVersion("1.2","1.3"));
        System.out.println(new CompareVersionNumbers().compareVersion("1.2.3.4","1.2.4"));
        System.out.println(new CompareVersionNumbers().compareVersion("1.0.0.1","1"));
    }
}
