package leetCode_easy;

import java.util.ArrayList;
import java.util.List;

/*
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 * 
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 
 * */
public class Q38_CountAndSay {

	public static void main(String[] args) {
		int n = 9;
		System.out.println(countAndSay(n));

	}
	
	static String countAndSay(int n) {
		String input = "1";
		String output = "1";
		int count = 0;
		
		List<Character> lst = new ArrayList<Character>();
		StringBuilder sb = new StringBuilder();
		
		if(n == 1) {
			return String.valueOf(output);
		}
		
		while(count < n -1) {
			splitInt(lst, input);
			input = readInput(sb, lst);
			count++;
		}
		
		return String.valueOf(input);
    }
	
	
	static void splitInt(List<Character> lst, String input) {
		lst.clear();
		int length = input.length();
		for(int i = 0 ; i < length ; i++) {
			lst.add((input.charAt(i)));
		}
	}
	
	static String readInput(StringBuilder sb, List<Character> input) {
		sb.setLength(0);
		int count = 1;
		
		for(int i = 0; i < input.size(); i++) {
			if(input.size() == 1 && input.get(0) == '1') {
				return "11";
			}
			
			if(i == input.size() -1) {
				if(input.get(i-1) != input.get(i)) {
					count = 1;
				}
				sb.append(count).append(input.get(i));
				break;
			}
			else if(input.get(i) == input.get(i + 1)) {
				count++;
				continue;
			}
			
			if(count !=1) {
				sb.append(count).append(input.get(i));
				count = 1;
			}
			else {
				sb.append(count).append(input.get(i));
			}
		}
		
		return sb.toString();
	}
}
