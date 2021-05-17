package leetCode_easy;

import java.util.Arrays;

public class Q136_SingleNumber {
	
	/*
	 * Given a non-empty array of integers nums, 
	 * every element appears twice except for one. 
	 * Find that single one.
	 * Follow up: Could you implement a solution with a linear runtime complexity and without using extra memory?
		Example 1:
		
		Input: nums = [2,2,1]
		Output: 1
		Example 2:
		
		Input: nums = [4,1,2,1,2]
		Output: 4
		Example 3:
		
		Input: nums = [1]
		Output: 1
	 * */

	public static void main(String[] args) {
		int[] input = {4,1,2,1,2};
		
		int result = singleNumber(input);
		System.out.println(result);
	}
	
	public static int singleNumber(int[] nums) {
		int result = 0;
		
		Arrays.sort(nums);
		
		for(int i = 0; i < nums.length; i++) {
			if(nums.length == 1) {
				result = nums[i];
				break;
			}
			
			if(i ==  nums.length -1) {
				break;
			}
			
			int numBase = nums[i];
			int numNext = nums[i + 1];
			
			if(numBase != numNext) {
				continue;
			}
			else {
				nums[i] = -30001;
				nums[i + 1] = -30001;
			}
			
			i++;
		}
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != -30001) {
				result = nums[i];
				break;
			}
		}
		
		
		return result;
    }

}
