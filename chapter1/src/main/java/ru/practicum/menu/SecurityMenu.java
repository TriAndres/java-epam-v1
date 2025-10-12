package ru.practicum.menu;


import static ru.practicum.console.Console.getString;

public class SecurityMenu extends Menu {
    @Override
    public String menu() {
        System.out.println("""
                Выбирите действие:
                1 - Зарегистрироваться.
                2 - Войти.
                0 - Выйти из программы.
                """);
        return getString();
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
            case "0":
                System.out.println("Выход из меню NumbersMenu.");
                break;
            default:
                System.out.println("Выбирите из списка команду.");
                break;
        }
    }
}
