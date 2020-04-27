package basic;

import java.util.Scanner;
import java.util.Stack;

/*
	範例輸入
	2 + 3 * 4
	2 * ( 3 + 4 ) * 5
	範例輸出
	14
	70
*/

public class A017 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

//		Scanner sc2 = new Scanner(System.in);
//		String input2 = sc2.nextLine();

		String[] inputArr = input.split(" ");
//		String[] inputArr2 = input2.split(" ");

		Stack calStack = new Stack();

		int count = 0;
		int result = 0;

		for (int i = 0; i < inputArr.length; i++) {

			calStack.push(inputArr[i]);

			count++;
		}

		String calNum1 = (String) calStack.pop();
		while (!calStack.empty()) {
			if (calStack.pop().equals("*")) {
				String calNum2 = (String) calStack.pop();
				result = Integer.valueOf(calNum1) * Integer.valueOf(calNum2);
			}
			
			if (calStack.pop().equals("+")) {
				String calNum2 = (String) calStack.pop();
				result = result + Integer.valueOf(calNum2);
			}
		}

		System.out.println(result);

	}

}
