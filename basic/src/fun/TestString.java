package fun;

public class TestString {

	public static void main(String[] args) {
		String aPack = "PJ000:PJ001:PJ002";
		String[] aPackArray = aPack.split(":");
		/*三元運算子*/
		String aPackArrayElement = aPackArray[1] != null ? aPackArray[1] : "";

		String[] bArray = { "PJ000", "PJ001", "PJ002" };
		String bArrayElement = bArray[1] != null ? bArray[1] : "";

		String c = "PJ001";

		if (aPackArrayElement == c) {
			System.out.println("aPackArrayElement == C");
		}
		
		if (bArrayElement == c) {
			System.out.println("bArrayElement == C");
		}
		
		if (aPackArrayElement.equals(c)) {
			System.out.println("aPackArrayElement equals C");
		}
		
		if (bArrayElement.equals(c)) {
			System.out.println("bArrayElement equals C");
		}

	}
	
	public String convertStringNotNull(String input) {
		String result = input != null ? input : "";
		return result;
	}
}
