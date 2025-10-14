package ru.practicum.repository;

import ru.practicum.model.Numb;

import java.util.List;

public interface NumberRepository {
    List<Numb> findAll();

    Numb create(Numb numbers);

    Numb findById(long id);

    void deleteById(long id);

    void deleteAll();
}