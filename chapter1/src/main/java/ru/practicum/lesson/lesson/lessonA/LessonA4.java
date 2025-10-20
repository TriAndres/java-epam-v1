package ru.practicum.lesson.lesson.lessonA;

import ru.practicum.lesson.lesson.Lesson;

import static ru.practicum.console.Console.getString;
import static ru.practicum.lesson.controller.LessonController.lessonService;

public class LessonA4 extends Lesson {
    @Override
    public void game() {
        System.out.println("4. Ввести пароль из командной строки и сравнить его со строкой-образцом. \n");

        String password = "password";
        System.out.println("Введите пароль:");
        String name = getString();
        if (password.equals(name)) {
            System.out.println("пароль верный!");
        } else {
            System.out.println("попробуйте заново ввести пароль.");
        }
    }


    public static void main(String[] args) {
        lessonService().lessonA4();
    }
}