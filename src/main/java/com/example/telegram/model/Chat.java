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
public class Chat extends BaseModel {
    private UUID member_one;
    private UUID member_two;
}
