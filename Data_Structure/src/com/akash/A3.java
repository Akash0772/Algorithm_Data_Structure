package com.akash;
/*
<aside>
💡 **Q3.** Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

**Example 1:**
Input: nums = [1,3,5,6], target = 5

Output: 2

</aside>
 */


/*
public class A3 {
	public static int linearSearch(int[] nums, int target) {
		int n = nums.length;
		for(int i = 0; i < n - 1; i++) {
			if(nums[i] == target) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] nums = {1, 3, 5, 6};
		int target = 5;
		int index = linearSearch(nums, target);
		if(index == -1) {
			System.out.println("Not Found");
		}else {
			System.out.println("index of key " + index);
		}
	}
}
*/

public class A3{
	public static int binarySearch(int[] nums, int target) {
		int left = 0; // let val = 0
		int right = nums.length - 1; // let val 3
		
		while(left <= right) { // 0 <= 3
			int mid = left + (right - left) / 2; // mid = 0 + (3 - 0) / 2 = 1
			
			if(nums[mid] == target) { // nums[mid] val = 3 == 5 No
				return mid;
			}else if(nums[mid] < target) { // 3 < 5 (true) , left = 1 + 1 = 2, num[2] val = 5, 5 < 5 false
				left = mid + 1;
			}else {
				right = mid - 1;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		A3 solution = new A3();
		int[] nums = {1, 3, 5, 6};
		int target = 5;
		int index = solution.binarySearch(nums, target);
		System.out.println("index " + index);
	}
}