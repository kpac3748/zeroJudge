package leetCode_easy;

public class Q191_NumberOf_1_Bits {

	public static void main(String[] args) {
		System.out.println(hammingWeight(11));
	}
	
	 public static int hammingWeight(int n) {
		 
		 String input = Integer.toBinaryString(n);
		 int count = 0;
		 
		 for(int i = 0; i < input.length(); i++) {
			 if(input.substring(i, i+1).equals("1")) {
				 count++;
			 }
		 }
		 
		 return count;
	}
}
