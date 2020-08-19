package leetCode_easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Q26_RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		int[] nums = {0,1,2,2};
		System.out.println(nums.length);
		System.out.println(removeDuplicates(nums));
	}
	
	static int removeDuplicates(int[] nums) {
		System.out.println(nums);
        Set<Integer> set = new HashSet<Integer>();
        List<Integer> lst = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++) {
        	set.add(nums[i]);
        }
        
        for(Iterator<Integer> it = set.iterator(); it.hasNext();) {
        	lst.add(it.next());
        }
        
        Collections.sort(lst,
                new Comparator<Integer>() {
                    public int compare(Integer o1, Integer o2) {
                        return o1 - o2 ;
                    }
                });
        
        int count = 0;
        for(int i = 0 ;  i < lst.size(); i++) {
        	nums[i] = lst.get(i);
        	count++;
        }
        
        return count; 
    }

}
