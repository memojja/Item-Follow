package com.example.service;

import com.example.model.User;

/**
 * Created by mehmet on 9.10.2016.
 */
public interface UserService {

    void addUser(User user);
    Iterable<User> getUsers();
}
