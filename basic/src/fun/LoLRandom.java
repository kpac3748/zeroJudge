package fun;

import java.util.HashMap;
import java.util.Map;

public class LoLRandom {

	public static void main(String[] args) {

		Map lolMap = new HashMap();

		lolMap.put(1, "露露");
		lolMap.put(2, "雷格爾");
		lolMap.put(3, "冰鳥");
		lolMap.put(4, "雷文");
		lolMap.put(5, "李星");

		int randNum = (int) (Math.random() * 6) + 1;

		if (lolMap.get(randNum) != null) {
			System.out.println(lolMap.get(randNum));
			lolMap.remove(randNum);
		}else {
			System.out.println("重骰");
		}

	}

}
