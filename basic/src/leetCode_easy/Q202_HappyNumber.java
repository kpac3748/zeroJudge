package leetCode_easy;

public class Q202_HappyNumber {

	public static void main(String[] args) {
		System.out.println(isHappy(4));
	}
	
	 public static boolean isHappy(int n) {
			 boolean result = false;
			 	
				 if( n == 1) {
					 result = true;
				 }
				 
				 if( n <= 3) {
					 return result;
				 }
				 
				 
			 while(n != 1) {
				 String str = String.valueOf(n);
				 int sum = 0;
				 int count = 0;
				 
				 System.out.println("n = " + n);
				 System.out.println("============");
				 
				 for(int i = 0 ; i < str.length(); i++) {
					 int temp = Integer.parseInt(str.substring(i, i+1));
					 temp = temp * temp;
					 sum += temp;
					 count++;
				 }
				 
				 n = sum;
				 
				 if(n == 1) {
					 result = true;
					 break;
				 }
				 else if(n / 10 == 0 && n % 10 > 0 && count < 3) {
					 break;
				 }
			 }
			 
			 return result;
	 }

}
