package leetCode_easy;

public class Q7_reverse {

	public static void main(String[] args) {
		int x = 943;
		System.out.println(reverse(x));
	}
	
	static int reverse(int x) {
		String input = "";
		String output = "";
		if(x < 0) {
			input = Integer.toString(x).substring(1);
			output = "-";
		}
		else {
			input = Integer.toString(x);
		}
		
		char[] caculate = input.toCharArray();
		int result = 0;
		
		for(int i = caculate.length - 1 ; i > -1 ; i--) {
			output += caculate[i];
		}
		
		if(Long.parseLong(output) >= Integer.MIN_VALUE && Long.parseLong(output) <= Integer.MAX_VALUE) {
			result = Integer.parseInt(output);
		}
		
		return result;
	}
}
