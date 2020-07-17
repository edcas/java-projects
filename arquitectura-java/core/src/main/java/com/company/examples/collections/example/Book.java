package com.company.examples.collections.example;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private String title;

    private String author;

    private List<Chapter> chapters;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.chapters = new ArrayList<Chapter>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }

    public void addChapter(Chapter chapter) {
        this.chapters.add(chapter);
    }

    public int totalChapters() {
        return this.chapters.size();
    }

    public Integer totalPages() {
        return this.chapters.stream().map(Chapter::getPages).reduce(Integer::sum).orElse(0);
    }

    public boolean containChapter(Chapter chapter) {
        return this.chapters.contains(chapter);
    }

    public boolean changeChapter(Chapter chapter, Chapter chapterOther) {
        int position = this.chapters.indexOf(chapter);

        if (position == -1) {
            return false;
        }

        this.chapters.set(position, chapterOther);

        return true;
    }

}
