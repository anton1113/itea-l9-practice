package com.itea.basic.java.l9.strategy;

public class Context {

    private static final Outputer CONSOLE_OUTPUTER = new ConsoleOutputer();
    private static final Outputer FILE_OUTPUTER = new FileOutputer();
    private static final Outputer NET_OUTPUTER = new NetOutputer();

    public static void output(String text, int option) {
        if (option == 0) {
            CONSOLE_OUTPUTER.output(text);
        } else if (option == 1) {
            FILE_OUTPUTER.output(text);
        } else {
            NET_OUTPUTER.output(text);
        }
    }
}
