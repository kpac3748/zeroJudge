package leetCode_easy;

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
		
		
		
        return null;
    }
	
	static int recurtion(int num1Length, int[] midNum, int compareNum) {
		int newIndex = 0;
		
		while(num1Length % 2 > 1) {
			if(midNum[num1Length/2] > compareNum) {
				recurtion(num1Length, midNum, compareNum);
			}
			else if(midNum[num1Length/2] < compareNum) {
				
			}
			else {
				return num1Length/2;
			}
		}
		
		return 0;
	}

}
