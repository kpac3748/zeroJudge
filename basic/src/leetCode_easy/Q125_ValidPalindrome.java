package leetCode_easy;

import java.util.ArrayList;
import java.util.List;

public class Q125_ValidPalindrome {
/*
 * Given a string s, determine if it is a palindrome, 
 * considering only alphanumeric characters and ignoring cases.
 * 
Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
 * 
 * */
	
    private static final int[]intMap = new int[256];
    static{
        for(int i=0;i<10;i++){
            intMap[i+'0'] = 1+i;  // numeric
//            System.out.println("============================");
//            System.out.println("i+'0' = " + (i+'0'));
        }
        for(int i=0;i<26;i++){
            intMap[i+'a'] = intMap[i+'A'] = 11+i ;  //alphabetic, ignore cases
            
//            System.out.println("============================");
//            System.out.println("11+i = " + (11+i));
//            System.out.println("i+'A' = " + (i+'A'));
//            System.out.println("i+'a' = " + (i+'a'));
//            System.out.println("intMap[i+'A'] = 11+i = " + (intMap[i+'A'] = 11+i));
//            System.out.println("intMap[i+'a'] = intMap[i+'A'] = 11+i = " + (intMap[i+'a'] = intMap[i+'A'] = 11+i));
        }
        
        
    }
	
	public static void main(String[] args) {
		boolean result = isPalindrome("A man, a plan, a canal: Panama");
		System.out.println(result);
	}
	
	public static boolean isPalindrome(String s) {
		/*自己版本*/
//		boolean result = false;
//		StringBuilder sb = new StringBuilder();
//		
//		List<Integer> lst = new ArrayList<Integer>();
//		int bigLetter = 65;
//		int letter = 97;
//		int number = 48;
//		
//		for(int i = 0 ; i < 26 ; i++) {
//			lst.add(bigLetter);
//			lst.add(letter);
//			
//			bigLetter++;
//			letter++;
//		}
//		
//		for(int i = 0 ; i < 10 ; i++) {
//			lst.add(number);
//			
//			number++;
//		}
//		
//		for(int i =0; i< s.length(); i++) {
//			int temp = (int) s.charAt(i);
//			
//			if(lst.contains(temp)) {
//				char tempChar = (char)temp;
//				sb.append(tempChar);
//			}
//		}
//		
//		String replaceLetter = sb.toString().toLowerCase();
//		
//		sb = new StringBuilder();
//		for(int i = replaceLetter.length()-1 ; i >= 0; i--) {
//			sb.append(replaceLetter.substring(i, i+1));
//		}
//		
//		String reverLetter = sb.toString();
//		
//		if(replaceLetter.equals(reverLetter)) {
//			result = true;
//		}
//		
//		return result;
		
		/*高手版本*/
		  char[]pChars = s.toCharArray();
	        int start = 0,end=pChars.length-1;
	        int cS,cE;
	        while(start<end){
	            cS = intMap[pChars[start]];
	            System.out.println("pChars[start] = " + pChars[start]);
	            System.out.println("intMap[pChars[start]] = " + intMap[pChars[start]]);
	            
	            cE = intMap[pChars[end]];
	            if(cS!=0 && cE!=0){
	                if(cS!=cE)return false;
	                start++;
	                end--;
	            }else{
	                if(cS==0)start++;
	                if(cE==0)end--;
	            }
	        }
	        return true;
    }
	
}
