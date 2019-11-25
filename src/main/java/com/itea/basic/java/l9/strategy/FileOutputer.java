package com.itea.basic.java.l9.strategy;

import java.io.FileWriter;

public class FileOutputer implements Outputer {

    @Override
    public void output(String text) {
        try {
            FileWriter fileWriter = new FileWriter("output.txt");
            fileWriter.write(text);
            fileWriter.close();
        } catch (Exception e) {
            // ignore
        }
    }
}
