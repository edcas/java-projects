package com.company.interfaces.bifunction.defaultMethod;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Document documentJava1 = new Document("Java", 1);
        Document documentNET = new Document("NET", 1);
        Document documentPython = new Document("Python", 1);
        Document documentJava2 = new Document("Java", 2);

        List<Document> documents = Arrays.asList(documentJava1, documentNET, documentPython, documentJava2);

        Document result = documents.stream().reduce(documentJava1, Document::isGreater);
        System.out.println(result.toString());
        System.out.println(documentJava1.isGreater(documentJava2));
    }

}
