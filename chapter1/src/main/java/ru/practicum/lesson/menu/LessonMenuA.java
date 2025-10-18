package ru.practicum.lesson.menu;

import static ru.practicum.console.Console.getString;
import static ru.practicum.lesson.controller.LessonController.lessonService;

public class LessonMenuA extends LessonMenu{
    @Override
    public String menu() {
        System.out.println("""
                 Выбирите действие:
                1 - задача1.
                2 - задача2.
                3 - задача3.
                4 - задача4.
                5 - задача5.
                6 - задача6.
                0 - выход из меню.
                """);
        return getString();
    }

    @Override
    public void select(String line) {
        switch (line) {
            case "1":
                lessonService().lessonA1();
                break;
            case "2":
                lessonService().lessonA2();
                break;
            case "3":
                lessonService().lessonA3();
                break;
            case "4":
                lessonService().lessonA4();
                break;
            case "5":
                lessonService().lessonA5();
                break;
            case "6":
                lessonService().lessonA6();
                break;
            case "0":
                System.out.println("Выход из меню.");;
                break;
            default:
                System.out.println("Выбирите задачи из списка.");
                break;
        }
    }
}