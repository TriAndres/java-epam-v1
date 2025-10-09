package ru.practicum.lesson2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));){

            System.out.println("Ввод\n" +
                    "5 5\n" +
                    "1 1 1 1 1\n" +
                    "3 100 100 100 100\n" +
                    "1 1 1 1 1\n" +
                    "2 2 2 2 1\n" +
                    "1 1 1 1 1\n" +
                    "Вывод\n" +
                    "11");

            System.out.println("Ввод:\nВведите два числа через пробел:");

            String[] line = reader.readLine().split(" +");
            int n = Integer.parseInt(line[0]);
            int m = Integer.parseInt(line[1]);

            int[][] arr = new int[n][m];

            for (int i = 0; i < n; i++) {
                System.out.println("Введите числа через пробел:");
                String[] value = reader.readLine().split(" +");
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(value[j]);
                }
            }

            for (int j = 1; j < m; j++) {
                arr[0][j] += arr[0][j-1];
            }

            for (int i = 1; i < n; i++) {
                arr[i][0] += arr[i-1][0];
            }

            for (int i = 1; i < n; i++) {
                for (int j = 1; j < m; j++) {
                    arr[i][j] += Math.min(arr[i - 1][j], arr[i][j - 1]);
                }
            }

            System.out.println("Вывод:\n");

            writer.write(String.valueOf(arr[n-1][m-1]));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
