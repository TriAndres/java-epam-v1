package ru.practicum;

import ru.practicum.model.Security;
import ru.practicum.repository.SecurityRepositoryImpl;
import ru.practicum.service.SecurityService;

import static ru.practicum.controller.Controller.*;

public class Main {

    public static void main(String[] args) {
        SecurityService securityService = securityService();
        while (true) {
            Security security = securityService.registration();
            if (security == null) {
                break;
            } else if (security.isStart()) {
                numbersMenu().game();
            }
        }
    }



}