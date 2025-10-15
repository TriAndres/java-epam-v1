package ru.practicum.lesson.controller;

import ru.practicum.lesson.service.LessonServiceImpl;

public class LessonController {

    public static LessonServiceImpl lessonService() {
        return new LessonServiceImpl();
    }
}