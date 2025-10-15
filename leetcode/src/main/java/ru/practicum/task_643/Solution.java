package ru.practicum.task_643;

public class Solution {

    public static void main(String[] args) {
        System.out.println("Example 1:\n" +
                "\n" +
                "Input: nums = [1,12,-5,-6,50,3], k = 4\n" +
                "Output: 12.75000\n" +
                "Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75\n" +
                "Example 2:\n" +
                "\n" +
                "Input: nums = [5], k = 1\n" +
                "Output: 5.00000");

        int[] nums = {1,12,-5,-6,50,3};
        System.out.println("-> " + findMaxAverage(nums, 4));
//        int[] nums = {5};
//        System.out.println("-> " + findMaxAverage(nums, 1));

    }

    public static double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double s = 0;
        double max = Integer.MAX_VALUE;

        if (n == 1) {
            max = (double) nums[0];
        } else {
            for (int i = 0; i < n - k; i++) {
                s = 0;
                for (int j = i; j < i + k; j++) {
                    s += nums[j];
                }
                max = Math.max(max, s);

            }
        }
        System.out.println("-> " + max + " -> " + k);
        return max/k;
    }
}
