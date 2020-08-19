package leetCode_easy;

import java.math.BigInteger;

/*
 * Given a non-empty array of digits representing a non-negative integer, increment one to the integer.
 * The digits are stored such that the most significant digit is at the head of the list, 
 * and each element in the array contains a single digit.
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 * 
 * Example 1:
 * Input: [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * 
 * */
public class Q66_PlusOne {

	public static void main(String[] args) {
		int[] digits = {9,8,7,6,5,4,3,2,1,0};
		
		System.out.println(plusOne(digits));
	}
	
	static int[] plusOne(int[] digits) {
		int[] result = null;
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < digits.length; i++) {
			sb.append(digits[i]);
		}
		
		BigInteger intValue = new BigInteger(sb.toString());
		BigInteger one = new BigInteger("1");
		intValue = intValue.add(one);
		String strValue = String.valueOf(intValue);
		
		result = new int[strValue.length()];
		
		for(int i = 0; i < strValue.length(); i++) {
			result[i] = Integer.parseInt(strValue.substring(i, i+1));
		}
		
		return result;
	}
}
