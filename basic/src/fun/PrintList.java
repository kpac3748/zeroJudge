package fun;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintList {

	public static void main(String[] args) {
		
		List<Map<String, String>> lstTest = new ArrayList<Map<String, String>>(); 
		List<String> lstTest2 = new ArrayList<String>();
		List<Map<String, String>> lstTest3 = new ArrayList<Map<String, String>>(); 
		
		Map<String, String> mapTest = new HashMap<String, String>();
		Map<String, String> mapTest2 = new HashMap<String, String>();
		Map<String, String> mapTest3 = new HashMap<String, String>();
		
		String id = "01";
		String name = "John";
		
		String id2 = "02";
		String name2 = "Mary";
		
		String id3 = "03";
		String name3 = "Cindy";
		
		mapTest.put(id, name);
		mapTest2.put(id2, name2);
		mapTest3.put(id3, name3);
		
		lstTest.add(mapTest);
		lstTest.add(mapTest2);
		lstTest.add(mapTest3);
		
		System.out.println(lstTest.toString());
		
		
		lstTest2.add(id);
		lstTest2.add(name);
		lstTest2.add(id2);
		lstTest2.add(name2);
		
		System.out.println(lstTest2.toString());
		
		System.out.println(lstTest3.toString());
		
		
		
	}

}
