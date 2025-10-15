package ru.practicum.menu;

import static ru.practicum.controller.Controller.numbersServiceDefaults;
import static ru.practicum.controller.Controller.scanner;

public class NumbersMenu extends Menu {
    @Override
    public String menu() {
        System.out.println("""
                Выбирите действие:
                1 - вывод списка.
                2 - добавить.
                3 - обновить.
                4 - удалить по id.
                5 - удалить всё.
                0 - выход из меню.
                """);
        return scanner().getString();
    }

    @Override
    public void select(String line) {
        switch (line) {
            case "1":
                numbersServiceDefaults().findAll();
                break;
            case "2":
                numbersServiceDefaults().create();
                break;
            case "3":
                numbersServiceDefaults().update();
                break;
            case "4":
                numbersServiceDefaults().deleteById();
                break;
            case "5":
                numbersServiceDefaults().deleteAll();
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