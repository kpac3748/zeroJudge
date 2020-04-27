package basic;

import java.util.Scanner;


public class A009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		String str = sc.nextLine();
		String str2 = sc2.nextLine();

		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			int c = str.codePointAt(i);
			char charDecode = (char) (c - 7);
			sb.append(charDecode);
		}
		for (int i = 0; i < str2.length(); i++) {
			int c2 = str2.codePointAt(i);
			char charDecode2 = (char) (c2 - 7);
			sb2.append(charDecode2);
		}
		
		sc.close();
		sc2.close();
		
		System.out.println(sb);
		System.out.println(sb2);

	}

}
