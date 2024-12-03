package com.example.model;

public class BookDTO {
	private String title;
	private String author;
	private int pages;
    
    protected BookDTO() {}

    public BookDTO(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return "BookDTO [title=" + title + ", author=" + author + ", pages=" + pages + "]";
    }
    
    

}
