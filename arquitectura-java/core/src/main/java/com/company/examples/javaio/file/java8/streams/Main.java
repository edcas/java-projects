package com.company.examples.javaio.file.java8.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Path path = Paths.get("demoFiles");

        try {
            Stream<Path> pathStream = Files.list(path);

            pathStream.filter(p -> p.getFileName().toString().contains("file"))
                    .map(p -> p.getFileName().toString().toUpperCase())
                    .forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
