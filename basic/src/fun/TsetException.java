package fun;

public class TsetException {

	public static void main(String[] args) {
		
//		try {
//			String xx = null;
//			xx.equals("");
//		}
//		catch(Exception ex) {
//			System.out.println("QOO");
//		}
//		
//		System.out.println("1231213");
//		int result = 123;
//		try {
//			result = apiController("zzz");
//			System.out.println(result);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			System.out.println(result);
//			e.printStackTrace();
//		}
		
		try {
			testone();
		} catch (Exception e) {
			System.out.println("main execute");
		}

	}
	
	 static int apiController(String apiName) throws Exception {
	        String logText = "執行apiController(). ";
	        int batchSendAPIExecutedVO = Integer.MIN_VALUE;
	        switch (apiName) {
	            case "a":
	            	batchSendAPIExecutedVO = 0;
	                break;
	            case "b":
	            	batchSendAPIExecutedVO = 1;
	                break;
	            case "c":
	            	batchSendAPIExecutedVO = 2;
	                break;
	            case "d":
	            	batchSendAPIExecutedVO = 3;
	                break;
	            case "e":
	            	batchSendAPIExecutedVO = 4;
	                break;
	            default:
	                throw new Exception("找不到符合的API。" + logText + "apiName = " + apiName);
	        }
	        
	        return batchSendAPIExecutedVO;
	    }
	 
	 static void testone() throws Exception {
		 try {
			 testtwo();
	        }
	        finally {
                try {
                	testthree();
                } catch (Exception e) {
                    System.out.println("寄送 BATCH_SEND_API_JOB 執行失敗的通知信，發生 Exception" + e);
                }
	        }
	 }
	 
	 static void testtwo() throws Exception {
		 throw new Exception("QOO testtwo");
	 }
	 
	 static void testthree() throws Exception {
		 System.out.println("12321 testthree");
	 }
}
