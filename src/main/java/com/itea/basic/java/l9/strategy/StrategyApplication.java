package com.itea.basic.java.l9.strategy;

import java.util.Scanner;

public class StrategyApplication {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        int i = 1;
        while (i >= 0) {
            System.out.println("Enter the option");
            i = SCANNER.nextInt();
            System.out.println("Enter the text");
            String text = SCANNER.nextLine();
            Context.output(text, i);
        }
    }
}
