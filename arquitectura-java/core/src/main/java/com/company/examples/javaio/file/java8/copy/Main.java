package com.company.examples.javaio.file.java8.copy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {

        Path source = Paths.get("myFile.txt");
        Path target = Paths.get("demoFiles/myFile.txt");

        try {
            Files.copy(source, target);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
