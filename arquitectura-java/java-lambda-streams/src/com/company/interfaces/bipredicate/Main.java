package com.company.interfaces.bipredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Document documentJava1 = new Document("Java", 1);
        Document documentNET = new Document("NET", 1);
        Document documentPython = new Document("Python", 1);
        Document documentJava2 = new Document("Java", 4);

        List<Document> documents = Arrays.asList(documentJava1, documentNET, documentPython, documentJava2);

        List<Document> documentsFiltered = filterDocument(documents, Main::isGreaterOtherDocument, documentNET);
        documentsFiltered.stream().map(Document::getTitle).forEach(System.out::println);
    }

    public static List<Document> filterDocument(List<Document> documents, BiPredicate<Document, Document> biPredicate, Document documentComparator) {
        return documents
                .stream()
                .filter(document -> biPredicate.test(document, documentComparator))
                .collect(Collectors.toList());
    }

    // BiPredicate
    public static boolean isGreaterOtherDocument(Document initial, Document next) {
        return initial.getVersion() > next.getVersion();
    }

}
