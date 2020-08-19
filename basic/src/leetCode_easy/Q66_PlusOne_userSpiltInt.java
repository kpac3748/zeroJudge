package leetCode_easy;

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
public class Q66_PlusOne_userSpiltInt {
/*does't finish*/
	public static void main(String[] args) {
		int[] digits = {9};
		
		System.out.println(plusOne(digits));
	}
	
	static int[] plusOne(int[] digits) {
		int[] result = null;
		long sum = 0;
		long oriTen = Math.round(Math.pow(10, digits.length-1));
		long ten = oriTen;
		
		for(int i = 0; i < digits.length; i++) {
			sum += digits[i] * ten;
			ten = ten / 10;
		}
		
		sum += 1;
		int newLength = 0;
		
		if(sum / oriTen != 0 ) {
			if(oriTen == 1 && sum / (oriTen *10) != 0 ) {
				newLength = digits.length + 1;
				result = new int[newLength];
			}
			else {
				newLength = digits.length;
				result = new int[newLength];
			}
		}
		else if (sum / (oriTen * 10)  != 0 ) {
			newLength = digits.length + 1;
			result = new int[digits.length + 1];
		}
		
		long resultTen = Math.round(Math.pow(10, newLength-1));
		
		for(int i = 0; i < newLength; i++) {
			result[i] =  (int) (sum / resultTen);
			sum -= sum / resultTen * resultTen;
			resultTen = resultTen / 10;
		}
		
		return result;
	}
}
