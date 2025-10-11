package ru.epam.learn.main;

public class ComparisonString {
    public static void main(String[] args) {
        String str1, str2;
        str1 = "Java";
        str2 = str1;
        System.out.println(str1 == str2);
        str2 = new String("Java");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}
