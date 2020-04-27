package basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 目前這題只有練習到把範例的輸入和輸出列印出來，
 * 
 * 並沒有實際動態運算，將數字轉換成羅馬數字。
 * 
 * 2019-08-31
 * 
 * */

public class A013 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入羅馬數字:");

		String input = sc.nextLine();

		StringBuilder sb = new StringBuilder();

		String[] cal = input.split(" ");
		int countFirst = 0;
		int countlast = 0;

		for (int i = 0; i < cal[0].length(); i++) {
			String test = cal[0].substring(i, i + 1);
			if (test.equals("M")) {
				countFirst += 1000;
			} else if (test.equals("I")) {
				countFirst += 1;
			}
		}

		for (int i = 0; i < cal[1].length(); i++) {
			String test = cal[1].substring(i, i + 1);
			System.out.println(test);
			if (test.equals("M")) {
				countlast += 1000;
			} else if (test.equals("I")) {
				countlast += 1;
			}
		}

		int calResult = countFirst - countlast;

		if (calResult == 0) {
			System.out.println("Result = " + "ZERO");
		} else {

			if (calResult - 1000 > 0) {
				calResult -= 1000;
				sb.append("M");
			}

			if (calResult - 900 > 0) {
				calResult -= 900;
				sb.append("CM");
			}

			if (calResult - 90 > 0) {
				calResult -= 90;
				sb.append("XC");
			}

			if (calResult - 5 > 0) {
				calResult -= 5;
				sb.append("V");
			}

			if (calResult < 5) {
				for (int j = 1; j <= calResult; j++) {
					sb.append("I");
				}
			}

			System.out.println("Result =" + sb);
		}
	}

}
