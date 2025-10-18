package ru.practicum.lesson.menu;

import static ru.practicum.console.Console.getString;
import static ru.practicum.lesson.controller.LessonController.lessonService;

public class LessonMenuB extends LessonMenu {
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
                7 - задача7.
                8 - задача8.
                9 - задача9.
                10 - задача10.
                11 - задача11.
                0 - выход из меню.
                """);
        return getString();
    }

    @Override
    public void select(String line) {
        switch (line) {
            case "1":
                lessonService().lessonB1();
                break;
            case "2":
                lessonService().lessonB2();
                break;
            case "3":
                lessonService().lessonB3();
                break;
            case "4":
                lessonService().lessonB4();
                break;
            case "5":
                lessonService().lessonB5();
                break;
            case "6":
                lessonService().lessonB6();
                break;
            case "7":
                lessonService().lessonB7();
                break;
            case "8":
                lessonService().lessonB8();
                break;
            case "9":
                lessonService().lessonB9();
                break;
            case "10":
                lessonService().lessonB10();
                break;
            case "11":
                lessonService().lessonB11();
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