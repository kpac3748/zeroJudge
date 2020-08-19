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
		// ���f��������������Ҧ��ݩʰ�
		Field[] fields = f.getClass().getDeclaredFields();
		for (int i = 0, len = fields.length; i < len; i++) {
			// ���C���ݩ�,����ݩʦW
			String varName = fields[i].getName();
			try {
				// �����Ӫ��X�ݱ����v��
				boolean accessFlag = fields[i].isAccessible();
				// �ק�X�ݱ����v��
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
				
				// ����b����f���ݩ�fields[i]���������󤤪��ܼ�
				Object o = fields[i].get(f);
				System.out.println("�ǤJ�����󤤥]�t�@�Ӧp�U���ܼ�: " + varName + " = " + o);
				// ��_�X�ݱ����v��
				fields[i].setAccessible(accessFlag);
			} catch (IllegalArgumentException ex) {
				ex.printStackTrace();
			} catch (IllegalAccessException ex) {
				ex.printStackTrace();
			}
		}
	}

}
