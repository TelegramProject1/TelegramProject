/*
package com.example.telegram.controller;

import com.example.telegram.model.chat.Chat;
import com.example.telegram.model.user.User;
import com.example.telegram.service.ChatServise;
import com.example.telegram.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;
import java.util.UUID;

@Controller
public class ChatController {
    @Autowired
    private ChatServise chatService;
    @Autowired
    private UserService userService;
    @GetMapping(value = "/chat")
    public String chat(
            @RequestParam UUID userId,
            Model model
    )
    {
        model.addAttribute("userId",userId);
        List<Chat> chats = chatService.(userId);
        model.addAttribute("chats",chats);
        return "chat";
    }

    @GetMapping(value = "/start-chat")
    public String startChat(){
        return "message";
    }

    @GetMapping("/search-results")
    public String searchFriend(
            @RequestParam String searchFriend,
            @RequestParam UUID userId,
            Model model
    ){
//        List<User> user = userService.findByPoneNumber(searchFriend);
//        model.addAttribute("friends",user);
        model.addAttribute("userId",userId);
        return "search-results";
    }

}
*/


package com.example.telegram.controller;

import com.example.telegram.model.chat.Chat;
import com.example.telegram.model.user.User;
import com.example.telegram.service.ChatServise;
import com.example.telegram.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.UUID;

@Controller
public class ChatController {
    @Autowired
    private ChatServise chatService;
    @Autowired
    private UserService userService;

    @GetMapping("/chat")
    public String chats(){
        return "chat";
    }
    @PostMapping(value = "/chat")
    public String chat(
            @RequestParam UUID userId,
            Model model
    )
    {
        model.addAttribute("userId",userId);
        List<Chat> existingFriends = chatService.findAllChatsByUserId(userId);
        model.addAttribute("existingFriends",existingFriends);
        return "chat";
    }

    @GetMapping("/start-chat")
    public String startChat(){
        return "message";
    }


    @GetMapping("/search-results")
    public String search(){
        return "search-result";
    }



    @PostMapping("/search-results")
    public String searchFriend(
            @RequestParam String searchFriend,
            @RequestParam UUID userId,
            Model model
    ){
        List<User> user = userService.findAllByUsername(searchFriend);
        model.addAttribute("friends",user);
        model.addAttribute("userId",userId);
        return "search-results";
    }

}
