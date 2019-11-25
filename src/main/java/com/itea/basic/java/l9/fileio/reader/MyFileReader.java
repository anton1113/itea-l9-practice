package com.itea.basic.java.l9.fileio.reader;

import java.io.BufferedReader;
import java.io.FileReader;

public class MyFileReader {

    public String read(String filePath) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            StringBuilder stringBuilder = new StringBuilder();
            String text = "";
            while (text != null) {
                text = reader.readLine();
                stringBuilder.append(text);
            }
            return stringBuilder.toString();
        } catch (Exception e) {
            System.out.println("Unable to read the file");
            return null;
        }
    }
}
