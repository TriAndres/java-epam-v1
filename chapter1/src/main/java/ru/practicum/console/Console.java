package ru.practicum.console;

import java.util.Scanner;

public class Console {
    private final Scanner scanner = new Scanner(System.in);

    public String getString() {
        return scanner.next();
    }
}