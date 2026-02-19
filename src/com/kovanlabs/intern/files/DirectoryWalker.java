package com.kovanlabs.intern.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryWalker {
    public static void main(String[] args) {
        Path filePath = Paths.get("D:\\sample.txt");
        try{
            Files.walk(filePath).filter(Files::isRegularFile).forEach(
                    (file)->{
                        try {
                            System.out.println("File: "+file+" "+"Stores in  "+Files.getFileStore(file)+" Size of the "+Files.size(file));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}