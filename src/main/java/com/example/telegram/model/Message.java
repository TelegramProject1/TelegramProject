package com.example.telegram.model;

import com.example.telegram.model.base.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Message  extends BaseModel {
    private UUID senderId;
    private UUID chatId;
    private String content;

}
