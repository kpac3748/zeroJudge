package fun;

public class PasswordEngNum {

	public static void main(String[] args) {
		String passwordNew = "aaa";
		boolean isDigit = false;
		boolean isLetter = false;
		// 2.判斷字串中是否符合至少各有一個英文字母及數字在其中
        for(int i = 0 ; i < passwordNew.length(); i++) {
            // 利用char包裝類 - Character 中的判斷數字的方法(isDigit)，來判定該字串中是否包含數字
            if(Character.isDigit(passwordNew.charAt(i))) {
                isDigit = true;  
            }
            // 利用char包裝類 - Character 中的判斷英文字母的方法(isLetter)，來判定該字串中是否包含英文字母
            if(Character.isLetter(passwordNew.charAt(i))) {
                isLetter = true;
            }
            // 如符合至少各有一個英文字母及數字在其中者，則可跳出該迴圈
            if(isDigit && isLetter)
                break;
        }
		
		if(	isDigit && isLetter)
			System.out.println("work!");
		else {
			System.out.println("not work!");
		}

	}

}
