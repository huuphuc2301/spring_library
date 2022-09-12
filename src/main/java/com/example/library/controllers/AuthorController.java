package com.example.library.controllers;

import com.example.library.entities.Author;
import com.example.library.services.AuthorService;
import com.example.library.services.NationalityService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("authors")
public class AuthorController {
    private final AuthorService authorService;
    private final NationalityService nationalityService;

    public AuthorController(AuthorService authorService, NationalityService nationalityService) {
        this.authorService = authorService;
        this.nationalityService = nationalityService;
    }

    @GetMapping("")
    public String getAll(HttpServletRequest request) {
        List<Author> authorList = authorService.getAllSorted();
        request.setAttribute("authors", authorList);
        request.setAttribute("uri", request.getRequestURI());
        return "authors";
    }

    @GetMapping("/{id}")
    public String getOne(@PathVariable Integer id, HttpServletRequest request) {
        Author author = authorService.getById(id);
        request.setAttribute("author", author);
        request.setAttribute("nationalities", nationalityService.getAll());
        request.setAttribute("back_uri", request.getContextPath() + "/authors");
        request.setAttribute("update_uri", request.getContextPath() + "/authors/update/" + id);
        request.setAttribute("delete_uri", request.getContextPath() + "/authors/delete/" + id);
        return "author-edit";
    }

    @PostMapping("/update/{id}")
    public String updateOne(@PathVariable Integer id, HttpServletRequest request) {
        Author newAuthor = new Author(id, request.getParameter("name"),
                                Integer.parseInt(request.getParameter("birth_year")),
                                request.getParameter("gender"),
                                nationalityService.getById(Integer.parseInt(request.getParameter("nationality"))));
        if (!newAuthor.equals(authorService.getById(id))) authorService.upsertOne(newAuthor);
        return "redirect:/authors/" + id;
    }

    @PostMapping("/delete/{id}")
    public String deleteOne(@PathVariable Integer id, HttpServletRequest request) {
        authorService.deleteById(id);
        return "redirect:/authors/";
    }
}