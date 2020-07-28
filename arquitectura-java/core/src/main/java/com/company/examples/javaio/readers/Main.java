package com.company.examples.javaio.readers;

import java.io.*;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {

        String data;
        File file = Paths.get("demoFiles/file1.txt").toFile();

        try (InputStream inputStream = new FileInputStream(file);

             // Binary to Text
             InputStreamReader transform = new InputStreamReader(inputStream);

             // Read line to line
             BufferedReader bufferedReader = new BufferedReader(transform);
        ) {

            while((data = bufferedReader.readLine()) != null) {
                System.out.println(data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
