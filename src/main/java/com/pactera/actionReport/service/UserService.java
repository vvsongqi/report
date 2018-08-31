package com.pactera.actionReport.service;

import com.pactera.actionReport.dao.User;

import java.util.List;

public interface UserService {
    public  List<User> getUser(String city);
}
