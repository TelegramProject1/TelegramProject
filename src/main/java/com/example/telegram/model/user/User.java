package com.example.telegram.model.user;

import com.example.telegram.dto.userDto.UserRequestDto;
import com.example.telegram.model.base.BaseModel;
import lombok.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Component
public class User extends BaseModel {



    private String name;
    private String username;
    private String password;
    private String phoneNumber;
    private Boolean isActive;


    {
        this.setIsActive(true);

    }



/*    @Builder
    public User(UUID id, LocalDateTime created, LocalDateTime updated, String name, String username, String password, String phoneNumber, Boolean isActive) {
        super(id, created, updated);
        this.name = name;
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.isActive = isActive;
    }
    */

    public User(String name,String username, String password,String phoneNumber) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }
}
