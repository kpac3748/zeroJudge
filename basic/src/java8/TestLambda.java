package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestLambda {

	public static void main(String[] args) {
		/*example 1*/
		List<Integer> numbers = Arrays.asList(2,5,3,1,8,10);
		Collections.sort(numbers, (o1, o2) -> o1.compareTo(o2));
		System.out.println(numbers);
		
		/*example 2*/
		List<String> names = Arrays.asList("Justin", "Monica", "Irene", "caterpillar");
//		Collections.sort(names, (o1, o2) -> o1.length() - o2.length());
//		Collections.sort(names, (o1, o2) -> sortByLength(o1, o2));
		System.out.println(names);
	}
	
	private static int sortByLength(String s1, String s2) {
		return s1.length() - s2.length();
	}
}
