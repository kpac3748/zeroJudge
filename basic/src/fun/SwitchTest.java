package fun;

public class SwitchTest {

	public static void main(String[] args) {
		String xxx = "a";
		String yyy = "d";
		int zzz = 1;
		
		String result = "";
		
		switch(yyy){
			case "a":
				result = "a";
				System.out.println(xxx);
				break;
			case "b":
				result = "b";
				System.out.println("b");
				break;
		}
		
		System.out.println("result = " + result);
	}
}
