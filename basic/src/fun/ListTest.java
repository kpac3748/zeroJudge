package fun;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ListTest {

	public static void main(String[] args) {
		List<String> xxx = new ArrayList<String>();
		
		xxx.add("0");
		xxx.add("1");
		xxx.add("2");
		xxx.add("3");
		
		String result[] = new String[xxx.size()];
		result = xxx.toArray(result);
		
		for(int i = 0 ; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
		System.out.println(xxx.toString());
	}

}
