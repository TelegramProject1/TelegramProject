package com.example.telegram.service;

import com.example.telegram.dto.userDto.UserRequestDto;
import com.example.telegram.model.user.User;
import com.example.telegram.repository.user.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepositoryImpl userRepository;

    public UUID save(UserRequestDto userRequestDto) {
        if (userRequestDto.getPassword().isEmpty() || userRequestDto.getUsername().isEmpty() || userRequestDto.getName().isEmpty() || userRequestDto.getPhoneNumber().isEmpty()) {
            throw new RuntimeException("Password or username is empty");
        }
     /*
      User byUsername = userRepository.getByUsername(userRequestDto.getUsername());
        if (byUsername != null) {
            throw new RuntimeException("This username %s already exist".formatted(userRequestDto.getUsername()));
        }
        */
        else {
            User user1 = new User(userRequestDto.getName(), userRequestDto.getUsername(),
                    userRequestDto.getPassword(), userRequestDto.getPhoneNumber());
            try {
                int res = userRepository.create(user1);
                if (res == 1) {
                    return user1.getId();
                }
            } catch (RuntimeException e) {
                throw new RuntimeException("Userni saqlashda xatolik roy berdi");
            }
        }

        return null;
    }

    public User findByPoneNumber(String username, String password) {
         User user = userRepository.getByUsername(username);
        if (user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
    public List<User> findAllByUsername(String username){
        username = "%" + username + "%";

        return userRepository.findFriendByUsername(username);
    }



}
