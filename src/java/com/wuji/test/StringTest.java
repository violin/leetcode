package com.wuji.test;

import java.io.UnsupportedEncodingException;

/**
 * Created by yangzhou on 15-9-10.
 */
public class StringTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String test1 = new String("test");
        String test2 =  new String(test1.getBytes(),"gbk");
        System.out.println(test1.equals(test2));
    }
}
