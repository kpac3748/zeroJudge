package leetCode_easy;

import java.util.HashMap;
import java.util.Map;

public class Q219_ContainsDuplicateII {

	public static void main(String[] args) {
		int k = 2;
		int[] nums = {1,2,3,1,2,3};
		
		System.out.println(containsNearbyDuplicate(nums, k));
	}
	
	static boolean containsNearbyDuplicate(int[] nums, int k) {
		boolean result = false;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i< nums.length; i++) {
			if(map.get(nums[i]) != null) {
				int indexDiff = Math.abs(map.get(nums[i]) - i);
				if(indexDiff <= k) {
					result = true;
					break;
				}
				else {
					map.put(nums[i], i);
				}
			}
			else {
				map.put(nums[i], i);
			}
		}
		
		return result;
    }

}
