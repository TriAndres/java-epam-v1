package ru.epam.learn.console;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {
        System.out.println("Ввежите:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println(name);
        int num = scanner.nextInt();
        System.out.println(num);
        scanner.close();
    }
}
