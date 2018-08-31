package com.pactera.actionReport.service;

import com.pactera.actionReport.dao.User;
import com.pactera.actionReport.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getUser(String city) {
        return userMapper.getUser(city);
    }
}