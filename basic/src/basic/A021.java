package basic;

import java.util.Scanner;

/*
 * 未完成
 * */
public class A021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("請輸入兩正整數");
		long inputFirst = sc.nextLong();
		long inputSec = sc2.nextLong();
		
		long resultAdd = inputFirst + inputSec; 
		long resultMin = inputFirst - inputSec; 
		long resultMul = inputFirst * inputSec; 
		long resultDiv = inputFirst / inputSec;
		
		System.out.println("resultAdd = " + resultAdd);
		System.out.println("resultMin = " + resultMin);
		System.out.println("resultMul = " + resultMul);
		System.out.println("resultDiv = " + resultDiv);
		
		
		
	}

}
