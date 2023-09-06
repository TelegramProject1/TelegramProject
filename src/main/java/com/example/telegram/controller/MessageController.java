package com.example.telegram.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.UUID;

@Controller
public class MessageController {

    @GetMapping("/message")
    public String message(
//            @RequestParam UUID friendId,
//            @RequestParam UUID userId,
//            Model model
            ){
//        model.addAttribute("friendId",friendId);
//        model.addAttribute("userId",userId);
        return "message";

    }
    @PostMapping("/message")
    public String startMessage(
            @RequestParam UUID friendId,
            @RequestParam UUID userId,
            @RequestParam String content,
            Model model
    ){

      model.addAttribute("friendId",friendId);
      model.addAttribute("userId",userId);

      return "message";
    }
}
