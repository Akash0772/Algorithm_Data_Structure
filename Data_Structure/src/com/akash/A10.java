package com.akash;

import java.util.Arrays;

/*
Question 2
Alice has n candies, where the ith candy is of type candyType[i]. Alice noticed that she started to gain weight, so she visited a doctor. 

The doctor advised Alice to only eat n / 2 of the candies she has (n is always even). Alice likes her candies very much, and she wants to eat the maximum number of different types of candies while still following the doctor's advice. 

Given the integer array candyType of length n, return the maximum number of different types of candies she can eat if she only eats n / 2 of them.

Example 1:
Input: candyType = [1,1,2,2,3,3]
Output: 3

Explanation: Alice can only eat 6 / 2 = 3 candies. Since there are only 3 types, she can eat one of each type.
 */
public class A10 {
	public static int candyType(int[] nums) {
		int n = nums.length / 2;
		Arrays.sort(nums);
		
		int uniCandy = 1;
		
		for(int i = 1; i < nums.length && uniCandy < n; i++) {
			if(nums[i] != nums[i - 1]) {
				uniCandy++;
			}
		}
		return Math.min(uniCandy, n);
	}
	public static void main(String[] args) {
		A10 a10 = new A10();
		int[] nums = {1, 1, 2, 2, 3, 3};
		int result = a10.candyType(nums);
		System.out.println(result);
	}
}
