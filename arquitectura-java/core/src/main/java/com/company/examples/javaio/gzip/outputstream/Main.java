package com.company.examples.javaio.gzip.outputstream;

import java.io.*;
import java.nio.file.Paths;
import java.util.zip.GZIPOutputStream;

public class Main {

    public static void main(String[] args) {

        File file = Paths.get("demoFiles/fileGzip.txt").toFile();

        try (FileOutputStream output = new FileOutputStream(file);

             GZIPOutputStream outputStreamCompressed = new GZIPOutputStream(output);

             BufferedOutputStream outputCache = new BufferedOutputStream(outputStreamCompressed);

             // Binary to Text
             OutputStreamWriter transform = new OutputStreamWriter(outputCache);

             BufferedWriter writer = new BufferedWriter(transform);
        ) {

            for (int i = 0; i < 1000; i++) {
                writer.write("Hello! I am a developer");
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
