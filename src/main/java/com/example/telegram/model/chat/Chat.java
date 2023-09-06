package com.example.telegram.model.chat;

import com.example.telegram.model.base.BaseModel;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Chat extends BaseModel {

    private UUID member_one;
    private UUID member_two;


}
