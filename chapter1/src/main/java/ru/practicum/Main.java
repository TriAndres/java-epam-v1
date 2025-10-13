package ru.practicum;

import ru.practicum.model.Security;
import ru.practicum.service.SecurityServiceImpl;

import static ru.practicum.controller.Controller.*;

public class Main {

    public static void main(String[] args) {
        SecurityServiceImpl securityService = securityServiceDefaults();
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