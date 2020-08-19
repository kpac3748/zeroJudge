package leetCode_easy;

/*
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', 
 * return the length of last word (last word means the last appearing word if we loop from left to right) in the string.
 * If the last word does not exist, return 0.
 * Note: A word is defined as a maximal substring consisting of non-space characters only.
 * 
 * Input: "Hello World"
 * Output: 5
 * */
public class Q58_LengthOfLastWord {

	public static void main(String[] args) {
		String s = "a"; 
		System.out.println(lengthOfLastWord(s));
	}
	
	static int lengthOfLastWord(String s) {
		int index = 0;
		
		String trimStr = s.trim();
		
		if(trimStr.length() == 0 ) {
			return 0;
		}
		
		for(int i = 0; i < trimStr.length(); i++) {
			if(trimStr.charAt(i) == ' ') {
				index = i;
			}
		}
		
		if(index != 0) {
			return trimStr.substring(index+1, trimStr.length()).length();
		}
		
		return trimStr.length();
    }
}
