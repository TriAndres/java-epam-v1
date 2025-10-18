package ru.practicum.lesson.lesson;

import ru.practicum.numbers.model.Numbers;
import ru.practicum.numbers.repository.NumberRepositoryImpl;
import ru.practicum.numbers.service.NumbersServiceImpl;

import java.util.Random;

public abstract class Lesson {
    protected Random random ;
    protected NumberRepositoryImpl numberRepository;

    public Lesson(NumberRepositoryImpl numberRepository) {
        this();
        this.numberRepository = numberRepository;
    }

    public Lesson() {
        random = new Random();
    }
    protected abstract void game();

    public long getNextId() {
        long currentMaxId = numberRepository
                .findAll()
                .stream()
                .mapToLong(Numbers::getId)
                .max()
                .orElse(0);
        return ++currentMaxId;
    }
}