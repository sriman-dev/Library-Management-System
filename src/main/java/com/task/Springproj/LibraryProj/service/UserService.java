package com.task.Springproj.LibraryProj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.Springproj.LibraryProj.model.User;
import com.task.Springproj.LibraryProj.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void registerUser(User user) {
        userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}

