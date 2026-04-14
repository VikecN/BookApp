package com.book.app.bookapp.controllers;

import com.book.app.bookapp.dto.BookFormDTO;
import com.book.app.bookapp.services.AuthorService;
import com.book.app.bookapp.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/books")
@CrossOrigin(origins = "*")
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private AuthorService authorService;

    @GetMapping
    public String listBooks(Model model) {
        model.addAttribute("books", bookService.getBooks());
        return "books/list";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("book", new BookFormDTO());
        model.addAttribute("authors", authorService.getAuthors());
        return "books/form";
    }

    @PostMapping
    public String createBook(@ModelAttribute("book") BookFormDTO book, BindingResult result) {
        System.out.println(book);
        return "books/form";
//                bookService.createBook(book);
    }
}
