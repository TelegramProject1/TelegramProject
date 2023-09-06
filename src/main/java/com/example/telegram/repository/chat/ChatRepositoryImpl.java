package com.example.telegram.repository.chat;

import com.example.telegram.model.chat.Chat;
import com.example.telegram.model.chat.ChatMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class ChatRepositoryImpl implements ChatRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private ChatMapper chatMapper;

    @Override
    public int create(Chat chat) {
        return jdbcTemplate.update(ChatSqlQuery.Chat_Create,
                chat.getId(),
                chat.getMember_one(),
                chat.getMember_two(),
                chat.getCreated(),
                chat.getUpdated());
    }

    @Override
    public Optional<Chat> findById(UUID id) {
        return Optional.ofNullable(jdbcTemplate.queryForObject(ChatSqlQuery.FIND_BY_ID, chatMapper, id));
    }

    @Override
    public List<Chat> getAll() {
        return jdbcTemplate.query(ChatSqlQuery.FIND_ALL, chatMapper);    }

    @Override
    public int update(Chat model) {
        return 0;
    }

    @Override
    public int deleteById(UUID id) {
        return 0;
    }

    @Override
    public List<Chat> findByUserId(UUID id) {
        return jdbcTemplate.query(ChatSqlQuery.FIND_BY_ID, chatMapper, id);
    }
}
