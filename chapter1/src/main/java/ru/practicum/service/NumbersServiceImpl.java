package ru.practicum.service;

import ru.practicum.repository.NumberRepositoryImpl;

public class NumbersServiceImpl implements NumbersService {
    private final NumberRepositoryImpl numberRepository;

    public NumbersServiceImpl(NumberRepositoryImpl numberRepository) {
        this.numberRepository = numberRepository;
    }
}
