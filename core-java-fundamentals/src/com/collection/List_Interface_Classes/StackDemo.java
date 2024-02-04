package com.collection.linkeInterfaceClasses;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack stk = new Stack();

        if(stk.empty()) {
            System.out.println("Stack is empty");
        }

        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);

        System.out.println("top of stack is at "+ stk.peek());

        stk.pop();

        System.out.println(stk);
        int i = stk.search(4);
        System.out.println("4 is present at index "+ i);
        i = stk.search(1);
        System.out.println("1 is present at index "+ i);
    }

}