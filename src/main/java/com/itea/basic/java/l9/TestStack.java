package com.itea.basic.java.l9;

public class TestStack {

    public static void main(String[] args) {
        testStack(new ArrayStack());
        testStack(new LinkedStack());
    }

    private static void testStack(IntStack stack) {
        stack.push(10);
        stack.push(6);
        stack.push(4);
        assert stack.pop() == 4;
        assert stack.pop() == 6;
        assert stack.pop() == 10;
        System.out.println("success");
    }
}
