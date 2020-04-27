package basic;

import java.util.Scanner;

public class A022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入字串");
		
		String inputOri;
		StringBuilder inputCha = new StringBuilder();
		String result;
		while(sc.hasNextLine()) {
			inputOri = sc.nextLine();
			
			System.out.println(inputOri.length());
			int j =  inputOri.length();
			
			for(int i = j; i>0; i--) {
				inputCha.append(inputOri.substring(i-1, i));
			}
			
			System.out.println(inputCha);
			result = String.valueOf(inputCha);
			if(inputOri.equals(result)) {
				System.out.println("正確");
			}else {
				System.out.println("不相等");
			}
			
		}
	}

}
