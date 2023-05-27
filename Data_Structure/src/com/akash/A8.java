package com.akash;

import java.util.Arrays;

/*
<aside>
💡 **Q8.** You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

**Example 1:**
Input: nums = [1,2,2,4]
Output: [2,3]

</aside>
 */
public class A8 {
	public int[] findErrorNum(int[] nums) {
		int[] result = new int[2];
		int n = nums.length;
		int sum = (n * (n + 1)) / 2;  // Sum of numbers from 1 to n
        int duplicate = -1;
        
//        Find the duplicate
        for (int num : nums) {
            if (nums[Math.abs(num) - 1] < 0) { //returns the absolute value of a number
                duplicate = Math.abs(num);
            } else {
                nums[Math.abs(num) - 1] *= -1;
            }
            sum -= Math.abs(num);
        }
        
//        find missing number
        int missing = sum + duplicate;
        
        result[0] = duplicate;
        result[1] = missing;
        
        return result;
	}
	
	public static void main(String[] args) {
		A8 a8 = new A8();
		int[] nums = {1, 2, 2, 4};
		int[] result = a8.findErrorNum(nums);
		System.out.println(Arrays.toString(result));
	}
}
