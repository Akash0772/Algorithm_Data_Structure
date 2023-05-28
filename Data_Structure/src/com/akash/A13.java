package com.akash;

import java.util.Arrays;

/*
Question 5
Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

Example 1:
Input: nums = [1,2,3]
Output: 6
 */
public class A13 {
	public int arrayProduct(int[] nums) {
		int n = nums.length;
		Arrays.sort(nums);
		
		int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
		int product2 = nums[0] * nums[1] * nums[n - 1];
		
		return Math.max(product1, product2);
	}
	public static void main(String[] args) {
		A13 a13 = new A13();
		int[] nums = {1, 2, 3};
		int arrProduct = a13.arrayProduct(nums);
		System.out.println(arrProduct);
	}
}
