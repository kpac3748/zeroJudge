package leetCode_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * */


public class Q14_LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs = {"c","acc","ccc"};
		System.out.println(longestCommonPrefix(strs));
	}
	
    static String longestCommonPrefix(String[] strs) {
        String result = "";
        
        if(strs.length == 1) {
        	return strs[0];
        }
        else if (strs.length == 0) {
        	return "";
        }
        
        /*建立字串們長度的陣列*/
        int[] lengthArray = new int[strs.length];
        for(int i = 0 ; i < strs.length; i++) {
        	lengthArray[i] = strs[i].length();
        }
        
        int minLength = Arrays.stream(lengthArray).min().getAsInt();
        
        
        String firstString = strs[0];
        String[] firstArray = new String[minLength];
        int j = 0;
        
        for(int i = minLength; i > 0 ; i--) {
        	firstArray[j] = firstString.substring(0,i);
        	j++;
        }
        
        for(int k = 0 ; k < firstArray.length; k++) {
	        for(int i = 1; i < strs.length; i++) {
        		if(firstArray[k].equals(strs[i].substring(0, minLength-k))) {
	        		if(i == strs.length -1) {
	        			return firstArray[k];
	        		}
	        		continue;
	        	}
        		else {
        			break;
        		}
	        }
        }
        
    	
        return result;
    }
}
