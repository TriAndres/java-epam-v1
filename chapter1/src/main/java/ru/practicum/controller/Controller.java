package ru.practicum.controller;

import ru.practicum.menu.Menu;
import ru.practicum.menu.NumbersMenu;
import ru.practicum.menu.SecurityMenu;

public class Controller {

    public static Menu numbersMenu() {
        return new NumbersMenu();
    }

    public static Menu securityMenu() {
        return new SecurityMenu();
    }
}
