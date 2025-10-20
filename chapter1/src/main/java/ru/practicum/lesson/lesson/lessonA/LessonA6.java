package ru.practicum.lesson.lesson.lessonA;

import ru.practicum.lesson.lesson.Lesson;
import ru.practicum.security.repository.SecurityRepositoryImpl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static ru.practicum.lesson.controller.LessonController.lessonService;

public class LessonA6 extends Lesson {

    @Override
    public void game() {
        System.out.println("6. Вывести фамилию разработчика, дату и время получения задания, а также \n" +
                "дату и время сдачи задания. \n");
        String name = "Сергеев";
        LocalDateTime localDateTime1 = LocalDateTime.now();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm:ss a");
        String date1 = localDateTime1.format(formatter1);
        System.out.println(name + ", получили задания, " + date1);


        LocalDateTime localDateTime2 = localDateTime1.plusDays(10);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy 10:00 a");
        String date2 = localDateTime2.format(formatter2);
        System.out.println(name + ", сдача задания, " + date2);
    }

    public static void main(String[] args) {
        lessonService().lessonA6();
    }
}