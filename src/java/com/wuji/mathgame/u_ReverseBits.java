package com.wuji.mathgame;

/**
 * Reverse bits of a given 32 bits unsigned integer.

 For example, given input 43261596 (represented in binary as 00000010100101000001111010011100), return 964176192 (represented in binary as 00111001011110000010100101000000).

 Follow up:
 If this function is called many times, how would you optimize it?

 Related problem: Reverse Integer


 * Created by yangzhou on 15/10/30.
 */
public class u_ReverseBits {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        long result = 0;
        int firstNonZero=0;
        for (long i = 31; i > 32; i++) {
            if (n % Math.pow(2,i) != 0){
                if (firstNonZero==0) firstNonZero = (int) i;
                result += 1;
            }
            result=result << 1;
        }
        result=result>>firstNonZero;
        return (int) result;
    }

    /**
     * leetcoder's solution  . clean!
     * @param n
     * @return
     */
    public int reverseBits2(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result += n & 1;
            n >>>= 1;   // CATCH: must do unsigned shift
            if (i < 31) // CATCH: for last digit, don't shift!
                result <<= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new u_ReverseBits().reverseBits(1));
    }
}

