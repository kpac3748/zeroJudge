package basic;

import java.util.Scanner;

public class A042 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入n個圓");
		int input = sc.nextInt();
		
		int result = input * (input - 1) + 2;
		System.out.println(input + " 個圓被分割成 " + result + " 個區域");
		
		sc.close();
		
		
	}

}
