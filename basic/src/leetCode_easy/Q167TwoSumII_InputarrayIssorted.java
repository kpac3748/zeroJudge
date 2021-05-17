package leetCode_easy;


/*
 * 
 * Given an array of integers numbers that is already sorted in ascending order,
 *  find two numbers such that they add up to a specific target number.

Return the indices of the two numbers (1-indexed) as an integer array answer of size 2,
 where 1 <= answer[0] < answer[1] <= numbers.length.

You may assume that each input would have exactly one solution and you may not use the same element twice.


Example 1:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
Example 2:

Input: numbers = [2,3,4], target = 6
Output: [1,3]
Example 3:

Input: numbers = [-1,0], target = -1
Output: [1,2]
 * 
 * */
public class Q167TwoSumII_InputarrayIssorted {

	public static void main(String[] args) {
//		int[] xxx = {2,7,11,15};
//		int[] yyy = {2,3,4};
//		int[] zzz = {-1,0};
		int[] temp = {0,0, 3, 4};
		
		int target = 0;
		
		int[] qqq = twoSum(temp, target);
		for(int i = 0; i < qqq.length; i++) {
			System.out.println(qqq[i]);
		}
	}
	
	public static int[] twoSum(int[] numbers, int target) {
		int[] result = new int[2];
		int[] tempPostive = new int[numbers.length];
		int[] tempNegtive = new int[numbers.length];
		
		for(int i = 0; i < numbers.length; i++) {
			if(target >= 0 && numbers[i] >= 0) {
				tempPostive[i] = target - numbers[i];
				System.out.print(tempPostive[i] + "、");
			}
			
			if(target <= 0 && numbers[i] <= 0) {
				tempNegtive[i] = target - numbers[i];
			}
		}
		
		System.out.println("==================");
		
		/*處理0~1000*/
		for(int i = 0; i < tempPostive.length; i++) {
			if(tempPostive[i] >= 0) {
					System.out.println("QOO = " + tempPostive[i]);
				for(int j = 0; j < numbers.length; j++) {
					System.out.println("zOO = " + numbers[j]);
					if(tempPostive[i] == numbers[j]) {
						System.out.println("rOO = " + numbers[j]);
						result[0] = i + 1;
						result[1] = j + 1;
						System.out.println("result = " + result);
						return result;
					}
				}
			}
		}
		
		/*處理-1000~0*/
		for(int i = 0; i < tempNegtive.length; i++) {
			if(tempNegtive[i] <= 0) {
				for(int j = 0; j < numbers.length; j++) {
					if(tempPostive[i] == numbers[j]) {
						result[0] = i + 1;
						result[1] = j + 1;
						break;
					}
				}
				if(result[0] >0 && result[1] > result[0] )
					break;
			}
		}
		
		
        return result;
    }

}
