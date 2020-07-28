package com.company.examples.javaio.bufferedstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {

        int data;

        long begin = System.currentTimeMillis();

        File file = Paths.get("java-logo.png").toFile();

        try (InputStream inputStream = new FileInputStream(file)) {

            while((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("******** Finish");
        System.out.println("Time: " + (end - begin) / 1000 + " seg");

    }

}
