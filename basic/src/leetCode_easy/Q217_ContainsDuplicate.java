package leetCode_easy;

import java.util.Arrays;

/*
 * 
 * Given an integer array nums, 
 * return true if any value appears at least twice in the array, 
 * and return false if every element is distinct
 * 
 * Example 1:

Input: nums = [1,2,3,1]
Output: true
 * 
 * 
 * Constraints:

1 <= nums.length <= 105
-10^9 <= nums[i] <= 10^9
 * 
 * 
 * */
public class Q217_ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
		System.out.println(containsDuplicate(nums));
	}

	/* 高手版本 */
	static boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1])
				return true;
		}
		return false;
	}

	/* Runtime: 4 ms by self */
//	static boolean containsDuplicate(int[] nums) {
//		int count = 1;
//		int preNum = 0;
//		int nextNum = 0;
//		
//		boolean result = false;
//		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//		
//		Arrays.sort(nums);
//		
//		for(int i = 0; i< nums.length; i++) {
//			preNum = nums[i];
//			if(i + 1 != nums.length) {
//				nextNum = nums[i +1];
//				
//				if(preNum == nextNum) {
//					count++;
//					map.put(preNum, count);
//				}
//				else {
//					count = 0;
//				}
//			}
//			else {
//				if(map.get(preNum)!= null) {
//					count++;
//					map.put(preNum, count);
//				}
//			}
//		}
//		
//		for(Integer key : map.keySet()) {
//			if(map.get(key) >=2)
//				result = true;
//		}
//		
//		return result;
//	}

	/* Time Limit Exceeded */
//	static boolean containsDuplicate(int[] nums) {
//		boolean result = false;
//		int count = 0;
//		Set<Integer> set = new TreeSet<Integer>();
//		
//		Arrays.sort(nums);
//		for(int i = 0; i < nums.length; i++) {
//			set.add(nums[i]);
//		}
//		
//		
//		Iterator<Integer> it = set.iterator();
//		while(it.hasNext() && !result) {
//			int itNums = it.next();
//			for(int i = 0; i < nums.length; i++) {
//				if( itNums == nums[i]) {
//					count++;
//				}
//				else {
//					count = 0; 
//				}
//				
//				if(count >= 2) {
//					result = true;
//					break;
//				}
//			}
//		}
//		
//		return result;
//	}
}
