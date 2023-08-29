package com.example.telegram.repository.baseRepository;

import com.example.telegram.model.base.BaseModel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BaseRepository<T extends BaseModel> {


    int create(T model);

    Optional<T> findById(UUID id);

    List<T> getAll();

    int update(T model);

    int deleteById(UUID id);

}
