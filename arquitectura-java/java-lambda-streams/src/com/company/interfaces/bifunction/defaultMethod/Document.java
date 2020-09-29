package com.company.interfaces.bifunction.defaultMethod;

public class Document implements Versionable<Document> {

    private String title;

    private int version;

    public Document(String title, int version) {
        this.title = title;
        this.version = version;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Document{" +
                "title='" + title + '\'' +
                ", version=" + version +
                '}';
    }
}
