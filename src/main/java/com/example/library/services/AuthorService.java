package com.example.library.services;

import com.example.library.entities.Author;
import com.example.library.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> getAll() {
        return authorRepository.findAll();
    }

    public List<Author> getAllSorted() {
        return authorRepository.findAllSorted();
    }

    public Author getById(int id) {
        return authorRepository.findById(id);
    }

    public void upsertOne(Author newAuthor) {
        authorRepository.save(newAuthor);
    }

    public void deleteById(int id) {
        authorRepository.deleteById(id);
    }
}
