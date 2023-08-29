package com.example.telegram.service;

import com.example.telegram.dto.userDto.UserRequestDto;
import com.example.telegram.repository.user.UserRepositoryImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    private  UserRepositoryImpl userRepository;

 public int save(UserRequestDto userRequestDto){
     userRepository.create();
 }

}
