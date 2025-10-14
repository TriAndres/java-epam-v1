package ru.practicum;

import ru.practicum.numbers.menu.NumbersMenu;
import ru.practicum.security.model.Security;
import ru.practicum.security.service.SecurityServiceImpl;
import static ru.practicum.security.controller.SecurityController.securityService;

public class Main {

    public static void main(String[] args) {

        SecurityServiceImpl securityService = securityService();
        while (true) {
            Security security = securityService.registration();
            if (security == null) {
                break;
            } else if (security.isStart()) {
                new NumbersMenu().game();
            }
        }
    }
}