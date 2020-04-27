package fun;

public class PasswordCount {

	public static void main(String[] args) {
		String password = "xx1yy&&&11";
		int repeatNum = 3;
		
		System.out.println(checkPwd(password, repeatNum));
	}
	
	private static boolean checkPwd(String password, int repeatNum) {
		boolean isVaild = true;
		
		//sameCount表示目前的字元後面n個字元和它一樣
		for(int i =0 ; i < password.length()-repeatNum + 1; i++ ) {
			int sameCount = 0;
			
			for(int j=1; j < repeatNum; j++) {
				if(password.charAt(i) == password.charAt(i + j)) {
					sameCount++;
				}
			}
			if(sameCount == repeatNum -1) {
				isVaild = false;
				return isVaild;
			}
		}
		
		return isVaild;
	}

}
