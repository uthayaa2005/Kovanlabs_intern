package com.kovanlabs.intern.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Nio2problems {

    public static void main(String[] args) {
        Path path = Paths.get("data.txt");

        Path file = Paths.get("D:/projects/data.txt");
try {
    System.out.println(Files.readAllLines(path));
} catch (IOException e) {
    throw new RuntimeException(e);
}
    }
}
