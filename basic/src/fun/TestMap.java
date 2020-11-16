package fun;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
//		System.out.println("123");
//		Map map = new HashMap();
//		map.clear();
//		System.out.println("456");
		
		 List<Map<String, String>> list = new ArrayList<Map<String,String>>();
         Map<String, String> map1 = new HashMap<String, String>();
         map1.put("PREPAY_DISCOUNT_ITEMS", "手機拆封+開通手機");
         map1.put("PREPAY_DISCOUNT_AMOUNT", "-2000");
         list.add(map1);
         System.out.println(list);
         map1.clear();
         System.out.println(list);
	}

}
