package com.codegym.service;

import com.codegym.model.Product;
import com.codegym.model.User;
import com.codegym.utils.FileUtils;

import java.util.List;

public class UserService {
    private final String path = "./data/user.csv";
    public List<User> findAllUsers() {
        List<User> users = FileUtils.readFile(path, User.class);
        return users;
    }
}
