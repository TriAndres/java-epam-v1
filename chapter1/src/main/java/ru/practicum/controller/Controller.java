package ru.practicum.controller;

import ru.practicum.console.Console;
import ru.practicum.menu.Menu;
import ru.practicum.menu.NumbersMenu;
import ru.practicum.repository.NumberRepository;
import ru.practicum.repository.NumberRepositoryImpl;
import ru.practicum.repository.SecurityRepository;
import ru.practicum.repository.SecurityRepositoryImpl;
import ru.practicum.service.NumbersService;
import ru.practicum.service.NumbersServiceImpl;
import ru.practicum.service.SecurityServiceImpl;

public class Controller {
    public static Console scanner() {
        return new Console();
    }
    public static SecurityRepository securityRepositoryDefaults() {
        return new SecurityRepositoryImpl();
    }

    public static SecurityServiceImpl securityServiceDefaults() {
        return new SecurityServiceImpl((SecurityRepositoryImpl) securityRepositoryDefaults());
    }

    public static Menu numbersMenu() {
        return new NumbersMenu();
    }

    public static NumberRepository numberRepositoryDefaults() {
        return new NumberRepositoryImpl();
    }

    public static NumbersService numbersServiceDefaults() {
        return new NumbersServiceImpl((NumberRepositoryImpl) numberRepositoryDefaults());
    }
}
