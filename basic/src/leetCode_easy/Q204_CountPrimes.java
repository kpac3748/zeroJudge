package leetCode_easy;

/*
 * 
 * Count the number of prime numbers 
 * less than a non-negative number, n.
 * 
 * */

public class Q204_CountPrimes {

	public static void main(String[] args) {
		
		double xxx = 4.1;
		int yyy = 3;
		
		System.out.println((int)xxx == yyy);
		
//		System.out.println(countPrimes(10000));
	}
	
	public static int countPrimes(int n) {
		
		int count = 0;
		int num = 1;
		for(int i = 0; i< n -1 ; i++) {
			
			if(num < 2) {
				num++;
				continue;
			}
			
			if(num <= 3) 
				count++;
			else if(num / 10 == 0 &&
						num % num == 0 && num % 2 != 0 &&
							num % num == 0 && num % 3 != 0 ) {
				count++;
			}
			else if(num / 10 == 1 &&
						num % num == 0 && num % 2 != 0 &&
							num % num == 0 && num % 3 != 0 &&
								num % num == 0 && num % 5 != 0 &&
									num % num == 0 && num % 7 != 0) {
				count++;
			}
			else if(num / 100 >= 1 &&
						(num % num == 0 && num % 2 != 0 &&
							num % num == 0 && num % 3 != 0 &&
								num % num == 0 && num % 5 != 0 &&
									num % num == 0 && num % 7 != 0) 
										) {
				
				if(Math.pow( num , 0.5 ) == 0.0) {
					
					System.out.println(num);
					System.out.println("================");
					
					continue;
				}
				
				
				
				if(Math.pow( num , 1/3.0 ) == 0.0) {
					
					System.out.println(num);
					System.out.println("================");
					
					continue;
				}
				
				count++;
			}
			
			num++;
		}
		
		return count;
    }

}
