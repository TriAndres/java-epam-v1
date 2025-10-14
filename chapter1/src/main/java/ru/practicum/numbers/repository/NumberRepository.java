package ru.practicum.numbers.repository;

import ru.practicum.numbers.model.Numbers;

import java.util.List;

public interface NumberRepository {
    List<Numbers> findAll();

    Numbers create(Numbers numbers);

    Numbers findById(long id);

    void deleteById(long id);

    void deleteAll();
}