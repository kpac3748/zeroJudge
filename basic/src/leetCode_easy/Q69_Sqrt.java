package leetCode_easy;

/*
 * Implement int sqrt(int x).
 * Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
 * Since the return type is an integer, 
 * the decimal digits are truncated and only the integer part of the result is returned.
 * 
 * Example 1:
 * Input: 4
 * Output: 2
 * 
 * */
public class Q69_Sqrt {

	public static void main(String[] args) {
		int x = 8;
		
		System.out.println(mySqrt(x));
	}
	
	static int mySqrt(int x) {
        return (int) (Math.sqrt(x));
    }

}
