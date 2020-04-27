package basic;

import java.util.Scanner;

/*
 	輸入說明
	第一行會有兩個數字，分別為 列(row)<100 和 行(column)<100，緊接著就是這個矩陣的內容
	
	2 3
	3 1 2
	8 5 4
	
	輸出說明
	直接輸出翻轉後的矩陣
	
	3 8
	1 5
	2 4
	
	------------
	目前只有做出簡單的Hard code
 
  */

public class A015 {

	public static void main(String[] args) {
		System.out.println("輸入陣列");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] inputArr;
		String[] inputArr2;
		
		Scanner sc2 = new Scanner(System.in);
		String input2 = sc2.nextLine();
		
		inputArr = input.split(" ");
		inputArr2 = input2.split(" ");
		
		for(int i = 0; i< inputArr.length; i++) {
			System.out.println(inputArr[i] + " " + inputArr2[i]);
		}
		

	}

}
