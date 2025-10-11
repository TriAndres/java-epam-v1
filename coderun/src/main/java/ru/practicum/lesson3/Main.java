package ru.practicum.lesson3;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {

            System.out.println("Ввод\n" +
                    "5 5\n" +
                    "9 9 9 9 9\n" +
                    "3 0 0 0 0\n" +
                    "9 9 9 9 9\n" +
                    "6 6 6 6 8\n" +
                    "9 9 9 9 9\n" +
                    "Вывод\n" +
                    "74\n" +
                    "D D R R R R D D");

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



            for (int i = 1; i < n; i++) {
                arr[i][0] += arr[i-1][0];
            }

            for (int j = 1; j < m; j++) {
                arr[0][j] += arr[0][j-1];
            }

            for (int i = 1; i < n; i++) {
                for (int j = 1; j < m; j++) {
                    arr[i][j] += Math.max(arr[i- 1][j], arr[i][j - 1]);
                }
            }

            writer.write(String.valueOf(arr[n-1][m-1]));

            writer.newLine();

            StringBuilder path = new StringBuilder();
            int x = n - 1;
            int y = m - 1;

            while (x > 0 || y > 0) {
                if (x == 0) {
                    path.append("L");
                    --y;
                } else if (y == 0) {
                    path.append("U");
                    --x;
                } else if (arr[x - 1][y] >= arr[x][y - 1]) {
                    path.append("U");
                    --x;
                } else {
                    path.append("L");
                    --y;
                }
            }

            char[] reversedPath = path.toString().toCharArray();
            for (int i = 0; i < reversedPath.length / 2; i++) {
                char temp = reversedPath[i];
                reversedPath[i] = reversedPath[reversedPath.length - i - 1];
                reversedPath[reversedPath.length - i - 1] = temp;
            }

            String resultPath = "";
            for (char c : reversedPath) {
                if (c == 'U') resultPath += "D "; //вниз
                else resultPath += "R ";  //в право
            }

            writer.write(resultPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
