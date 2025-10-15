package ru.practicum.lesson.menu;

public abstract class LessonMenu {

    public void game() {
        while (true) {
            String line = menu();
            select(line);
            if (line.equals("0")) {
                break;
            }
        }
    }

    public abstract String menu();

    public abstract void select(String line);
}