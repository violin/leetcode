package com.wuji;

/**
 * Created by yangzhou on 15-8-25.
 */
public class u_UglyNumber {
    public boolean isUgly(int num) {
        for (int i =2;i<6;i++){
            while (num % i ==0){
                num /=i;
            }
        }
        return num ==1;
    }

}
