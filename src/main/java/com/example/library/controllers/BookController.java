package com.example.library.controllers;


import com.example.library.entities.Book;
import com.example.library.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("")
    public String getAll(HttpServletRequest request) {
        String searchText = request.getParameter("search_text");
        if (searchText == null) searchText = "";
        List<Book> books = bookService.search("%" + searchText + "%");
        request.setAttribute("books", books);
        request.setAttribute("search_text", searchText);
        request.setAttribute("uri", request.getRequestURI());
        return "books";
    }
}
