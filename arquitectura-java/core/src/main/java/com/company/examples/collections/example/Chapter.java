package com.company.examples.collections.example;

import java.util.Objects;

public class Chapter {

    private String title;

    private int pages;

    public Chapter(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chapter chapter = (Chapter) o;
        return Objects.equals(title, chapter.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
