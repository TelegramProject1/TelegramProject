package com.example.telegram.repository.chat;

import com.example.telegram.model.chat.Chat;
import com.example.telegram.repository.baseRepository.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ChatRepository extends BaseRepository<Chat> {

    List<Chat> findByUserId(UUID id);



}
