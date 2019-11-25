package com.itea.basic.java.l9.stack;

import com.itea.basic.java.l9.IntStack;

import java.util.Arrays;

public class ArrayStack implements IntStack {

    private int counter = -1;
    private int[] values = new int[10];

    @Override
    public void push(int i) {
        if (counter == values.length - 1) {
            values =  Arrays.copyOf(values, values.length * 2);
        }
        values[++counter] = i;
    }

    @Override
    public int pop() {
        if (counter == -1) {
            return 0;
        }
        return values[counter--];
    }
}
