package leetCode_easy;

import java.util.HashMap;
import java.util.Map;

/*

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer. 
Input is guaranteed to be within the range from 1 to 3999.

*/

public class Q13_RomanToInteger {

	public static void main(String[] args) {
		System.out.println(romanToInt("MMMCC"));
	}
	
	static int romanToInt(String s) {
		int result = 0;
		
		Map<Character, Integer> dictionary = new HashMap<Character, Integer>();
		
		dictionary.put('I', 1);
		dictionary.put('V', 5);
		dictionary.put('X', 10);
		dictionary.put('L', 50);
		dictionary.put('C', 100);
		dictionary.put('D', 500);
		dictionary.put('M', 1000);
		System.out.println("111111111 = " + dictionary.get('A'));
		
		int count = 1;
		
		char[] input = s.toCharArray();
		
		if(1 == input.length) {
			
		}
		
		int num = 0; //input對應的數值
		int calNum = 0;	//比對用的變數
		for(int i = 0; i < input.length; i++) {
			char a = input[i];
			num = dictionary.get(a);
			
			//如果是最後一個字元
			if(i + count == input.length) {
				calNum += num;
				break;
			}
			
			
			//如果取出的字元和後面的一樣，count相加。			
			if(a == input[i + count]) {
				calNum += num;
			}
		}
		
		
		result = calNum;
		/*
		 *  1 = I
		 *  3 = III
		 *  3999 = MMMCMXCIX
		 * 
		 * 不一樣
		 * IV
		 * IX
		 * 
		 * **/
		
		
		return result;
    }
}
