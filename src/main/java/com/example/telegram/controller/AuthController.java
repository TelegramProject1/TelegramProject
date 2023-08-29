package com.example.telegram.controller;

import com.example.telegram.dto.userDto.UserRequestDto;
import com.example.telegram.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class AuthController {
    private final UserService userService;

    @GetMapping("/sign-in")
    public String signIn() {
        return "auth/sign-in";
    }

    @PostMapping("/sign-in")
    public String signInPage(@RequestParam String username,
                             @RequestParam String password) {
        System.out.println(username);
        System.out.println(password);       // prosti korish uchun
        return "main";
    }

    @GetMapping("/sign-up")
    public String signUp() {
        return "auth/sign-up";
    }


    @PostMapping("/sign-up")
    public String signUpPage(@ModelAttribute UserRequestDto userRequestDto) {
        System.out.println(userService.save(userRequestDto));

        return "main";
    }

}
