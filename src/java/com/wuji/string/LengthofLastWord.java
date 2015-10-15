package com.wuji.string;

/**
 * Created by yangzhou on 15-8-19.
 */
public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        return s.indexOf(' ')==-1?s.length():s.substring(s.lastIndexOf(' ')).length()-1;
    }

    public static void main(String[] args) {
        System.out.println(new LengthofLastWord().lengthOfLastWord("hello World"));
    }
}
