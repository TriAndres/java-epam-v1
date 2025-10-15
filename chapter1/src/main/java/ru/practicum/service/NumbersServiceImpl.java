package ru.practicum.service;

import ru.practicum.model.Numb;
import ru.practicum.repository.NumberRepositoryImpl;

import static ru.practicum.controller.Controller.scanner;

public class NumbersServiceImpl implements NumbersService {
    private final NumberRepositoryImpl numberRepository;

    public NumbersServiceImpl(NumberRepositoryImpl numberRepository) {
        this.numberRepository = numberRepository;
    }

    @Override
    public void findAll() {
        int size = 10;
        int count = 0;
        //if (!numberRepository.findAll().isEmpty()) {
            for (Numb numbers : numberRepository.findAll()) {
                System.out.print(numbers.toString() + "\t");
                ++count;
                if (count == size) {
                    System.out.println();
                    count = 0;
                }
            }
            System.out.println("Вывод списка.\n");
//        } else {
//            System.out.println("Список пуст.");
//        }
    }

    @Override
    public void create() {
        System.out.println("Введите цифру:");
        int num = scanner().getInteger();
        System.out.println(num);
        System.out.println(getNextId());
        numberRepository.create(new Numb(getNextId(), num));
        System.out.println("Ввели:\n" +
                numberRepository
                        .findById(num));

    }

    @Override
    public void update() {
        System.out.println("Введите id цыры:");
        int num1 = scanner().getInteger();

        if (numberRepository.findAll().contains(numberRepository.findById(num1))) {
            System.out.println("Введите цифру:");
            int num2 = scanner().getInteger();
            Numb oldNum = numberRepository.findById(num1);
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
        int num1 = scanner().getInteger();
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
                .mapToLong(Numb::getId)
                .max()
                .orElse(0);
        return ++currentMaxId;
    }
}