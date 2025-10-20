package ru.practicum.lesson.service;

import ru.practicum.lesson.lesson.lessonA.*;
import ru.practicum.numbers.repository.NumberRepositoryImpl;
import ru.practicum.numbers.service.NumbersServiceImpl;
import ru.practicum.security.repository.SecurityRepositoryImpl;

import static ru.practicum.numbers.controller.NumbersController.numberRepository;
import static ru.practicum.numbers.controller.NumbersController.numbersService;
import static ru.practicum.security.controller.SecurityController.securityRepository;

public class LessonServiceImpl implements LessonService {
    private final NumberRepositoryImpl numberRepository;
    private final SecurityRepositoryImpl securityRepository;

    public LessonServiceImpl() {
        numberRepository = numberRepository();
        securityRepository = securityRepository();
    }

    @Override
    public void lessonA1() {
        new LessonA1().game();
        System.out.println("Выход из задачи lessonA1()\n");
    }

    @Override
    public void lessonA2() {
        new LessonA2().game();
        System.out.println("Выход из задачи lessonA2()\n");
    }

    @Override
    public void lessonA3() {
        new LessonA3(numberRepository).game();
        System.out.println("Выход из задачи lessonA3()\n");
    }

    @Override
    public void lessonA4() {
        new LessonA4().game();
        System.out.println("Выход из задачи lessonA4()\n");
    }

    @Override
    public void lessonA5() {
        new LessonA5().game();
        System.out.println("Выход из задачи lessonA5()\n");
    }

    @Override
    public void lessonA6() {
        new LessonA6().game();
        System.out.println("Выход из задачи lessonA6()\n");
    }

    @Override
    public void lessonB1() {
        System.out.println("Выход из задачи lessonB1()\n");
    }

    @Override
    public void lessonB2() {
        System.out.println("Выход из задачи lessonB2()\n");
    }

    @Override
    public void lessonB3() {
        System.out.println("Выход из задачи lessonB3()\n");
    }

    @Override
    public void lessonB4() {
        System.out.println("Выход из задачи lessonB4()\n");
    }

    @Override
    public void lessonB5() {
        System.out.println("Выход из задачи lessonB5()\n");
    }

    @Override
    public void lessonB6() {
        System.out.println("Выход из задачи lessonB6()\n");
    }

    @Override
    public void lessonB7() {
        System.out.println("Выход из задачи lessonB7()\n");
    }

    @Override
    public void lessonB8() {
        System.out.println("Выход из задачи lessonB8()\n");
    }

    @Override
    public void lessonB9() {
        System.out.println("Выход из задачи lessonB9()\n");
    }

    @Override
    public void lessonB10() {
        System.out.println("Выход из задачи lessonB10()\n");
    }

    @Override
    public void lessonB11() {
        System.out.println("Выход из задачи lessonB11()\n");
    }
}