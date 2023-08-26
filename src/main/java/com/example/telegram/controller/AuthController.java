package com.example.telegram.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthController {
    @RequestMapping(value = "/sign-up", method = RequestMethod.POST)
    public String signUp(){
        return "auth/sign-up";
    }
    @RequestMapping(value = "/sign-in", method = RequestMethod.GET)
    public String signIn(){
        return "auth/sign-in";
    }
}
