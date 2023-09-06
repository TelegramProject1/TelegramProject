package com.example.telegram.repository.message;

import com.example.telegram.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class MessageRepositoryImpl implements MessageRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int create(Message model) {
        return jdbcTemplate.update(MessageSqlQuery.CREATE);
    }

    @Override
    public Optional<Message> findById(UUID id) {
        return Optional.empty();
    }

    @Override
    public List<Message> getAll() {
        return null;
    }

    @Override
    public int update(Message model) {
        return 0;
    }

    @Override
    public int deleteById(UUID id) {
        return 0;
    }
}
