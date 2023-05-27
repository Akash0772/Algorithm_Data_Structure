package com.akash;

import java.util.Arrays;

/*
 <aside>
💡 **Q6.** Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

**Example 1:**
Input: nums = [1,2,3,1]

Output: true

</aside>
 */
public class A6 {
	public boolean containDuplicate(int[] nums) {
		int n = nums.length;
		Arrays.sort(nums);
		for(int i = 1; i < n; i++) {
			if(nums[i] == nums[i - 1]) {
				return true; // duplicate found
			}
		}
		return false; // no duplicate found
	}
	public static void main(String[] args) {
		A6 a6 = new A6();
		int[] nums = {1, 2, 3, 1};
		boolean result = a6.containDuplicate(nums);
		System.out.println(result);
	}
}
