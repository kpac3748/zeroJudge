package java8;

import java.util.ArrayList;
import java.util.List;

public class StreamPratice {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("5");
		list.add("4");
		
		list.stream().filter(s -> Integer.valueOf(s) < 3).forEach(s -> System.out.print(s));

	}

}
