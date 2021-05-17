package fun;

public class TestObjValue {
	 int cnsS = 0, cnsP = 0, cnsF = 0, crmapiS = 0, crmapiP = 0, crmapiF = 0;

	    void cnsSuccess() {
	        cnsS++;
	    }
	    
	    void cnsPending() {
	        cnsP++;
	    }

	    void cnsFail() {
	        cnsF++;
	        }

	     void crmapiSuccess() {
	        crmapiS++;
	    }
	    
	     void crmapiPending() {
	        crmapiP++;
	    }

	     void crmapiFail() {
	        crmapiF++;
	    }

	public static void main(String[] args) {
		TestObjValue testObjValue = new TestObjValue();
		for(int i = 0; i < 10 ; i++) {
			try {
				int randomNum =(int)(Math.random()*100);
				if(randomNum < 50) {
					countExcuteStatus(testObjValue, "SUCEESS");
				}
				else if(50 < randomNum && randomNum < 80) {
					countExcuteStatus(testObjValue, "PENDING");
				}
				else {
					throw new Exception("Exception randomNum = " + randomNum);
				}
				System.out.println("randomNum = " + randomNum);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
				testObjValue.cnsFail();
			}
		}
		testObjValue.getCount();
	}
	
	private void getCount() {
		int suceess = cnsS;
		int pending = cnsP;
		int fail = cnsF;
		
		System.out.println(String.format("成功 %s 筆，Pending %s筆，失敗 %s筆",
				suceess, pending, fail));
	}
	
	private static void countExcuteStatus(TestObjValue testObjValue, String excuteStatus) {
        if("SUCEESS".equals(excuteStatus)) {
            testObjValue.cnsSuccess();
        }
        else if("PENDING".equals(excuteStatus)) {
            testObjValue.cnsPending();
        }
    }

}
