package fun;

public class TestString {

	public static void main(String[] args) {
		
//		String xxx = testChangeStringInMethod("OOQ");
//		
//		System.out.println(xxx);
//		String sql = "select " +
//						"row_number() over (order by dealer_code, cart.create_date ) sn, " +
//	
//		   				"CART.APPL_NO, CART.APPL_NME ,CART.phone_no , CART.DEALER_CODE, CART.CREATE_DATE, " +
//	
//		    			"NVL(device.寬頻乙太網路線,0) 寬頻乙太網路線, " + 
//	
//		    			"NVL(device.寬頻數據機,0) 寬頻數據機, " +
//	
//		    			"NVL(device.寬頻電源線與變壓器,0) 寬頻電源線與變壓器 " +
//
//					"FROM (" +
//
//	   					"select  CART.APPL_NO, m.item, count(*) nums " +
//
//	        			"from tstar_appl_cart_item m " +
//
//	            		"join tstar_appl_cart cart on cart.appl_no = M.APPL_NO " +
//
//	        			"where M.ITEM_TYPE = 'CNS_RETURNED_DETAIL' " +
//
////	            -- and CART.CREATE_DATE > = ADD_MONTHS(trunc(SYSDATE,'mm'), -1)  and CART.CREATE_DATE < trunc(SYSDATE , 'mm')
//
//	        			"group by m.item,CART.APPL_NO ) " +
//
//	    			"pivot ( sum(nums)  " +
//
//	            		"for item in (" +
//
//	        			"'光纖寬頻乙太網路線' 寬頻乙太網路線 ,'光纖寬頻數據機' 寬頻數據機 ,'光纖寬頻電源線與變壓器' 寬頻電源線與變壓器)" + 
//
//	    				") device " +		
//
//	    			"left join tstar_appl_cart cart on CART.APPL_NO = device.appl_no " +
//
//	    			"where  cart_status=2000 " +
//
//	    			"order by cart.dealer_code, create_date " ;
		
		int xxx = 3;
		String aaa = String.valueOf(-xxx);
		System.out.println(aaa);

	    
	}

	public String convertStringNotNull(String input) {
		String result = input != null ? input : "";
		return result;
	}

	public void testEquals(String input) {
		String aPack = "PJ000:PJ001:PJ002";
		String[] aPackArray = aPack.split(":");
		/* 三元運算子 */
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

		// 1 + 100
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 100; i++) {
			if (i == 100) {
				sb.append(i);
				break;
			}
			sb.append(i).append("+");
		}

		System.out.println(sb.toString());
	}

	static String testChangeStringInMethod(String input) {
		String result = "";
		System.out.println("input first in = " + input);

		input = "QOO";

		System.out.println("input after = " + input);
		result = input;
		return result;
	}
}
