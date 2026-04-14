package com.book.app.bookapp.services;

import com.book.app.bookapp.dto.AuthorShortViewDTO;
import com.book.app.bookapp.dto.BookFormDTO;
import com.book.app.bookapp.dto.BookViewDTO;
import com.book.app.bookapp.mapper.BookMapper;
import com.book.app.bookapp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepo;
    @Autowired
    private BookMapper bookMapper;

    public List<BookViewDTO> getBooks() {
        return bookRepo.findAll().stream()
                .map(bookMapper::toViewDTO)
                .toList();
    }

    public BookViewDTO createBook(BookFormDTO book, AuthorShortViewDTO author) {

//        System.out.println("Creating book: " + book.getTitle() + " by author: " + author.getName());
//        BookViewDTO bookViewDTO = bookMapper.toEntity(book);
//        bookRepo.save(book);
        return null;
    }

}
