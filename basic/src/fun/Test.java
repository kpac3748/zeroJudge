package fun;

public class Test {

	public static void main(String[] args) {
		
//		int a = 67%10;
//		int b = 65/100;
//		
//		System.out.println(a);
//		System.out.println(b);
//		
//		
//		String[] c = null;
//		System.out.println(c.length);
		
		int i = 0;
		int j = 0;
		
		for(i = 0 ; i <2 ; i++) {
			System.out.println("i = " + i + "; j = " + j);
			System.out.println("===========");
			for(j = i ; j < 3 ; j++) {
				System.out.println("i = " + i + "; j = " + j);
				System.out.println("************");
				break;
			}
		}
		
		System.out.println("i = " + i + "; j = " + j);
		System.out.println("+++++++++");
	}

}
