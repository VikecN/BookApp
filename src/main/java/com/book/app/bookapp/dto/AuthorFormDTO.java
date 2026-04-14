package com.book.app.bookapp.dto;

import org.springframework.stereotype.Component;

@Component
public class AuthorFormDTO {

    private String name;
    private String biography;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }
}
