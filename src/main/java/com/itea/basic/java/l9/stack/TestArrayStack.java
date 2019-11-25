package com.itea.basic.java.l9.stack;

import com.itea.basic.java.l9.IntStack;

public class TestArrayStack {

    public static void main(String[] args) {

        IntStack stack = new LinkedStack();
        stack.push(5);
        stack.push(0);
        stack.push(13);

        int a1 = stack.pop();
        int a2 = stack.pop();
        int a3 = stack.pop();

        assert a1 == 13;
        assert a2 == 0;
        assert a3 == 5;
    }
}
