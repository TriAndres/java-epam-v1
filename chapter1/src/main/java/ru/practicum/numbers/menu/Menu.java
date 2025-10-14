package ru.practicum.numbers.menu;

public abstract class Menu {

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