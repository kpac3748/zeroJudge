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

public class Q20_ValidParentheses_BetterVersion {
	private static final String BIG_LEFT_PARENTHESES = "{";
	private static final String BIG_RIGHT_PARENTHESES = "}";
	private static final String MID_LEFT_PARENTHESES = "[";
	private static final String MID_RIGHT_PARENTHESES = "]";
	private static final String SML_LEFT_PARENTHESES = "(";
	private static final String SML_RIGHT_PARENTHESES = ")";

	public static void main(String[] args) {
		System.out.println(isValid("[({(())}[()])]"));
	}
	
	static boolean isValid(String s) {
        boolean result = false;
        
        Stack<String> stack = new Stack<String>();
        List<String> listAll = new ArrayList<String>();
        List<Integer> listIndex = new ArrayList<Integer>();
        List<String> list = new ArrayList<String>();
        
        boolean isListIndexEmpty = false;
        
        /*處理字串為奇數時，表示沒有閉合*/
        if(s.length() % 2 != 0) {
        	return false;
        }
        
        subStringToList(s, listAll);
        
        while(!isListIndexEmpty) {
	        for(int i = 0 ; i < listAll.size(); i++) {
	    		if(i == listAll.size() -1) {
	    			break;
	    		}
	    		
	        	String fistElement = (String)listAll.get(i);
	        	String secElement = (String)listAll.get(i + 1);
	        	
	        	if(BIG_LEFT_PARENTHESES.equals(fistElement) ) {
	        		if(BIG_RIGHT_PARENTHESES.equals(secElement)) {
	        			listIndex.add(i);
	        			listIndex.add(i + 1);
	        		}
	    		}
	        	if(SML_LEFT_PARENTHESES.equals(fistElement) ) {
	        		if(SML_RIGHT_PARENTHESES.equals(secElement)) {
	        			listIndex.add(i);
	        			listIndex.add(i + 1);
	        		}
	        	}
	        	if(MID_LEFT_PARENTHESES.equals(fistElement) ) {
	        		if(MID_RIGHT_PARENTHESES.equals(secElement)) {
	        			listIndex.add(i);
	        			listIndex.add(i + 1);
	        		}
	        	}
	    	}
	        
	        if(listIndex.size() == 0) {
	        	isListIndexEmpty = true;
	        }
	        
	        /*Start 處理直接閉合的字串*/
	        for(int i = 0; i < listIndex.size(); i++) {
	        	listAll.set((int)listIndex.get(i), "");
	        }
	        
	        StringBuilder a = new StringBuilder();
	        for(int i = 0; i < listAll.size(); i++) {
	        	 a.append(listAll.get(i));
	        }
	        /*End*/
	        
	        /*過濾後的字串*/
	        String input = a.toString();
	        listAll.clear();
	        listIndex.clear();
	        subStringToList(input, listAll);
        }
        
        /*過濾後的字串在進行比對*/
        for(int i = 0 ; i < listAll.size(); i++) {
        	String element = listAll.get(i);
	        if(BIG_LEFT_PARENTHESES.equals(element) || SML_LEFT_PARENTHESES.equals(element) || MID_LEFT_PARENTHESES.equals(element)) {
	    		stack.add(element); /*依順序儲存左邊的括號*/
	    	}
	    	else {
	    		list.add(element); /*依順序儲存右邊的括號*/
	    	}
        } 
       
        for(int i =0; i <list.size(); i++) {
        	String popElement = (String)stack.pop();
        	String subElement = (String)list.get(i);
        	
        	compare(stack, subElement, popElement);
        }
        
        if(stack.size() == 0) {
        	return true;
        }
        
        return result;
    }
	
	static void compare(Stack<String> stack , String subElement, String popElement) {
		if(BIG_RIGHT_PARENTHESES.equals(subElement)) {
    		if(!BIG_LEFT_PARENTHESES.equals(popElement) ) {
    			stack.push(popElement);
    		}
		}
    	
    	if(SML_RIGHT_PARENTHESES.equals(subElement)) {
    		if(!SML_LEFT_PARENTHESES.equals(popElement) ) {
    			stack.push(popElement);
    		}
    	}
    	
    	if(MID_RIGHT_PARENTHESES.equals(subElement)) {
    		if(!MID_LEFT_PARENTHESES.equals(popElement) ) {
    			stack.push(popElement);
    		}
    	}
	}
	
	static void subStringToList(String input, List<String> listAll) {
		for(int i =0; i <input.length(); i++) {
        	String element = input.substring(i, i + 1);
        	
        	listAll.add(element);
        }
	}
}
