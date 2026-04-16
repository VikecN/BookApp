package com.book.app.bookapp.mapper;

import com.book.app.bookapp.dto.BookFormDTO;
import com.book.app.bookapp.dto.BookViewDTO;
import com.book.app.bookapp.models.Author;
import com.book.app.bookapp.models.Book;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {

    public BookViewDTO toViewDTO(Book book) {
        BookViewDTO bookViewDTO = new BookViewDTO();
        bookViewDTO.setId(book.getId());
        bookViewDTO.setTitle(book.getTitle());
        bookViewDTO.setIsbn(book.getIsbn());
        bookViewDTO.setCoverImageUrl(book.getCoverImageUrl());
        bookViewDTO.setAuthor(new AuthorMapper().toShortViewDTO(book.getAuthor()));
        return bookViewDTO;
    }

    public Book toEntity(BookFormDTO bookFormDTO, Author author) {
        Book book = new Book();
        book.setTitle(bookFormDTO.getTitle());
        book.setIsbn(bookFormDTO.getIsbn());
        book.setAuthor(author);
        return book;
    }

}
