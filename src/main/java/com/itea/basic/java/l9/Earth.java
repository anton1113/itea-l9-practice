package com.itea.basic.java.l9;

public class Earth {

    private static Earth earth;

    private Earth() {

    }

    public static Earth getInstance() {
        if (earth == null) {
            earth = new Earth();
        }
        return earth;
    }
}
