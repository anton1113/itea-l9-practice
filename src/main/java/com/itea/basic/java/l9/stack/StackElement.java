package com.itea.basic.java.l9.stack;

public class StackElement {

    private int value;
    private StackElement prev;

    public StackElement(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public StackElement getPrev() {
        return prev;
    }

    public void setPrev(StackElement prev) {
        this.prev = prev;
    }
}
