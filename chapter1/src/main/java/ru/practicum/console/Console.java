package ru.practicum.console;

import java.util.Scanner;

public class Console {
    private final Scanner scanner = new Scanner(System.in);

    public String getString() {
        return scanner.next();
    }

    public Integer getInteger() {
        int num;
        while (true) {
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                if (num > 0) {
                    break;
                }
            } else {
                scanner.hasNextLine();
            }
        }
        return num;
    }
}