package com.example.library.services;

import com.example.library.entities.User;
import com.example.library.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findUser(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }
}
