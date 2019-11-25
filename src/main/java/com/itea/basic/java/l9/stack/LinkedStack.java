package com.itea.basic.java.l9.stack;

import com.itea.basic.java.l9.IntStack;

public class LinkedStack implements IntStack {

    private StackElement top;

    @Override
    public void push(int i) {
        StackElement currentElement = new StackElement(i);
        currentElement.setPrev(top);
        top = currentElement;
    }

    @Override
    public int pop() {
        int result = top.getValue();
        top = top.getPrev();
        return result;
    }
}
