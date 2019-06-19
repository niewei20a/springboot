package com.wzu.springboot.service;

import com.wzu.springboot.pojo.User;

public interface UserService {
    boolean checkUser(User user);
    String registerUser(User user);
}
