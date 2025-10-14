package ru.practicum.numbers.controller;

import ru.practicum.numbers.repository.NumberRepositoryImpl;
import ru.practicum.numbers.service.NumbersServiceImpl;

public class NumbersController {
    private static final NumberRepositoryImpl numberRepository = new NumberRepositoryImpl();

    public static NumbersServiceImpl numbersService() {
        return new NumbersServiceImpl(numberRepository);
    }

}
