package leetCode_easy;

/*
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * Input: haystack = "hello", needle = "ll"
 * Output: 2 
 * */
public class Q28_ImplementStrStr {

	public static void main(String[] args) {
		String haystack = "a";
		String needle = "a";
		
		System.out.println(strStr(haystack, needle));

	}
	
	static int strStr(String haystack, String needle) {
        int result = -1;

        /*如果是空字串 回傳0*/
        if(needle.length() == 0) {
        	result = 0;
        	return result;
        }
        
        for(int i = 0 ; i < haystack.length(); i++) {
        	char oriChar = haystack.charAt(i);
        	
        	for(int j = 0 ; j <  needle.length(); j++) {
        		char compareChar = needle.charAt(j);
        		
        		if(oriChar == compareChar) {
        			if(haystack.length() > needle.length()) {
        				if(needle.length()+i > haystack.length()) {
        					return result;
        				}
        				String oriStr = haystack.substring(i, needle.length()+i);
        				if(oriStr.equals(needle)) {
        					result = i;
        					return result;
        				}
        			}
        			else if(haystack.length() < needle.length()) {
    					return result;
        			}
        			else {
        				if(haystack.equals(needle)) {
        					result = i;
        				}
        				return result;
        			}
        			
        			continue;
        		}
        	}
        	
        }
        
        return result;
    }

}
