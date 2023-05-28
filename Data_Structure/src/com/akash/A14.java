package com.akash;

public class A14{
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
		A14 solution = new A14();
		int[] nums = {1, 3, 5, 6};
		int target = 5;
		int index = solution.binarySearch(nums, target);
		System.out.println("index " + index);
	}
}