package basic;

import java.util.Scanner;

import jdk.internal.org.objectweb.asm.util.CheckAnnotationAdapter;


/*2019-09-15
 * 實做成功，不過重複的地方改成方法比較好看。
 * 
 * 
 * */
public class A020 {

	public static void main(String[] args) {
		//拿到使用者輸入的身分證
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入身分證字號");
		String input = sc.nextLine();
		
		//宣告變數
		int j = 8;
		int result = 0;
		int check = 0;
		int localNum = 0;
		
		//拿到英文字母換算成數字的總和
		localNum = CheackId(input);
		
		//對身分證後8碼進行計算
		for (int i = 1; i < input.length() - 1; i++) {
			check = Integer.valueOf(input.substring(i, i + 1)) * j;
			result += Integer.valueOf(input.substring(i, i + 1)) * j;

			j--;
		}
		
		//加入最後一碼和英文代碼的合
		result += Integer.valueOf(input.substring(9, 10));
		result += localNum;
		
		//判斷身份證是否正確
		if (result % 10 == 0) {
			System.out.println("身分證字號正確!!");
		} else {
			System.out.println("身分證字號不正確!!");
		}

	}
	
	static int CheackId(String input) {
		int result = 0;
		String location;
		
		switch (input.substring(0, 1)) {
		case "A":
			location = "10";
			result = Integer.valueOf(location.substring(0, 1)) + Integer.valueOf(location.substring(1, 2)) * 9;
			return result;
		case "B":
			location = "11";
			result = Integer.valueOf(location.substring(0, 1)) + Integer.valueOf(location.substring(1, 2)) * 9;
			return result;
		case "C":
			location = "12";
			result = Integer.valueOf(location.substring(0, 1)) + Integer.valueOf(location.substring(1, 2)) * 9;
			return result;
		case "D":
			location = "13";
			result = Integer.valueOf(location.substring(0, 1)) + Integer.valueOf(location.substring(1, 2)) * 9;
			return result;
		case "E":
			location = "14";
			result = Integer.valueOf(location.substring(0, 1)) + Integer.valueOf(location.substring(1, 2)) * 9;
			return result;
		case "F":
			location = "15";
			result = Integer.valueOf(location.substring(0, 1)) + Integer.valueOf(location.substring(1, 2)) * 9;
			return result;
		case "G":
			location = "16";
			result = Integer.valueOf(location.substring(0, 1)) + Integer.valueOf(location.substring(1, 2)) * 9;
			return result;
		case "H":
			location = "17";
			result = Integer.valueOf(location.substring(0, 1)) + Integer.valueOf(location.substring(1, 2)) * 9;
			return result;
		case "I":
			location = "34";
			result = Integer.valueOf(location.substring(0, 1)) + Integer.valueOf(location.substring(1, 2)) * 9;
			return result;
		case "J":
			location = "18";
			result = Integer.valueOf(location.substring(0, 1)) + Integer.valueOf(location.substring(1, 2)) * 9;
			return result;
		case "K":
			location = "19";
			result = Integer.valueOf(location.substring(0, 1)) + Integer.valueOf(location.substring(1, 2)) * 9;
			return result;
		case "L":
			location = "20";
			result = Integer.valueOf(location.substring(0, 1)) + Integer.valueOf(location.substring(1, 2)) * 9;
			return result;
		case "M":
			location = "21";
			result = Integer.valueOf(location.substring(0, 1)) + Integer.valueOf(location.substring(1, 2)) * 9;
			return result;
		case "N":
			location = "22";
			result = Integer.valueOf(location.substring(0, 1)) + Integer.valueOf(location.substring(1, 2)) * 9;
			return result;
		case "O":
			location = "35";
			result = Integer.valueOf(location.substring(0, 1)) + Integer.valueOf(location.substring(1, 2)) * 9;
			return result;
		case "p":
			location = "23";
			result = Integer.valueOf(location.substring(0, 1)) + Integer.valueOf(location.substring(1, 2)) * 9;
			return result;
		case "Q":
			location = "24";
			result = Integer.valueOf(location.substring(0, 1)) + Integer.valueOf(location.substring(1, 2)) * 9;
			return result;
		case "R":
			location = "25";
			result = Integer.valueOf(location.substring(0, 1)) + Integer.valueOf(location.substring(1, 2)) * 9;
			return result;
		case "S":
			location = "26";
			result = Integer.valueOf(location.substring(0, 1)) + Integer.valueOf(location.substring(1, 2)) * 9;
			return result;
		case "T":
			location = "27";
			result = Integer.valueOf(location.substring(0, 1)) + Integer.valueOf(location.substring(1, 2)) * 9;
			return result;
		case "U":
			location = "28";
			result = Integer.valueOf(location.substring(0, 1)) + Integer.valueOf(location.substring(1, 2)) * 9;
			return result;
		case "V":
			location = "29";
			result = Integer.valueOf(location.substring(0, 1)) + Integer.valueOf(location.substring(1, 2)) * 9;
			return result;
		case "W":
			location = "32";
			result = Integer.valueOf(location.substring(0, 1)) + Integer.valueOf(location.substring(1, 2)) * 9;
			return result;
		case "X":
			location = "30";
			result = Integer.valueOf(location.substring(0, 1)) + Integer.valueOf(location.substring(1, 2)) * 9;
			return result;
		case "Y":
			location = "31";
			result = Integer.valueOf(location.substring(0, 1)) + Integer.valueOf(location.substring(1, 2)) * 9;
			return result;
		case "Z":
			location = "33";
			result = Integer.valueOf(location.substring(0, 1)) + Integer.valueOf(location.substring(1, 2)) * 9;
			return result;
		}
		
		return result;
	}

}
