package com.company.examples.collections.example;

public class Main {

    public static void main(String[] args) {

        Book book = new Book("Java", "Cecilio");
        book.addChapter(new Chapter("Intro", 25));
        book.addChapter(new Chapter("Types", 20));
        System.out.println("Change chapter: " + book.changeChapter(new Chapter("Intro", 25), new Chapter("Introduction", 10)));

        System.out.println("Chapters: ");
        for (Chapter chapter : book.getChapters()) {
            System.out.println(" - " + chapter.getTitle());
        }

        System.out.println("Total Chapters: " + book.totalChapters());
        System.out.println("Total Pages: " + book.totalPages());
        System.out.println("Contain Intro chapter: " + book.containChapter(new Chapter("Intro", 25)));

        Book bookOther = new Book("Java", "Cecilio");
        System.out.println("Total Chapters: " + bookOther.totalChapters());
        System.out.println("Total Pages: " + bookOther.totalPages());

    }

}
