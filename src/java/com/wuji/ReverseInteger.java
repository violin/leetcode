package com.wuji;

/**
 * Reverse digits of an integer.

 Example1: x = 123, return 321
 Example2: x = -123, return -321

 click to show spoilers.

 Have you thought about this?
 Here are some good questions to ask before coding. Bonus points for you if you have already thought through this!

 If the integer's last digit is 0, what should the output be? ie, cases such as 10, 100.

 Did you notice that the reversed integer might overflow? Assume the input is a 32-bit integer, then the reverse of 1000000003 overflows. How should you handle such cases?

 For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.


 * Created by yangzhou on 15-9-6.
 */
public class ReverseInteger {
    public int reverse(int x) {
        long r = 0;
        while (x!=0){
            r = r*10 + x%10;
            x /=10;
        }
        if (r>Integer.MAX_VALUE || r<Integer.MIN_VALUE){
            return 0;
        }
        return (int)r;
    }

    public static void main(String[] args) {
//        System.out.println(new ReverseInteger().reverse(-123));
//        System.out.println(new ReverseInteger().reverse(-321));
//        System.out.println(new ReverseInteger().reverse(321));
//        System.out.println(new ReverseInteger().reverse(1000000003));
//        System.out.println(new ReverseInteger().reverse(100000000));
        System.out.println(new ReverseInteger().reverse(-2147483648));
    }

}

