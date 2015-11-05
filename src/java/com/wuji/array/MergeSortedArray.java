package com.wuji.array;

/**
 * Created by yangzhou on 15/11/5.
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pivot = nums1.length-1;
        for (int i = m-1; i >=0 && m >0; i--) {
            nums1[pivot--] = nums1[i];
        }
        int mPointer = nums1.length - m;
        int nPointer = 0;
        for (int i = 0; i < m + n; i++) {
            if ( nPointer>= n || (mPointer<nums1.length && nums1[mPointer]<=nums2[nPointer]) ){
                nums1[i]=nums1[mPointer++];
            }else {
                nums1[i]=nums2[nPointer++];
            }
        }
    }
}
