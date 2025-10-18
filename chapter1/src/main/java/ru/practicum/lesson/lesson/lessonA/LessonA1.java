package ru.practicum.lesson.lesson.lessonA;

import ru.practicum.lesson.lesson.Lesson;

import static ru.practicum.console.Console.getString;

public class LessonA1 extends Lesson {
    @Override
    public void game() {
        System.out.println("1. Приветствовать любого пользователя при вводе его имени через командную строку.\n");
        System.out.println("Введите ваше имя:");
        String name = getString();
        System.out.println(name + ", вас приветствую!");
    }
}