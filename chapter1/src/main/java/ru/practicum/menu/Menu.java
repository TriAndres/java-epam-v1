package ru.practicum.menu;

public abstract class Menu {

    public void game() {
        while (true) {
            String line = menu();
            if (line.equals("0")) {
                break;
            }
            select(line);
        }
    }

    public abstract String menu();

    public abstract void select(String line);
}