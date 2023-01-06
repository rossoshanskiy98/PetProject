package com.example.petproject.service;

import java.util.List;

public interface AbstractService<T> {

    T findById(Long id);

    T save(T t);

    T update(T t);

    void delete (T t);

    List<T> findAll();
}
