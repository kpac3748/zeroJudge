package leetCode_easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Given an integer array nums, find the contiguous subarray (containing at least one number) 
 * which has the largest sum and return its sum.
 * 
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * 
 * */
public class Q53_MaximumSubarray {

	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		
		System.out.println(maxSubArray(nums));
	}
	
	static int maxSubArray(int[] nums) {
        int sum = 0;
        int count = 0;
        int index = 0;
        Integer max = 0;
        List<Integer> lst = new ArrayList<Integer>();
        
        for(int i = count; i < nums.length; i++) {
        	sum += nums[i];
        	lst.add(sum);
        }
        
        for(int i = 0; i < lst.size(); i++) {
        }
        
        for(int i = 0; i < index ; i++) {
        	max -= nums[i];
        }
        
        return max;
    }

}
