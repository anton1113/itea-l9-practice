package com.itea.basic.java.l9;

public class LinkedStack implements IntStack {

    private StackElement top;

    public void push(int i) {
        StackElement newStackElement = new StackElement(i);
        if (top == null) {
            top = newStackElement;
        } else {
            newStackElement.setPrev(top);
            top = newStackElement;
        }
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty!");
            return 0;
        } else {
            int result = top.getValue();
            top = top.getPrev();
            return result;
        }
    }
}
