package com.company.examples.javaio.bufferedstream;

import java.io.*;
import java.nio.file.Paths;

public class Performance {

    public static void main(String[] args) {

        int data;

        long begin = System.currentTimeMillis();

        File file = Paths.get("java-logo.png").toFile();

        try (InputStream inputStream = new FileInputStream(file);
             BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream)) {

            while((data = bufferedInputStream.read()) != -1) {
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
