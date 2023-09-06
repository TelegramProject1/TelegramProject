package com.example.telegram.repository.message;

public interface MessageSqlQuery {
    String CREATE = "insert into message(id, sender_id, chat_id, content, created, updated)\n" +
            "values (?,?,?,?,?,?)";
    String FIND_BY_ID = "select * from message where id=?";
    String FIND_ALL = "select * from message";
}

