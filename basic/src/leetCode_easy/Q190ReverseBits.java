package leetCode_easy;

public class Q190ReverseBits {

	public static void main(String[] args) {
		System.out.println(reverseBits(-3));
	}
	
    public static int reverseBits(int n) {
    	int result = 0;
    	String originalStr = Integer.toBinaryString(n);

		/*將bit數量補齊到32個*/
		int diff = 32 - originalStr.length();
		StringBuilder sb = new StringBuilder();
		if(diff > 0) {
			for(int i = 0; i < diff ; i++) {
				sb.append("0");
			}
		}
		sb.append(originalStr);
		
		/*完整的32位元*/
		String entireStr = sb.toString();
		
		/*開始反轉*/
		sb = new StringBuilder();
		for(int i = entireStr.length(); i>0; i-- ) {
			sb.append(entireStr.substring(i-1, i));
		}
		
		/*反轉結果轉成數字*/
		if(diff > 0 && sb.toString().substring(0,1).equals("0")) {
			result = Integer.parseInt(sb.toString(), 2);
		}
		else {
			result = Integer.parseUnsignedInt(sb.toString(), 2);
		}
		
    	return result;
    }

}
