package fun;

/*最大公因數*/
public class HCF {

	public static void main(String[] args) {
		System.out.printf("GCD of (100, 4) = %d", gcd(100, 4));
		System.out.println();
		System.out.println("============");
		System.out.printf("LCM of (100, 4) = %d", lcm(100, 4));

	}
	
	/*最大公因數*/
	public static int gcd(int m, int n) {
		return n==0 ? m : gcd(n, m%n);
	}
	
	/*最小公倍數*/
	public static int lcm(int m, int n) {
		return m * n / gcd(m, n);
	}

}
