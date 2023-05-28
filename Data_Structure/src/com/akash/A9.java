package com.akash;

import java.util.Arrays;

/*
<aside>
💡 **Question 1**
Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2),..., (an, bn) such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.

**Example 1:**
Input: nums = [1,4,3,2]
Output: 4

**Explanation:** All possible pairings (ignoring the ordering of elements) are:

1. (1, 4), (2, 3) -> min(1, 4) + min(2, 3) = 1 + 2 = 3
2. (1, 3), (2, 4) -> min(1, 3) + min(2, 4) = 1 + 2 = 3
3. (1, 2), (3, 4) -> min(1, 2) + min(3, 4) = 1 + 3 = 4
So the maximum possible sum is 4
</aside>
 */
public class A9 {
	public int arrayPairsSum(int[] nums) {
		Arrays.sort(nums);
		int n = nums.length;
		int sum = 0;
		
		for(int i = 0; i < n; i += 2) {
			sum += nums[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		A9 a9 = new A9();
		int[] nums = {1, 4, 3, 2};
		int result = a9.arrayPairsSum(nums);
		System.out.println(result);
	}
}
