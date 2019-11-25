package com.itea.basic.java.l9.strategy;

public class NetOutputer implements Outputer {

    @Override
    public void output(String text) {
        System.out.println("Sending text via network" + text);
    }
}
