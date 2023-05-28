package com.akash;
/*
Question 7
An array is monotonic if it is either monotone increasing or monotone decreasing.

An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is
monotone decreasing if for all i <= j, nums[i] >= nums[j].

Given an integer array nums, return true if the given array is monotonic, or false otherwise.

Example 1:
Input: nums = [1,2,2,3]
Output: true
 */
public class A15 {
	public static boolean monotonic(int[] nums) {
		boolean increase = true;
		boolean decrease = true;
		
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] < nums[i - 1]) {
				increase = false;
			}
			if(nums[i] > nums[i - 1]) {
				decrease = false;
			}
		}
		return increase || decrease;
	}
	public static void main(String[] args) {
		A15 a15 = new A15();
		int[] nums = {1, 2, 2, 3};
		boolean isMonotonic = a15.monotonic(nums);
		System.out.println(isMonotonic);
	}
}
