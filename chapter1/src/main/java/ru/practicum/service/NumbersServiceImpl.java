package ru.practicum.service;

import ru.practicum.model.Numbers;
import ru.practicum.repository.NumberRepositoryImpl;

import static ru.practicum.controller.Controller.scanner;

public class NumbersServiceImpl implements NumbersService {
    private final NumberRepositoryImpl numberRepository;

    public NumbersServiceImpl(NumberRepositoryImpl numberRepository) {
        this.numberRepository = numberRepository;
    }

    public void findAll() {
        int size = 10;
        int count = 0;
        for (Numbers numbers : numberRepository.findAll()) {
            System.out.print(numbers.toString() + "\t");
            ++count;
            if (count == size) {
                System.out.println();
                count = 0;
            }
        }
        System.out.println("Вывод списка.\n");
    }

    public void create() {
        System.out.println("Введите цифру:");
        int num = scanner().getInteger();
        System.out.println("Ввели:\n" +
                numberRepository
                        .create(new Numbers(getNextId(), num))
                        .toString());
        ;
    }

    public void update() {

    }

    public void findById(long id) {

    }

    public void deleteById(long id) {

    }

    public void deleteAll() {

    }

    private long getNextId() {
        long currentMaxId = numberRepository
                .findAll()
                .stream()
                .mapToLong(Numbers::getId)
                .max()
                .orElse(0);
        return ++currentMaxId;
    }
}