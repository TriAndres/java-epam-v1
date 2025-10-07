package ru.practicum.lesson1;

import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));) {

            System.out.println("Введите три цифры через пробел:\nПример: 12 7 51");////

            String[] line = reader.readLine().split(" +");
            List<Integer> list = new ArrayList<>();
            for (String num : line) {
                int n = Integer.parseInt(num);
                if (n >= - 1000 && n <= 1000) {
                    list.add(n);
                }
            }
            Collections.sort(list);
            writer.write("Среднее число:" + String.valueOf(list.get(1)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
