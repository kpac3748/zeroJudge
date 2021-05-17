package leetCode_easy;

import java.math.BigDecimal;

public class Q172Factorial_TrailingZeroes {

	public static void main(String[] args) {
		System.out.println(trailingZeroes(1699));
	}
	
	public static int trailingZeroes(int n) {
		/*自己版本 但會timeout*/
		//		int result = 0;

		//		if(n == 0)
//			return result;
//		BigDecimal input = new BigDecimal(n); 
//		BigDecimal total = factorial(input);
//		BigDecimal ten = new BigDecimal(10); 
//		BigDecimal zero = new BigDecimal(0); 
//		
//		while(total.remainder(ten).compareTo(zero) == 0) {
//			result++;
//			total = total.divide(ten);
//		}
//		
//		return result;
		
		
		/*高手版本*/
		if(n < 5) return 0 ;

	    int count = 0;
	    // 算階層內有幾個5出現
	    while(n >= 5){
	        count += Math.floor(n/5);
	        
	        n = n/5;
	    }

	    return count;
    }
	
  public static BigDecimal  factorial(BigDecimal number) {
	  BigDecimal one = new BigDecimal(1);
      if (number.compareTo(one) == -1 || number.compareTo(one) == 0)
         return one;
      else
         return number.multiply(factorial(number.subtract(one)));
   }

}
