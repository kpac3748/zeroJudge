package fun;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {

	public static void main(String[] args) {
		TestBean xxx = new TestBean();
		xxx.setApplNoSeq("123");
		xxx.setApplyType("456");
		xxx.setAutopaidNoSeq("789");
		xxx.setCancelLeasesType("qqq");
		xxx.setChangeType("wwww");
		xxx.setCompCode("ffff");
		xxx.setCreateby("ddd");
		xxx.setProductTypeName("ggg");
		
		
		setAllComponentsName(xxx);
	}

	public static void setAllComponentsName(Object f) {
		// 獲取f物件對應類中的所有屬性域
		Field[] fields = f.getClass().getDeclaredFields();
		for (int i = 0, len = fields.length; i < len; i++) {
			// 對於每個屬性,獲取屬性名
			String varName = fields[i].getName();
			try {
				// 獲取原來的訪問控制權限
				boolean accessFlag = fields[i].isAccessible();
				// 修改訪問控制權限
				fields[i].setAccessible(true);
				Class[] classpt = {String.class};
				Object[] obj = {"YYYY"};
				
//				try {
//					Method method = f.getClass().getMethod("setProductTypeName", classpt);
//					method.invoke(f, obj);
//				} catch (NoSuchMethodException | SecurityException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (InvocationTargetException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				
				// 獲取在物件f中屬性fields[i]對應的物件中的變數
				Object o = fields[i].get(f);
				System.out.println("傳入的物件中包含一個如下的變數: " + varName + " = " + o);
				// 恢復訪問控制權限
				fields[i].setAccessible(accessFlag);
			} catch (IllegalArgumentException ex) {
				ex.printStackTrace();
			} catch (IllegalAccessException ex) {
				ex.printStackTrace();
			}
		}
	}

}
