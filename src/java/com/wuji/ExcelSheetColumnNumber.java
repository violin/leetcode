package com.wuji;

/**
 * Related to question Excel Sheet Column Title

 Given a column title as appear in an Excel sheet, return its corresponding column number.

 For example:

 A -> 1
 B -> 2
 C -> 3
 ...
 Z -> 26
 AA -> 27
 AB -> 28


 * Created by yangzhou on 15-8-25.
 */
public class ExcelSheetColumnNumber {

    public int titleToNumber(String s) {
        int length = s.length();
        int num=0;
        for (int i = 0; i < length; i++) {
            num*=26;
            num += (s.charAt(i) -'A' +1);
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(new ExcelSheetColumnNumber().titleToNumber("A"));
    }

}
