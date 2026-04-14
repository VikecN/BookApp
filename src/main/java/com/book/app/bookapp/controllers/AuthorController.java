package com.book.app.bookapp.controllers;

import com.book.app.bookapp.dto.AuthorDTO;
import com.book.app.bookapp.dto.AuthorFormDTO;
import com.book.app.bookapp.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/authors")
@CrossOrigin(origins = "*")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping
    public String listAuthors(Model model) {
        model.addAttribute("authors", authorService.getAuthors());
        return "authors/list";
    }

    @GetMapping("/new")
    public String createAuthorPage(Model model) {
        model.addAttribute("author", new AuthorDTO());
        return "authors/form";
    }

    @PostMapping
    public String createAuthor(@ModelAttribute("author") AuthorFormDTO authorForm, BindingResult result) {
        authorService.createAuthor(authorForm);

        if(!result.hasErrors()){
            return "redirect:/authors";
        }else{
            return "authors/form";
        }

    }


}
