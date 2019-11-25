package com.itea.basic.java.l9;

public class EarthTest {

    public static void main(String[] args) {

        Earth earth1 = Earth.getInstance();
        Earth earth2 = Earth.getInstance();

        System.out.println(earth1);
        System.out.println(earth2);
    }
}
