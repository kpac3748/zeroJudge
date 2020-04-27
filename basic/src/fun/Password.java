package fun;

import java.math.BigInteger;
import java.security.MessageDigest;

public class Password {

	public static void main(String[] args) {
//		    int z;
//		    StringBuilder sb = new StringBuilder();
//		    int i;
//		    for (i = 0; i < 8; i++) {
//		      z = (int) ((Math.random() * 7) % 3);
//		 
//		      if (z == 1) { // 放數字
//		        sb.append((int) ((Math.random() * 10) ));
//		      } else if (z == 2) { // 放大寫英文
//		        sb.append((char) (((Math.random() * 26) + 65)));
//		      } else {// 放小寫英文
//		        sb.append(((char) ((Math.random() * 26) + 97)));
//		      }
//		    }
//		    System.out.println(sb.toString());
		
			
//			System.out.println(pwdGenerator(8, 1));
//			System.out.println(getMD5(pwdGenerator(8, 1)));
//			System.out.println(getMD5("bb1111"));
		String test = "KVXQ2P";
		System.out.println(getMD5(test));
	}

	private static String pwdGenerator(int digitOfSet) {

		String newPwd = "";
		String pwdSet = "";

		int num = 0;
		for (int i = 0; i < 1; i++) {
			pwdSet = "";
			while (pwdSet.length() < digitOfSet) {
				num = (int) (Math.random() * (90 - 50 + 1)) + 50; // for Java
				if (num > 57 && num < 65)
					continue; // 排除 58~64 這區間的非英數符號
				else if (num == 79 || num == 73)
					continue; // 排除 I 和 O
				pwdSet += (char) num; // 將數字轉換為字元
			}
			newPwd += pwdSet;
		}
		return newPwd;
	}
	
	 private static String getMD5(String str) {
		 String ret = null;
		 try {
		 // 生成一個MD5加密計算摘要
		 MessageDigest md = MessageDigest.getInstance("MD5");
		 // 計算md5函數
		 md.update(str.getBytes());
		 // digest()最後確定返回md5 hash值，返回值為8為字符串。因為md5 hash值是16位的hex值，實際上就是8位的字符
		 // BigInteger函數則將8位的字符串轉換成16位hex值，用字符串來表示；得到字符串形式的hash值
		 ret = new BigInteger(1, md.digest()).toString(16);
		 } catch (Exception e) {
		 //throw new SpeedException("MD5加密出現錯誤");
		 e.printStackTrace();
		 }
		 return ret;
		 }
}
