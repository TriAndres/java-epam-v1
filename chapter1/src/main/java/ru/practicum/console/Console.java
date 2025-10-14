package ru.practicum.console;

import java.util.Scanner;

public class Console {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getString() {
        return scanner.next();
    }

    public static Integer getInteger() {
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

    public static Long getLong() {
        long num;
        while (true) {
            if (scanner.hasNextLong()) {
                num = scanner.nextLong();
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