package ru.epam.learn.console;

import java.io.IOException;

public class ReadCharMain {
    public static void main(String[] args) {
        int x;
        try {
            x = System.in.read();
            char c = (char) x;
            System.out.println(c + " = " + x);
        } catch (IOException e) {
            System.err.println("error " + e);
        }
    }
}
