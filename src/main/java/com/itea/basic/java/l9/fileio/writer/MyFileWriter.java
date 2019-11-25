package com.itea.basic.java.l9.fileio.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class MyFileWriter {

    public void write(String text, String fileName) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(text);
            writer.close();
        } catch (Exception e) {
            System.out.println("Unable to write text");
        }
    }

    public void append(String text, String fileName) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.write(text);
            writer.close();
        } catch (Exception e) {
            System.out.println("Unable to append text");
        }
    }
}
