package com.company.examples.javaio.file.directory;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        File directory = new File("demoFiles");


        File[] files = directory.listFiles();

        if (files != null) {
            for (File file: files) {
                System.out.println(file.getName());
            }
        }


    }

}
