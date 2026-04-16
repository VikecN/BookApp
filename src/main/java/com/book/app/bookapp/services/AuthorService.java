package com.book.app.bookapp.services;

import com.book.app.bookapp.dto.AuthorDTO;
import com.book.app.bookapp.dto.AuthorFormDTO;
import com.book.app.bookapp.mapper.AuthorMapper;
import com.book.app.bookapp.models.Author;
import com.book.app.bookapp.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepo;

    @Autowired
    private AuthorMapper authorMapper;

    public List<AuthorDTO> getAuthors() {
        return authorRepo.findAll().stream().map(authorMapper::toViewDTO).toList();
    }

    public AuthorDTO createAuthor(AuthorFormDTO authorFormDTO) {
        try{

            Author author = authorMapper.toEntity(authorFormDTO);
            authorRepo.save(author);

            return authorMapper.toViewDTO(author);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
