package com.kovanlabs.intern.files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("data.txt");

        writer.write("Hello World");
        writer.close();


    }
}
