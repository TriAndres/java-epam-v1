package ru.practicum.repository;

import ru.practicum.model.Numbers;

import java.util.List;

public interface NumberRepository {
    List<Numbers> findAll();

    Numbers create(Numbers numbers);

    Numbers update(Numbers numbers);

    Numbers findById(long id);

    void deleteById(long id);

    void deleteAll();
}