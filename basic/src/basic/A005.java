package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A005 {

	public static void main(String[] args) {
//		��J�ƦC���ƥ�(0<=t<=20)
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		List<String> calNum = new ArrayList<String>();

		System.out.println("�п�J�ƦC���ƥ�t :");
		int t = scanner1.nextInt();
		while (!(t > 0 && t <= 20)) {
			System.out.println("�п�J���T���d��");
			t = scanner1.nextInt();
		}
		int i = 0;
		int k = 0;
		System.out.println("�п�J4�Ӿ��");

		while (i != t) {
			i++;
			calNum.add(scanner2.nextLine());
		}
		StringBuilder sb = new StringBuilder();
		for (k = 0; k < i; k++) {
			String calStr = calNum.get(k);
			String[] calNumArr = calStr.split(" ");
			int finalNum = 0;
			if (Integer.valueOf(calNumArr[1]) / Integer.valueOf(calNumArr[0]) == Integer.valueOf(calNumArr[3])
					/ Integer.valueOf(calNumArr[2])) {
				finalNum = Integer.valueOf(calNumArr[3]) / Integer.valueOf(calNumArr[2])
						* Integer.valueOf(calNumArr[3]);
			} else if (Integer.valueOf(calNumArr[1]) - Integer.valueOf(calNumArr[0]) == Integer.valueOf(calNumArr[3])
					- Integer.valueOf(calNumArr[2])) {
				finalNum = Integer.valueOf(calNumArr[3]) + Integer.valueOf(calNumArr[2])
						- Integer.valueOf(calNumArr[1]);
			}

			for (int j = 0; j < calNumArr.length; j++) {
				sb.append(calNumArr[j]).append(" ");
			}
			sb.append(finalNum + "\n");
		}
		System.out.println(sb);
//		�C��n��J4�Ӿ��

//		�Ʀr���i�j��1000000

//		�����t�ε���

//		�p�󭭨��J�X��?

	}

}
