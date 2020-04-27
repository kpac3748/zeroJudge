package fun;

import java.util.Scanner;

public class Regx {
	static public Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("請輸入");
		while(sc.hasNext()) {
			String input2 = sc.nextLine();
			
			if(input2.matches("^\\w{1,3}$")) {
				System.out.println("ok");
				System.out.println("請輸入");
				continue;
			}
			else {
				System.out.println("NG");
				System.out.println("請輸入");
				continue;
			}
		}
		
		sc.close();

	}

}
