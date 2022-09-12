package com.example.library.services;


import com.example.library.entities.Book;
import com.example.library.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    public List<Book> search(String text) {
        return bookRepository.search(text);
    }
}
