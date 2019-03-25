package com.example.readinglist;

public class Book {
    String title, reasonToRead, id;
    boolean hasBeenRead;

    public Book(String id, String title, String reasonToRead, boolean hasBeenRead) {
        this.id = id;
        this.title = title;
        this.reasonToRead = reasonToRead;
        this.hasBeenRead = hasBeenRead;
    }

    // string id, string title, string reasonToRead, boolean hasBeenRead
    public Book(String csvString){
        String[] values = csvString.split(",");
        this.id = values[0];
        this.title = values[1];
        this.reasonToRead = values[2];
        this.hasBeenRead = Boolean.parseBoolean(values[3]);
    }

    public String toCsvString(Book book){
        String csvString;
        csvString = this.id +         "," +
                this.title +          "," +
                this.reasonToRead +   "," +
                Boolean.toString(this.hasBeenRead);
        return csvString;

    }

    public String getTitle() {
        return title;
    }

    public String getReasonToRead() {
        return reasonToRead;
    }

    public String getId() {
        return id;
    }

    public boolean isHasBeenRead() {
        return hasBeenRead;
    }
}


