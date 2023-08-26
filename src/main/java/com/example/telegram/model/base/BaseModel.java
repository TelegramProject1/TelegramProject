package com.example.telegram.model.base;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BaseModel {
    {
        this.id=UUID.randomUUID();
        this.created=LocalDateTime.now();
        this.updated=LocalDateTime.now();
    }
    private UUID id;
    private LocalDateTime created;
    private LocalDateTime updated;
}
