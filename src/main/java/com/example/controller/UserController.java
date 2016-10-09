package com.example.controller;

import com.example.model.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * Created by mehmet on 9.10.2016.
 */

@Controller
public class UserController {


    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/register" )
    public ModelAndView getregisterPage(){
        return new ModelAndView("register","user",new User());
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String handleRegisterPage(@Valid @ModelAttribute User user, BindingResult bindingResult){

        if(bindingResult.hasErrors())
            return "register";
        userService.addUser(user);
        return "redirect:/users";
    }

    @RequestMapping(value = "/users")
    public ModelAndView getUsersPage(){
        return new ModelAndView("users","users",userService.getUsers());
    }

    

}
