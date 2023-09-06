package com.example.telegram.repository.chat;

import com.example.telegram.model.chat.Chat;

import java.util.List;
import java.util.UUID;

public interface ChatSqlQuery {
        String Chat_Create= """
           insert into chats (id,member_one,member_two,creted,updated)
            values(?,?,?,?,?);
            """;

        String FIND_BY_ID="select * from chat where id=?";
        String FIND_BY_USER_ID="select * from chat where mem_one=? or mem_two=?";
        String FIND_ALL="select * from chat";
        List<Chat> findAllChatByUserId(UUID id);
}
