package leetCode_easy;

/*
 * Question
 * 
 * Given an array of integers, return indices of the two numbers such that 
 * they add up to a specific target.
 * You may assume that each input would have exactly one solution, 
 * and you may not use the same element twice.
 * 
 * Given nums = [2, 7, 11, 15], target = 9,
 * 	Because nums[0] + nums[1] = 2 + 7 = 9,
 * 	return [0, 1].
 * 
 * 
 * */

public class Q1_TwoSum {

	public static void main(String[] args) {
		int[] test = {3,2,3};
		
		System.out.println("[ " + sum(test, 6)[0] + "," + sum(test, 6)[1] + "]");
		
	}
	
	static int[] sum(int[] nums, int target) {
		int[] result = new int[2];
		int endPoint = nums.length - 1;
		
		for(int i = 0 ; i < nums.length; i++) {
			int count = 1;
			if(i == endPoint) {
				break;
			}
			while(count != nums.length - i) {
				int firstNum = nums[i];
				int otherNum = nums[i + count];
				
				if(firstNum + otherNum == target) {
					result[0] = i;
					result[1] = i + count;
					break;
				}
				count++;
			}
		}
		return result;
	}
}
