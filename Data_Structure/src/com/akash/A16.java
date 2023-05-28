package com.akash;
/*
 Question 8
You are given an integer array nums and an integer k.

In one operation, you can choose any index i where 0 <= i < nums.length and change nums[i] to nums[i] + x where x is an integer from the range [-k, k]. You can apply this operation at most once for each index i.

The score of nums is the difference between the maximum and minimum elements in nums.

Return the minimum score of nums after applying the mentioned operation at most once for each index in it.

Example 1:
Input: nums = [1], k = 0
Output: 0

Explanation: The score is max(nums) - min(nums) = 1 - 1 = 0.
 */
public class A16 {
	public static int minimumScore(int[] nums, int k) {
		int minVal = nums[0];
		int maxVal = nums[0];
		
		for(int i = 1; i < nums.length; i++) {
			int num = nums[i];
			minVal = Math.min(minVal, num - k);
			maxVal = Math.max(maxVal, num - k);
		}
		return maxVal - minVal;
	}
	public static void main(String[] args) {
		A16 a16 = new A16();
		int[] nums = {1};
		int k = 0;
		int minScore = a16.minimumScore(nums, k);
		System.out.println(minScore);
	}
}
