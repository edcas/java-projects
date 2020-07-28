package com.company.examples.javaio.outputstream;

import java.io.*;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {

        int data;
        File source = Paths.get("java-logo.png").toFile();
        File target = Paths.get("java-logo2.png").toFile();

        try (InputStream inputStream = new FileInputStream(source);
             OutputStream outputStream = new FileOutputStream(target)) {

            while((data = inputStream.read()) != -1) {
                outputStream.write(data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
