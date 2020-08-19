package fun;

public class TestWhile {

	public static void main(String[] args) {
//		int count = 1;
		int sum = 0 ;
//		while(count <= 10) {
//			System.out.println("Start = " + count);
//			
//			sum += count;
//			System.out.println("+= " + count);
//			count++;
//			System.out.println("count ++" + count);
//		}
		
		for(int count = 1; count < 10 ; count++) {
			System.out.println("Start = " + count);
			sum += count;
			System.out.println("+= " + count);
		}
		
//		int x = 3;
//		
//		if( x++ == 3 && x == 4 ) {
//			System.out.println("ok");
//		}
//		else {
//			System.out.println("NG");
//		}
		
		
//		System.out.println( ++x == 3);

	}

}
