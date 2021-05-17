package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestStream {

	public static void main(String[] args) {
		/*example 1*/
		List<Integer> numbers = Arrays.asList(2,5,3,1,8,10);
		numbers.stream().peek(System.out::println).count(); 
		System.out.println(numbers);
	}

}
