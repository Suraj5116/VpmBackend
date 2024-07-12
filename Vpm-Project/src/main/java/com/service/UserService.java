package com.service;

import java.util.List;

import com.model.User;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    User getUserByEmail(String email);
    User saveUser(User user);
    void deleteUser(Long id);
}


