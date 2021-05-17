package fun;

import java.util.HashMap;
import java.util.Map;

import fun.vo.TestVO;

public class TestMap {

	public static void main(String[] args) {
//		System.out.println("123");
//		Map map = new HashMap();
//		map.clear();
//		System.out.println("456");
		
//		 List<Map<String, String>> list = new ArrayList<Map<String,String>>();
//         Map<String, String> map1 = new HashMap<String, String>();
//         map1.put("PREPAY_DISCOUNT_ITEMS", "手機拆封+開通手機");
//         map1.put("PREPAY_DISCOUNT_AMOUNT", "-2000");
//         list.add(map1);
//         System.out.println(list);
//         map1.clear();
//         System.out.println(list);
		
		Map<String, Object> result = confirmData();
		boolean isOk = (boolean)result.get("isOK");
		String id = (String)result.get("id");
		
		System.out.println("isOk = " + isOk);
		System.out.println("id = " + id);
		System.out.println(result.get("isOK"));
		System.out.println(result.get("id"));
		System.out.println(result.get("phone"));
		System.out.println(result.get("TestVO"));
		TestVO testVO = (TestVO)result.get("TestVO");
		System.out.println(testVO.getId());
		System.out.println(testVO.getPhone());
		System.out.println(testVO.isOK());
	}
	
	static Map<String, Object> confirmData(){
		Map<String, Object> result = new HashMap<String, Object>();
		boolean isOK = false;
		String id = "";
		int phone = 922;
		TestVO vo = new TestVO();
		vo.setId("QOO2");
		vo.setPhone(908);
		vo.setOK(true);
		
		result.put("isOK", isOK);
		result.put("id", id);
		result.put("phone", phone);
		result.put("TestVO", vo);
		
		return result;
	}

}
