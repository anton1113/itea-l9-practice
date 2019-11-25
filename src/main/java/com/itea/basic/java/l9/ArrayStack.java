package com.itea.basic.java.l9;

public class ArrayStack implements IntStack {

    private int cursor = -1;
    private int[] array = new int[10];

    public void push(int i) {
        if (cursor == array.length - 1) {
            System.out.println("Stack is full!");
        } else {
            array[++cursor] = i;
        }
    }

    public int pop() {
        if (cursor == -1) {
            System.out.println("Stack is empty!");
            return 0;
        }
        return array[cursor];
    }
}
