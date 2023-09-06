package com.example.telegram.model.chat;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

@Component
public class ChatMapper implements RowMapper<Chat> {
    @Override
    public Chat mapRow(ResultSet rs, int rowNum) {
        Chat chat=new Chat();

        try {
            chat.setId((UUID) rs.getObject("id"));
            chat.setMember_one((UUID) rs.getObject("member_one"));
            chat.setMember_two((UUID) rs.getObject("member_two"));
            chat.setCreated(rs.getTimestamp("creted").toLocalDateTime());
            chat.setUpdated(rs.getTimestamp("updated").toLocalDateTime());
            return chat;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
