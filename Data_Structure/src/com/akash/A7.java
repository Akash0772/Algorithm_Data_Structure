package com.akash;
/*
<aside>
💡 **Q7.** Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the nonzero elements.

Note that you must do this in-place without making a copy of the array.

**Example 1:**
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

</aside>
 */
public class A7 {
	public void moveZero(int[] nums) {
		int n = nums.length;
		int i = 0;
		
		for(int num : nums) {
			if(num != 0) {
				nums[i] = num;
				i++;
			}
		}
		
//		position with zero's
		while(i < n) {
			nums[i] = 0;
			i++;
		}
	}
	public static void main(String[] args) {
		A7 a7 = new A7();
		int[] nums = {0, 1, 0, 3, 12};
		a7.moveZero(nums);
		System.out.print("[");
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print(",");
            }
		}
		System.out.println("]");
	}
}
