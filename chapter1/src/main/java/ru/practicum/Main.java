package ru.practicum;

import static ru.practicum.controller.Controller.numbersMenu;
import static ru.practicum.controller.Controller.securityMenu;

public class Main {


    public static void main(String[] args) {
        new Main().game();
    }

    public void game(){
        securityMenu().game();
        numbersMenu().game();
    }
}