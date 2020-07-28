package com.company.examples.javaio.writer;

import java.io.*;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {

        String data;
        File file = Paths.get("demoFiles/file.txt").toFile();

        try (FileWriter output = new FileWriter(file);
             BufferedWriter writer = new BufferedWriter(output);
        ) {

            for (int i = 0; i < 1000; i++) {
                writer.write("Hello! I am a developer");
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
