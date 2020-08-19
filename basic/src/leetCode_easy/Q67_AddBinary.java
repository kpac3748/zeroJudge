package leetCode_easy;

import java.math.BigInteger;

/*
 * Given two binary strings, return their sum (also a binary string).
 * The input strings are both non-empty and contains only characters 1 or 0.
 * 
 * 
 * Example 1:
 * Input: a = "11", b = "1"
 * Output: "100"
 * */
public class Q67_AddBinary {

	public static void main(String[] args) {
		String a = "11";
		String b = "1";
		System.out.println(addBinary(a, b));
	}
	
	static String addBinary(String a, String b) {
		BigInteger intA = new BigInteger(a,2);
		BigInteger intB = new BigInteger(b,2);
		BigInteger intC = intA.add(intB);
		
        return new BigInteger(String.valueOf(intC),10).toString(2);
    }

}
