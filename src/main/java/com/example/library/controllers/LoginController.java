package com.example.library.controllers;

import com.example.library.entities.User;
import com.example.library.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("login")
public class LoginController {
    private final UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String loginPage(HttpServletRequest request) {
        request.setAttribute("uri", request.getRequestURI());
        return "login";
    }

    @PostMapping("")
    public String login(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = userService.findUser(username, password);
        if (user == null) return "login";
        request.getSession().setAttribute("user", user);
        return "redirect:/";
    }
}


