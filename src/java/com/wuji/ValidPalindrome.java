package com.wuji;

/**
 *
 *
 Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

 For example,
 "A man, a plan, a canal: Panama" is a palindrome.
 "race a car" is not a palindrome.

 Note:
 Have you consider that the string might be empty? This is a good question to ask during an interview.

 For the purpose of this problem, we define empty string as valid palindrome.


 * Created by yangzhou on 15-8-25.
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s == null || s.length()==0){
            return true;
        }
        int f=0,t=s.length()-1;
        while (f<t){
            while (!isValid(s,f)) {
                f++;
                if (f>=s.length()) return true;
            }
            while (!isValid(s,t)) {
                t--;
                if (t<=0) return true;
            }
            if (!new String(new char[]{s.charAt(f++)}).equalsIgnoreCase(new String(new char[]{s.charAt(t--)})))
                return false;
        }
        return true;
    }

    private boolean isValid(String s, int f) {
      return   (s.charAt(f)>='a'&& s.charAt(f)<='z') || (s.charAt(f)>='A'&& s.charAt(f)<='Z') || (s.charAt(f)>='0'&& s.charAt(f)<='9');
    }

    public static void main(String[] args) {
//        System.out.println(new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(new ValidPalindrome().isPalindrome("1a2"));
    }
}
