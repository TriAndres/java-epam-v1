package ru.practicum.menu;

import static ru.practicum.controller.Controller.scanner;

public class NumbersMenu extends Menu {
    @Override
    public String menu() {
        System.out.println("""
                Выбирите действие:
                1 - добавить.
                2 - обновить.
                3 - удалить по id.
                4 - удалить всё.
                0 - выход из меню.
                """);
        return scanner().getString();
    }

    @Override
    public void select(String line) {
        switch (line) {
            case "1":
                System.out.println("В разработке.");
                break;
            case "2":
                System.out.println("В разработке.");
                break;
            case "3":
                System.out.println("В разработке.");
                break;
            case "4":
                System.out.println("В разработке.");
                break;
            case "0":
                System.out.println("Выход из меню NumbersMenu.");
                break;
            default:
                System.out.println("Выбирите из списка команду.");
                break;
        }
    }
}