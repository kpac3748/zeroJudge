package leetCode_easy;

import java.util.ArrayList;
import java.util.List;

public class Q27_RemoveElement {

	/*
	 * Given nums = [3,2,2,3], val = 3, Your function should return length = 2, with
	 * the first two elements of nums being 2. It doesn't matter what you leave
	 * beyond the returned length.
	 * 
	 */
	public static void main(String[] args) {
		int[] nums =  {3,2,2,3};
//		int[] nums =  {0,1,2,2,3,0,4,2};
		int val = 3;
//		int val = 2;
		
		System.out.println(removeElement(nums, val));
	}

	static int removeElement(int[] nums, int val) {
		int result = 0;
		List<Integer> lst = new ArrayList<Integer>();
		if(nums.length == 0) {
			return result;
		}
		
		for(int i = 0; i < nums.length; i++) {
			int num = nums[i];
			
			if(Integer.compare(num, val) == 0) {
				result++;
			}
			else {
				lst.add(num);
			}
		}
		
		for(int i = 0; i < lst.size(); i++) {
			nums[i] = lst.get(i);
		}
		
		result = nums.length - result;
		
		return result;
	}

}
