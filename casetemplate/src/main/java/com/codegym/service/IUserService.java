package com.codegym.service;

import com.codegym.model.User;

import java.util.List;

public interface IUserService{
    List<User> findAllUsers();
}
