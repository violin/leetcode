package com.wuji.string;

import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * <p>
 * <p>
 * <p>
 * <p>
 * Created by yangzhou on 15/11/6.
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == '(' ||
                    currentChar == '[' ||
                    currentChar == '{'
                    ) {
                stack.push(currentChar);
            }
            if (currentChar == ')' ||
                    currentChar == ']' ||
                    currentChar == '}'){
                if (stack.empty() || !pairable(stack.pop(),currentChar)){
                    return false;
                }
            }
        }
        return stack.empty();
    }

    private boolean pairable(char a, char b) {
        return (a=='(' && b==')') ||
                (a=='[' && b==']') ||
                (a=='[' && b=='}') ;
    }
}
