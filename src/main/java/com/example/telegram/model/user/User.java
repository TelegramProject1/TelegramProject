package com.example.telegram.model.user;

import com.example.telegram.model.base.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User extends BaseModel {


    private String name;
    private String username;
    private String password;
    private String phoneNumber;
    private Boolean isActive;

}
