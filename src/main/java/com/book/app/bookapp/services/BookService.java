package com.book.app.bookapp.services;

import com.book.app.bookapp.dto.BookFormDTO;
import com.book.app.bookapp.dto.BookViewDTO;
import com.book.app.bookapp.mapper.BookMapper;
import com.book.app.bookapp.models.Author;
import com.book.app.bookapp.models.Book;
import com.book.app.bookapp.repository.AuthorRepository;
import com.book.app.bookapp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepo;
    @Autowired
    private AuthorRepository authorRepo;
    @Autowired
    private BookMapper bookMapper;

    public List<BookViewDTO> getBooks() {
        return bookRepo.findAll().stream()
                .map(bookMapper::toViewDTO)
                .toList();
    }

    public BookViewDTO createBook(BookFormDTO book) {

        Author author = authorRepo.findById(book.getAuthorId()).orElseThrow(() -> new RuntimeException("Author not found"));

        System.out.println("Creating book: " + book.getTitle());
        Book bookViewDTO = bookMapper.toEntity(book, author);
        bookRepo.save(bookViewDTO);

        return bookMapper.toViewDTO(bookViewDTO);
    }

}
