package leetCode_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Q169_MajorityElement {

	public static void main(String[] args) {
		 int[] xxx = {3,2,3};
		 System.out.println(majorityElement(xxx));
	}
	
	public static int majorityElement(int[] nums) {
		int result = 0;
		
		Arrays.sort(nums);
		
		int mid = nums.length / 2 + 1;
		int count = 0;
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0 ; i < mid; i++) {
			System.out.println(nums[i]);
			int first = nums[i];
			int next = nums[i+1];
			
			if(first == next) {
				count++;
			}
			else {
				map.put(nums[i], count);
				count = 0;
			}
		}
		
		int length =map.size();
		
		System.out.println(map);
		
        Collection<Integer> c = map.values();
        Object[] obj = c.toArray();
        Arrays.sort(obj);
        
        int maxValue = (int) obj[length-1];
        
        System.out.println("dddd = " + maxValue);
        
        if(maxValue != 0) {
	        for(Integer key : map.keySet()) {
	        	if(map.get(key) == maxValue) {
	        		result = key;
	        		break;
	        	}
	        }
        }
        else {
        	for(int i = mid ; i < nums.length; i++) {
    			int first = nums[i];
    			int next = nums[i+1];
    			
    			if(first == next) {
    				count++;
    			}
    			else {
    				map.put(nums[i], count);
    				count = 0;
    			}
    		}
        	

    		length =map.size();
    		
            c = map.values();
            obj = c.toArray();
            Arrays.sort(obj);
            maxValue = (int) obj[length-1];
            
            for(Integer key : map.keySet()) {
	        	if(map.get(key) == maxValue) {
	        		result = key;
	        		break;
	        	}
	        }
        }
				
		return result;		
    }

}
