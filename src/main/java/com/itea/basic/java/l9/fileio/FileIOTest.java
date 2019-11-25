package com.itea.basic.java.l9.fileio;

import com.itea.basic.java.l9.fileio.reader.MyFileReader;
import com.itea.basic.java.l9.fileio.writer.MyFileWriter;

public class FileIOTest {

    private static final MyFileReader MY_FILE_READER = new MyFileReader();
    private static final MyFileWriter MY_FILE_WRITER = new MyFileWriter();

    public static void main(String[] args) {
        MY_FILE_WRITER.write("Hello world!", "hello.txt");
        String hello = MY_FILE_READER.read("hello.txt");
        assert "Hello world!".equals(hello);
        MY_FILE_WRITER.append(" I love Java!", "hello.txt");
        String helloILoveJava = MY_FILE_READER.read("hello.txt");
        assert "Hello world! I love Java!".equals(helloILoveJava);
    }
}
