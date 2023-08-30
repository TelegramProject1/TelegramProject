package com.example.telegram.repository.user;

import com.example.telegram.model.user.User;
import com.example.telegram.repository.baseRepository.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends BaseRepository<User> {


    User getByUsername(String username);

    User getByPhoneNumber(String phoneNumber);


}
