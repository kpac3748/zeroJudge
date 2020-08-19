package leetCode_easy;

import java.util.Arrays;

/**
 * Given a sorted array and a target value, return the index if the target is found. 
 * If not, return the index where it would be if it were inserted in order.
 * You may assume no duplicates in the array.
 * */
public class Q35SearchInsertPosition {

	public static void main(String[] args) {
		int[] nums = {1,3,5,7,10,100};
		int target = 101;
		
		System.out.println(searchInsert(nums, target));
	}
	
	static int searchInsert(int[] nums, int target) {
		int low = 0;
		int upper = nums.length -1;
		int mid = 0;
        
        while(low <= upper) {
        	mid = (low + upper) /2;
        	if(target > nums[mid]) {
        		low = mid +1 ;
        	}
        	else if(target < nums[mid]) {
        		upper = mid -1;
        	}
        	else {
        		return mid;
        	}
        }
        
        if(target > nums[mid]) {
        	return mid +1;
        }
        
        return mid;
    }
}
