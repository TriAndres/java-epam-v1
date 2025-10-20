package ru.practicum.lesson.lesson.lessonA;

import ru.practicum.lesson.lesson.Lesson;

import static ru.practicum.console.Console.getString;
import static ru.practicum.lesson.controller.LessonController.lessonService;

public class LessonA5 extends Lesson {
    @Override
    public void game() {
        System.out.println("5. Ввести целые числа как аргументы командной строки, подсчитать их\n" +
                "суммы и произведения. Вывести результат на консоль. \n");
        int sum = 0;
        int multiply = 1;
        while (true) {
            System.out.println("Введите числа  или 0 для выхода:");
            String line = getString();
            try {
                int num = Integer.parseInt(line);
                sum += num;
                multiply *= num;
            } catch (NumberFormatException e) {
                System.out.println("Не верный ввод.");
            }
            if (line.equals("0")) {
                break;
            }
            if (sum > 10_000 || multiply > 10_000) {
                System.out.println("Сумма или произведение больше 10_000");
                break;
            }
            System.out.println("сумма -> " + sum + "\n" +
                    "произведение -> " + multiply);
        }
    }

    public static void main(String[] args) {
        lessonService().lessonA5();
    }
}