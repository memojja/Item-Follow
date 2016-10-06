package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mehmet on 6.10.2016.
 */
@Controller
public class HomeController {

    @RequestMapping(value = {"/home","/index","/"})
    public String home(){
        return "home";
    }
}
