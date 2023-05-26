package com.akash;
/*
<aside>
💡 **Q1.** Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

**Example:**
Input: nums = [2,7,11,15], target = 9
Output0 [0,1]

**Explanation:** Because nums[0] + nums[1] == 9, we return [0, 1]

</aside>
*/

public class A1 {
	public int[] sumTwo(int[] nums, int target) {
		int n = nums.length;
		
		for(int i = 0; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
				if(nums[i] + nums[j] == target) {
					return new int[] {i, j};
				}
			}
		}
		return new int[0];
	}
	
    public static void main(String[] args) {
    	A1 sol = new A1();
    	
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = sol.sumTwo(nums, target);
        
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}


