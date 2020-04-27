package basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class A054 {

	public static void main(String[] args) {
		
		//拿到有各縣市英文字母與數字的list
		List<String> cityList = (ArrayList<String>)cityID();
		
		//請使用者輸入
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入身分證後9碼");
		String input = sc.nextLine();
		
		//檢查碼
		int result = 0;
		
		//身份證1~8碼數字計算
		for (int i = 0; i < input.length() - 1; i++) {
			//依序取得1~8碼數字
			int calNum = Integer.parseInt(input.substring(i, i + 1));
			
			//對取得的數字做對應的計算，並將結果儲存至result
			result += calNum * (input.length() - 1 - i);
		}
		
		//身份證第9碼，也是檢查碼
		int lastNum = Integer.parseInt(input.substring(8));
		
		//依公式求出縣市對應的字母
		int differ = 10 - lastNum;
		for(int i=0; i<cityList.size(); i++) {
			//縣市對應的數字十位數
			if ((Integer.parseInt(cityList.get(i).substring(0, 1))
					//縣市對應的數字各位數乘以9
					+ Integer.parseInt(cityList.get(i).substring(1, 2)) * 9
					+ result) % 10 == differ) {
				/*研究ASCII
				 * 'A'是固定的，i從0開始加
				 * 	所以B會等於'A' + 1，以此類推。
				 * 
				 * 	經過if已經拿到篩選後的i，問題在於如何將i轉成對應的字母
				 * 
				 * */
				System.out.print((char)(i+'A'));
				
				/*
				 * 
				 * 原本寫法，雖然用swich case，但是雙重回圈效能一定不好。
				 * 
				 * */
//				switch(i) {
//				case 0 :
//					System.out.print("A");
//					break;
//				case 1 :
//					System.out.print("B");
//					break;
//				case 2 :
//					System.out.print("C");
//					break;
//				case 3 :
//					System.out.print("D");
//					break;
//				case 4 :
//					System.out.print("E");
//					break;
//				case 5 :
//					System.out.print("F");
//					break;
//				case 6 :
//					System.out.print("G");
//					break;
//				case 7 :
//					System.out.print("H");
//					break;
//				case 8 :
//					System.out.print("I");
//					break;
//				case 9 :
//					System.out.print("J");
//					break;
//				case 10 :
//					System.out.print("K");
//					break;
//				case 11 :
//					System.out.print("L");
//					break;
//				case 12 :
//					System.out.print("M");
//					break;
//				case 13 :
//					System.out.print("N");
//					break;
//				case 14 :
//					System.out.print("O");
//					break;
//				case 15 :
//					System.out.print("P");
//					break;
//				case 16 :
//					System.out.print("Q");
//					break;
//				case 17 :
//					System.out.print("R");
//					break;
//				case 18 :
//					System.out.print("S");
//					break;
//				case 19 :
//					System.out.print("T");
//					break;
//				case 20 :
//					System.out.print("U");
//					break;
//				case 21 :
//					System.out.print("V");
//					break;
//				case 22 :
//					System.out.print("W");
//					break;
//				case 23 :
//					System.out.print("X");
//					break;
//				case 24 :
//					System.out.print("Y");
//					break;
//				case 25 :
//					System.out.print("Z");
//					break;
//				}
				
	
			}
		}

//		System.out.println(result);

	}
	
	private static List<String> cityID() {
		List<String> result = new ArrayList<String>();
		result.add("10");
		result.add("11");
		result.add("12");
		result.add("13");
		result.add("14");
		result.add("15");
		result.add("16");
		result.add("17");
		result.add("34");
		result.add("18");
		result.add("19");
		result.add("20");
		result.add("21");
		result.add("22");
		result.add("35");
		result.add("23");
		result.add("24");
		result.add("25");
		result.add("26");
		result.add("27");
		result.add("28");
		result.add("29");
		result.add("32");
		result.add("30");
		result.add("31");
		result.add("33");
		return result;
	}

//	備份電話記錄
//	result.put("A", "10");
//	result.put("B", "11");
//	result.put("C", "12");
//	result.put("D", "13");
//	result.put("E", "14");
//	result.put("F", "15");
//	result.put("G", "16");
//	result.put("H", "17");
//	result.put("I", "34");
//	result.put("J", "18");
//	result.put("K", "19");
//	result.put("L", "20");
//	result.put("M", "21");
//	result.put("N", "22");
//	result.put("O", "35");
//	result.put("P", "23");
//	result.put("Q", "24");
//	result.put("R", "25");
//	result.put("S", "26");
//	result.put("T", "27");
//	result.put("U", "28");
//	result.put("V", "29");
//	result.put("W", "32");
//	result.put("X", "30");
//	result.put("Y", "31");
//	result.put("Z", "33");
	
}
