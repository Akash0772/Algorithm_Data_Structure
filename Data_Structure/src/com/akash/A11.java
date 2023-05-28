package com.akash;
/*
Question 4
You have a long flowerbed in which some of the plots are planted, and some are not.
However, flowers cannot be planted in adjacent plots.
Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

Example 1:
Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
 */
public class A11 {
    public static boolean canPlaceFlowers(int[] nums, int n) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            } else {
                if (count >= 2) {
                    n -= count / 2;
                }
                count = 0;
            }
        }

        if (count >= 2) {
            n -= (count + 1) / 2;
        }

        return n <= 0;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 0, 0, 1};
        int n = 1;
        boolean result = canPlaceFlowers(nums, n);
        System.out.println(result);
    }
}

