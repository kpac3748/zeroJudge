package basic;

import java.util.Scanner;

public class A053 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入答對題數");
		while (sc.hasNextInt()) {
			int input = sc.nextInt();
			int result = 0;

			if (input <= 10) {
				result += input * 6;
			}

			if (input > 10 && input <= 20) {
				result += (input - 10) * 2 + 60;
			}

			if (input > 20 && input <= 40) {
				result += (input - 20) * 1 + 80;
			}

			if (input > 40) {
				result = 100;
			}
			
			if(input == 999) {
				break;
			}

			System.out.println("分數為 = " + result + "分");
			System.out.println("請輸入答對題數或輸入999離開");
		}

	}

}
