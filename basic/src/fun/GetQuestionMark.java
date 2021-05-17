package fun;

import java.util.Scanner;

public class GetQuestionMark {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請問今天要幾個?號呢?");
		int num = sc.nextInt();
		System.out.println(String.format("收到，準備生產%s個問號", num));
		int i = 0;
		int j = 0;
		for( i = 0; i < num; i++) {
			for(j = 0 ; j < num; j++) {
				if(i == j ) {
					System.out.println("?");
					break;
				}
				else
					System.out.print(" ");
			}
			
		}
		sc.close();
	}

}
