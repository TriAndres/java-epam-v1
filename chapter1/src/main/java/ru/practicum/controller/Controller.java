package ru.practicum.controller;

import ru.practicum.console.Console;
import ru.practicum.menu.Menu;
import ru.practicum.menu.NumbersMenu;
import ru.practicum.repository.SecurityRepository;
import ru.practicum.repository.SecurityRepositoryImpl;
import ru.practicum.service.SecurityService;

public class Controller {
    public static Console scanner() {
        return new Console();
    }
    public static SecurityRepository securityRepository() {
        return new SecurityRepositoryImpl();
    }

    public static SecurityService securityService() {
        return new SecurityService((SecurityRepositoryImpl) securityRepository());
    }

   // SecurityService securityService = new SecurityService((SecurityRepositoryImpl) securityRepository());

    public static Menu numbersMenu() {
        return new NumbersMenu();
    }
}
