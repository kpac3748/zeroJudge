package leetCode_easy;

/* Determine whether an integer is a palindrome. 
 * An integer is a palindrome when it reads the 
 * same backward as forward. */

public class Q9_PalindromeNumber {

	public static void main(String[] args) {
		Integer a = 0;
        
		
		System.out.println(isPalindrome(a));
	}
	
	static boolean isPalindrome(int x) {
        boolean result = false;
        String y = "";
        
        if(x >= 0) {
        	y = String.valueOf(x);
        	String z = "";
        	for(int i = y.length()-1; i >= 0; i--) {
        		z += y.charAt(i);
        	}
        	
        	if(y.equals(z)) {
        		result = true;
        	}
        }
        
        return result;
    }

}
