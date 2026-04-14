package com.book.app.bookapp.mapper;

import com.book.app.bookapp.dto.AuthorDTO;
import com.book.app.bookapp.dto.AuthorFormDTO;
import com.book.app.bookapp.dto.AuthorShortViewDTO;
import com.book.app.bookapp.models.Author;
import org.springframework.stereotype.Component;

@Component
public class AuthorMapper {

    public AuthorDTO toViewDTO(Author author) {
        AuthorDTO authorDTO = new AuthorDTO();
        authorDTO.setId(author.getId());
        authorDTO.setName(author.getName());
        authorDTO.setBiography(author.getBiography());
        return authorDTO;
    }

    public AuthorShortViewDTO toShortViewDTO(Author author) {
        AuthorShortViewDTO authorDTO = new AuthorShortViewDTO();
        authorDTO.setId(author.getId());
        authorDTO.setName(author.getName());
        return authorDTO;
    }

    public Author toEntity(AuthorFormDTO authorDTO) {
        Author author = new Author();
        author.setId(null);
        author.setName(authorDTO.getName());
        author.setBiography(authorDTO.getBiography());
        return author;
    }
}
