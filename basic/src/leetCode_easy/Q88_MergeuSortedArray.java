package leetCode_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
 * Given two sorted integer arrays nums1 and nums2, 
 * merge nums2 into nums1 as one sorted array.
 * Note:
 * The number of elements initialized in nums1 and nums2 
 * are m and n respectively.
 * You may assume that nums1 
 * has enough space (size that is equal to m + n) 
 * to hold additional elements from nums2.
 * 
 * Example:
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * Output: [1,2,2,3,5,6]
 * 
 * Constraints:
 * -10^9 <= nums1[i], nums2[i] <= 10^9
 * nums1.length == m + n
 * nums2.length == n
 * 
 * */
public class Q88_MergeuSortedArray {

	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		System.out.println(merge(nums1, 3, nums2, 3));
	}
	
	static int[] merge(int[] nums1, int m, int[] nums2, int n) {
		
		List<Integer> lstNum1 = new ArrayList<Integer>();
		
		for(int i = 0; i < m; i++) {
			lstNum1.add(nums1[i]);
		}
		
		for(int i = 0; i < n; i++) {
			lstNum1.add(nums2[i]);
		}
		
		IntComparator intComparator = new IntComparator();
		
		lstNum1.sort(intComparator);
		
		for(int i = 0; i < lstNum1.size(); i++) {
			nums1[i] = lstNum1.get(i);
		}
		
        return nums1;
    }
	
	static class IntComparator implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			
			if(o1 < o2) {
				return -1;
			}
			else if(o1 > o2) {
				return 1;
			}
			
			return 0;
		}
	}

}
