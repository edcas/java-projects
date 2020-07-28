package com.company.examples.javaio.inputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {

        int data;
        File file = Paths.get("java-logo.png").toFile();

        try (InputStream inputStream = new FileInputStream(file)) {

            while((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
