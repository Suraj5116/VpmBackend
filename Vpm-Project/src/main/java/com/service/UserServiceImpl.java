package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserRepository;
import com.model.User;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    

    @Override
    public List<User> getAllUsers() {
    	return (List<User>) userRepository.findAll();
    }

    
    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow();
    }
    
    @Override
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
    
    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}


