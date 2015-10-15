package com.wuji.stacks;

import java.util.Stack;

/**
 * Implement the following operations of a queue using stacks.
 * <p/>
 * push(x) -- Push element x to the back of queue.
 * pop() -- Removes the element from in front of queue.
 * peek() -- Get the front element.
 * empty() -- Return whether the queue is empty.
 * <p/>
 * Notes:
 * You must use only standard operations of a stack -- which means only push to top, peek/pop from top, size, and is empty operations are valid.
 * Depending on your language, stack may not be supported natively. You may simulate a stack by using a list or deque (double-ended queue), as long as you use only standard operations of a stack.
 * You may assume that all operations are valid (for example, no pop or peek operations will be called on an empty queue).
 * <p/>
 * <p/>
 * <p/>
 * <p/>
 * Created by yangzhou on 15-10-12.
 */
public class u_ImplementQueueusingStacks {
    private Stack<Integer> inputStack = new Stack<Integer>();
    private Stack<Integer> outputStack = new Stack<Integer>();

    // Push element x to the back of queue.
    public void push(int x) {
        inputStack.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if (outputStack.empty()){
            while (!inputStack.empty()){
                outputStack.push(inputStack.pop());
            }
        }
        outputStack.pop();
    }

    // Get the front element.
    public int peek() {
        if (outputStack.empty()){
            while (!inputStack.empty()){
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return inputStack.empty() && outputStack.empty();
    }
}
