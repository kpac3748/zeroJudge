package leetCode_easy;


/*
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * 
 * 
 * Input: 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 * 
 * Constraints:
 *  * 1 <= n <= 45
 * 
 * */
public class Q70_ClimbingStairs {

	public static void main(String[] args) {
		int n = 6;
		
		System.out.println(climbStairs(n));
	}
	
	static int climbStairs(int n) {
        int result = 0;
        int count = 0;
        boolean isNInRange = 1 <= n && n <= 45;
        
        while(count < n && isNInRange) {
        	count++;
        	result = countStep(result, count);
        }
        
        return result;
    }
	
	static int countStep(int result, int count) {
		if(count == 1) {
			result += 1;
			return result;
		}
		if(count == 4) {
			result = 4;
		}
		
		if(count % 2 == 0) {
			result += 1;
		}
		else if(count % 2 != 0) {
			if(count == 3) {
				return 3;
			}
			result += (count - 1) / 2 + 1 ; 
			
		}
		
		return result;
	}

}
