package com.akash;

import java.util.Arrays;

/*
<aside>
💡 **Q4.** You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

**Example 1:**
Input: digits = [1,2,3]
Output: [1,2,4]

**Explanation:** The array represents the integer 123.

Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

</aside>
 */
public class A4 {
	public static int[] plus(int[] nums) {
		int n = nums.length;
		
//		reverse
		for(int i = n - 1; i >= 0; i--) {
			if(nums[i] < 9) {
				nums[i]++;
				return nums;
			}
			nums[i] = 0;
		}
		int[] newNums = new int[n + 1];
        newNums[0] = 1;
        return newNums;
	}
	public static void main(String[] args) {
		A4 a4 = new A4();
		int[] nums = {1, 2, 3};
		int[] result = a4.plus(nums);
		System.out.print("Result: ");
		for(int num : result) {
			System.out.print(num + " ");
		}
	}
}
