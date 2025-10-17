package ru.practicum.task_1456;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        System.out.println("\nExample 1:\n" +
                "Input: s = \"abciiidef\", k = 3\n" +
                "Output: 3\n" +
                "Explanation: The substring \"iii\" contains 3 vowel letters.");
        String s1 ="abciiidef";
        int k1 = 3;
        System.out.println("-> " + maxVowels(s1, k1));

        System.out.println("\nExample 2:\n" +
                "Input: s = \"aeiou\", k = 2\n" +
                "Output: 2\n" +
                "Explanation: Any substring of length 2 contains 2 vowels.");
        String s2 ="aeiou";
        int k2 = 2;
        System.out.println("-> " + maxVowels(s2, k2));

        System.out.println("\nExample 3:\n" +
                "Input: s = \"leetcode\", k = 3\n" +
                "Output: 2\n" +
                "Explanation: \"lee\", \"eet\" and \"ode\" contain 2 vowels.");
        String s3 ="leetcode";
        int k3 = 3;
        System.out.println("-> " + maxVowels(s3, k3));
    }

    public static int maxVowels(String s, int k) {
        Set<Character> set = new HashSet<>();
        Collections.addAll(set, 'a', 'e', 'i', 'o', 'u');
        int str1 = 0;
        int str2 = 0;
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            str1 += set.contains(s.charAt(i)) ? 1 : 0;
            if(i - str2 + 1 > k){
                str1 -= set.contains(s.charAt(str2)) ? 1 : 0;
                str2++;
            }
            max = Math.max(max, str1);
        }
        return max;
    }
}