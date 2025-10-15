package ru.practicum.numbers.menu;

import static ru.practicum.console.Console.getString;
import static ru.practicum.numbers.controller.NumbersController.numbersService;

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
        return getString();
    }

    @Override
    public void select(String line) {
        switch (line) {
            case "1":
                numbersService().findAll();
                break;
            case "2":
                numbersService().create();
                break;
            case "3":
                numbersService().update();
                break;
            case "4":
                numbersService().deleteById();
                break;
            case "5":
                numbersService().deleteAll();
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