package com.pactera.actionReport.controller;

import com.pactera.actionReport.dao.User;
import com.pactera.actionReport.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/listuser")
    @ResponseBody
    public List userlist2(User user) throws Exception {

        return userService.getUser("CD");
    }

    //@RequestMapping(value = "/list2",method = {RequestMethod.GET, RequestMethod.POST})
    @GetMapping("/list2")
    public String findByCity() {
        String city = "CD";
        userService.getUser(city);
        return "list2";
    }

}

