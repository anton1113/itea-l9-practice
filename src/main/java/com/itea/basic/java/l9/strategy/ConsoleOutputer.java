package com.itea.basic.java.l9.strategy;

public class ConsoleOutputer implements Outputer {

    @Override
    public void output(String text) {
        System.out.println(text);
    }
}
