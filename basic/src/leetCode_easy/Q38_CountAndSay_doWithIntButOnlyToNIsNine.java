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
public class Q38_CountAndSay_doWithIntButOnlyToNIsNine {

	public static void main(String[] args) {
		int n = 9;
		System.out.println(countAndSay(n));

	}
	
	static String countAndSay(int n) {
		int input = 1;
		int output = 1;
		int count = 0;
		
		List<Integer> lst = null;
		
		if(n == 1) {
			return String.valueOf(output);
		}
		
		while(count < n -1) {
			lst = splitInt(input);
			input = Integer.parseInt(readInput(lst));
			count++;
		}
		
		return String.valueOf(input);
    }
	
	
	static List<Integer> splitInt(int input) {
		List<Integer> result = new ArrayList<Integer>();
		
		int length = String.valueOf(input).length();
		int count = length -1;
		int sum = 0;
		
		for(int i = 0 ; i < length ; i++) {
			int divisor = (int)Math.round((Math.pow(10, count)));
			if(i == 0) {
				result.add((input / divisor));
			}
			else {
				result.add((input - sum)/divisor);
			}
			
			sum += divisor * result.get(i);
			count--;
		}
		
		return result;
	}
	
	static String readInput(List<Integer> input) {
		StringBuilder sb = new StringBuilder();
		int count = 1;
		
		for(int i = 0; i < input.size(); i++) {
			if(input.size() == 1 && input.get(0) == 1) {
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
