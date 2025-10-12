package ru.practicum.console;

import java.util.Scanner;

public class Console {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getString() {
        return scanner.next();
    }
}