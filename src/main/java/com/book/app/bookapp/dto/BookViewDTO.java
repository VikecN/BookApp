package com.book.app.bookapp.dto;

public class BookViewDTO {

    private Long id;
    private String title;
    private String isbn;
    private AuthorShortViewDTO author;
    private String coverImageUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public AuthorShortViewDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorShortViewDTO author) {
        this.author = author;
    }

    public String getCoverImageUrl() {
        return coverImageUrl;
    }

    public void setCoverImageUrl(String coverImageUrl) {
        this.coverImageUrl = coverImageUrl;
    }
}
