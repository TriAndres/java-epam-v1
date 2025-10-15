package ru.practicum.numbers.service;

import ru.practicum.numbers.model.Numbers;
import ru.practicum.numbers.repository.NumberRepositoryImpl;

import static ru.practicum.console.Console.getInteger;

public class NumbersServiceImpl implements NumbersService {
    private final NumberRepositoryImpl numberRepository;

    public NumbersServiceImpl(NumberRepositoryImpl numberRepository) {
        this.numberRepository = numberRepository;
    }

    @Override
    public void findAll() {
        int size = 10;
        int count = 0;
        if (!numberRepository.findAll().isEmpty()) {
            for (Numbers numbers : numberRepository.findAll()) {
                System.out.print(numbers.toString() + "\t");
                ++count;
                if (count == size) {
                    System.out.println();
                    count = 0;
                }
            }
            System.out.println("\nВывод списка.\n");
        } else {
            System.out.println("Список пуст.");
        }
    }

    @Override
    public void create() {
        System.out.println("Введите цифру:");
        int num = getInteger();
        System.out.println("Ввели:\n" + numberRepository
                .create(new Numbers(getNextId(), num)));
    }

    @Override
    public void update() {
        System.out.println("Введите id цыры:");
        int num1 = getInteger();

        if (numberRepository.findAll().contains(numberRepository.findById(num1))) {
            System.out.println("Введите цифру:");
            int num2 = getInteger();
            Numbers oldNum = numberRepository.findById(num1);
            oldNum.setNum(num2);
            numberRepository.create(oldNum);
            System.out.println("Обновили цифру.");
        } else {
            System.out.println("id нет в списке.");
        }


    }

    @Override
    public void deleteById() {
        System.out.println("Введите id цыры:");
        int num1 = getInteger();
        if (!numberRepository.findAll().contains(numberRepository.findById(num1))) {
            System.out.println("В списке id нет");
        } else {
            numberRepository.findById(num1);
            System.out.println("Удалили из списка.");
        }
    }

    @Override
    public void deleteAll() {
        numberRepository.deleteAll();
        System.out.println("Список пуст.");
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