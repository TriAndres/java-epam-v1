package ru.practicum;

import ru.practicum.lesson.menu.LessonMenuA;
import ru.practicum.lesson.menu.LessonMenuB;
import ru.practicum.numbers.menu.NumbersMenu;
import ru.practicum.security.model.Security;
import ru.practicum.security.service.SecurityServiceImpl;

import static ru.practicum.console.Console.getString;
import static ru.practicum.security.controller.SecurityController.securityService;

public class Main {

    public static void main(String[] args) {
        SecurityServiceImpl securityService = securityService();
        while (true) {
            Security security = securityService.registration();
            if (security == null) {
                break;
            } else if (security.isStart()) {
                game();
            }
        }
    }

    public static void game() {
        while (true) {
            String line = menu();
            select(line);
            if (line.equals("0")) {
                break;
            }
        }
    }

    private static String menu() {
        System.out.println("""
                Выбирите действик:
                1 - меню цифр.
                2 - меню задач А.
                3 - меню задач B.
                0 - выход из программы.
                """);
        return getString();
    }

    private static void select(String line) {
        switch (line) {
            case "1":
                new NumbersMenu().game();
                break;
            case "2":
                new LessonMenuA().game();
                break;
            case "3":
                new LessonMenuB().game();
                break;
            case "0":
                System.out.println("выход из программы.");
                break;
            default:
                System.out.println("Выбирите меню из списка.");
                break;
        }
    }
}