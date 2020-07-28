package com.company.examples.javaio.file;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            File file = new File("myFile.txt");
            boolean created = file.createNewFile();

            System.out.println("Created: " + created);

            System.out.println(file.getAbsoluteFile());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getName());
            System.out.println(file.isDirectory());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
