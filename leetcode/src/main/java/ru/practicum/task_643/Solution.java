package ru.practicum.task_643;

public class Solution {

    public static void main(String[] args) {

        System.out.println("\nExample 1:\n" +
                "Input: nums = [1,12,-5,-6,50,3], k = 4\n" +
                "Output: 12.75000\n" +
                "Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75");
        int[] nums2 = {1, 12, -5, -6, 50, 3};
        System.out.println("-> " + findMaxAverage(nums2, 4));

        System.out.println(
                "\nInput: nums = [5], k = 1\n" +
                        "Output: 5.00000");
        int[] nums1 = {5};
        System.out.println("-> " + findMaxAverage(nums1, 1));
    }

    public static double findMaxAverage(int[] nums, int k) {
        double s;
        double max = Integer.MIN_VALUE;
        int count = 0;
        if (nums.length == 1) {
            max = (double) nums[0];
        } else {
            for (int i = 0; i < nums.length; i++) {
                s = 0;
                for (int j = i; j < nums.length; j++) {
                    count++;
                    s += nums[j];
                    if (count == 4) {
                        count = 0;
                        break;
                    }
                }
                if (max < s) {
                    max = s;
                }
            }
        }
        return max / k;
    }
}