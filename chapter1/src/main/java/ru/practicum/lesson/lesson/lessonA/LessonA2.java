package ru.practicum.lesson.lesson.lessonA;

import ru.practicum.lesson.lesson.Lesson;

import static ru.practicum.console.Console.getString;

public class LessonA2 extends Lesson {
    @Override
    public void game() {
        System.out.println("2. Отобразить в окне консоли аргументы командной строки в обратном порядке.");

        System.out.println("Введите аргументы:");
        String name = getString();
        char[] value = name.toCharArray();
        System.out.println("В обратном порядке:");
        for (int i = value.length; i > 0 ; i--) {
            System.out.print(i + "\t");
        }
    }
}