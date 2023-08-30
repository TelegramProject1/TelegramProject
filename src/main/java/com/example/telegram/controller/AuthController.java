package com.example.telegram.controller;

import com.example.telegram.dto.userDto.UserRequestDto;
import com.example.telegram.model.user.User;
import com.example.telegram.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.PrintWriter;
import java.util.UUID;

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
                             @RequestParam String password,
                             Model model) {

        User user = userService.findByPoneNumber(username, password);

        if (user != null) {
            model.addAttribute("userId", user.getId());
            return "main";
        }else {
            return "sign-in";
        }
    }

    @GetMapping("/sign-up")
    public String signUp() {
        return "auth/sign-up";
    }


    @PostMapping("/sign-up")
    public String signUpPage(@ModelAttribute UserRequestDto userRequestDto) {

        //  User user = new User(userRequestDto);
        //  System.out.println(userRequestDto);

        try {
            UUID uuid = userService.save(userRequestDto);
            if (uuid != null) {
                return "main";
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        return "home";
    }

}
