package basic;

import java.util.Scanner;

public class A010 {

	public static void main(String[] args) {
		/*各位在國小時都學過因數分解，都瞭解怎麼樣用紙筆計算出結果，現在由你來敎電腦做因數分解。

		因數分解就是把一個數字，切分為數個質數的乘積，如 12=2^2 * 3

		其中, 次方的符號以 ^ 來表示
		
		一個整數, 大於1 且 小於等於 1000000
		*/
		System.out.println("請輸入");
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		int dealInput = (int)Math.pow(input, 0.5);
		
		StringBuilder sb = new StringBuilder();
		
		boolean isFirstVal = false;
		
		int val = 2;
		
		int count = 1;
		
		if(dealInput % 2 ==0 || dealInput % 3 ==0) {
			sb.append("2^");
			while(dealInput != 1) {
				if(dealInput % val == 0) {
					dealInput = dealInput / val;
					count++;
				}else {
					if(val == 2) {
						sb.append(count);
						val++;
					}else {
						sb.append("*").append(val).append("^").append(count);
						val++;
					}
				}
			}
			System.out.println(sb);
			
		}else {
			
		}
		
		
		
		
		
		
		
		
	}

}
