package com.company.examples.javaio.gzip.inputstream;

import java.io.*;
import java.nio.file.Paths;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class Main {

    public static void main(String[] args) {

        String data;

        File source = Paths.get("demoFiles/fileGzip.txt").toFile();

        try (FileInputStream input = new FileInputStream(source);

             GZIPInputStream inputStreamCompressed = new GZIPInputStream(input);

             BufferedInputStream inputCache = new BufferedInputStream(inputStreamCompressed);

             // Binary to Text
             InputStreamReader transform = new InputStreamReader(inputCache);

             BufferedReader reader = new BufferedReader(transform);
        ) {

            while((data = reader.readLine()) != null) {
                System.out.println(data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
