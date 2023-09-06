package com.example.telegram.service;

import com.example.telegram.model.chat.Chat;
import com.example.telegram.repository.chat.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ChatServise {

    @Autowired
    private ChatRepository chatRepository;

    public List<Chat> findAllChatsByUserId(UUID id){
        return chatRepository.findByUserId(id);
    }







}
