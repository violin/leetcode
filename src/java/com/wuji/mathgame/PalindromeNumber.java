package com.wuji.mathgame;

/**
 * https://leetcode.com/problems/palindrome-number/
 * <p/>
 * Determine whether an integer is a palindrome. Do this without extra space.
 * <p/>
 * click to show spoilers.
 * <p/>
 * Some hints:
 * Could negative integers be palindromes? (ie, -1)
 * <p/>
 * If you are thinking of converting the integer to string, note the restriction of using extra space.
 * <p/>
 * You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?
 * <p/>
 * There is a more generic way of solving this problem.
 * <p/>
 * <p/>
 * Created by yangzhou on 15-8-3.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int div = 1;
        int length = 1;
        while (x / div >= 10) {
            div *= 10;
            length++;
        }

        for (int i = 0; i < length / 2; i++) {
            if (x % 10 != x / div % 10) {
                return false;
            }
            x /= 10;
            div /= 100;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new PalindromeNumber().isPalindrome(11));
    }
}
