package com.social.project.service;

import com.social.project.dao.UserDao;
import com.social.project.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    public UserDao user;

    public List<User> getUser(){
        return user.getUser();
    }
}
