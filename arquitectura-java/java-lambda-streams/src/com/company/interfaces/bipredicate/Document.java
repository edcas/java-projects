package com.company.interfaces.bipredicate;

public class Document {

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

    public static Document isGreater(Document current, Document next) {
        if(current.getVersion() > next.getVersion()) {
            return current;
        }

        return next;
    }

    @Override
    public String toString() {
        return "Document{" +
                "title='" + title + '\'' +
                ", version=" + version +
                '}';
    }
}
