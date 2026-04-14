package com.book.app.bookapp.dto;

import org.springframework.web.multipart.MultipartFile;


public class BookFormDTO {

    private String title;
    private Long authorId;
    private String isbn;
    private MultipartFile encodedCoverImage;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public MultipartFile getEncodedCoverImage() {
        return encodedCoverImage;
    }

    public void setEncodedCoverImage(MultipartFile encodedCoverImage) {
        this.encodedCoverImage = encodedCoverImage;
    }

    @Override
    public String toString() {
        return "BookFormDTO{" +
                "title='" + title + '\'' +
                ", authorId=" + authorId +
                ", isbn='" + isbn + '\'' +
                ", encodedCoverImage=" + encodedCoverImage +
                '}';
    }
}
