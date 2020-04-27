package leetCode_easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * Given a string containing just the characters 
 * '(', ')', '{', '}', '[' and ']', 
 * determine if the input string is valid.
 * 
 * */

public class Q20_ValidParentheses {
	public static void main(String[] args) {
		System.out.println(isValid("[({(())}[()])]"));
	}
	
	static boolean isValid(String s) {
        boolean result = false;
        
        Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0; i < s.length(); i++) {
        	
        	char subString = s.charAt(i);
        	
        	if('{' == subString || '(' == subString || '[' == subString) {
        		
        		stack.push(subString);
        	}
        	else {
        		if(stack.size() == 0 ) {
        			return result;
        		}
        		else {
        			if('}' == subString) {
        				char popChar = stack.pop();
        				if('{' != popChar) {
        					return result;
        				}
        			}
        			else if(')' == subString) {
        				char popChar = stack.pop();
        				if('(' != popChar) {
        					return result;
        				}
        			}
        			else if(']' == subString) {
        				char popChar = stack.pop();
        				if('[' != popChar) {
        					return result;
        				}
        			}
        		}
        	}
        }
        
        if(stack.size() == 0) {
        	result = true;
        }
        
        
        return result;
    }
	
}
