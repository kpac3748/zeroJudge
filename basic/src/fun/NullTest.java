package fun;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class NullTest {
	public static void main(String[] args) {
//		List viboCompanys = new ArrayList();
//		List viboCompanys = null;
//		
//		System.out.println(viboCompanys);
//		if(viboCompanys != null || viboCompanys.isEmpty() == false) {
//			System.out.println("ok");
//		}
//		System.out.println("nothing");
		
		String PROD_TYPE = null;
		String PROD_TYPE2 = null;
		
		Optional.ofNullable(PROD_TYPE).orElse("");
		
		System.out.println("test1 = " + Optional.ofNullable(PROD_TYPE).orElse(""));
		System.out.println("test2 = " + Optional.ofNullable(PROD_TYPE).orElse("123"));
		System.out.println("test3 = " + Optional.ofNullable(PROD_TYPE2).orElse("456"));
		System.out.println("test4 = " + Optional.ofNullable(PROD_TYPE2).orElse("456"));
		System.out.println("test5 = " + PROD_TYPE);
		System.out.println("test6 = " + PROD_TYPE2);
	}
}
