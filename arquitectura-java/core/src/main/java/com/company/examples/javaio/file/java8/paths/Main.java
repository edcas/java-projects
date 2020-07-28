package com.company.examples.javaio.file.java8.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {

        Path path = Paths.get("myFile.txt");
        System.out.println("Filename: " + path.getFileName());
        System.out.println("Absolute Path: " + path.toAbsolutePath());

        Path pathOther = path.toAbsolutePath();
        System.out.println("Different parts of the route: ");
        for (Path pathItem : pathOther) {
            System.out.println(" -> " + pathItem);
        }

    }

}
