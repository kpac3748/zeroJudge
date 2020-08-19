package fun;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoLRandom {

	public static void main(String[] args) {

		List<String> lolMap = new ArrayList<String>();

		lolMap.add("LuLu");
		lolMap.add("Van");
		lolMap.add("Ivly");
		lolMap.add("LeeShin");
		lolMap.add("Caterin");

		Scanner sc = new Scanner(System.in);
		
		while(!sc.next().equals("0")) {
			int randNum = (int) (Math.random() * lolMap.size());
			if (lolMap.get(randNum) != null) {
				System.out.println(lolMap.get(randNum));
				lolMap.remove(randNum);
			}
			
			if(lolMap.size() == 0) {
				break;
			}
		}

	}

}
