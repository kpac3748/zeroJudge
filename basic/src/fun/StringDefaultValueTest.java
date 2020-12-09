package fun;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StringDefaultValueTest {
	private final static String xxx = "123";
	private final static String yyy = "222";

	public static void main(String[] args) {
//		long a = 0;
//		int b = 0;
//		String c = "";
//		System.out.println(String.valueOf(a));
//		System.out.println(String.valueOf(b));
//		System.out.println("c = " + Integer.parseInt(c));
		
//		String accboxSendMsg ="RSKKasdas";	
//		String[] accboxSendMsgArray = accboxSendMsg.split("-");
//		String msgCD = accboxSendMsgArray[0];	//閮隞����
//		
//		String num = "81.3";
//		String[] numArray = num.split("\\.");
//		String numResult = numArray[0] + numArray[1].replaceAll("0", "").toString(); 
//		
//		System.out.println(msgCD);
//		
//		System.out.println(numArray.length);
//		System.out.println(numArray[1]);
//		System.out.println(numResult);
//		System.out.println(accboxSendMsg.contains("."));
//		System.out.println(num.contains("."));
		
//		String date ="2019/12/13";	
//		String newDate = date.replaceAll("/", "");
//		System.out.println(newDate);
		
//		String xxx = "";
//		System.out.println("xxx.length = " + xxx.length());
		
//		String userProfile_result  = "{'RequestId':'20160711-150521-5808','ResultCode':'00000','ResultText':'Success','PID':'P00000000000798','UID':'000000000267967','ContractId':'0004825506','CompanyId':'026','MSISDN':'0986022123','UserStatus':'1','CustProfileRes':{'RequestId':'20160711-150521-5808','ResultCode':'00000','ResultText':'Success','UID':'000000000267967','ContractId':'0004825506','MSISDN':'0986022123','CustId':'28431445','CustName':'士冰股份有限公司','AccountId':'0004859728','IMSI':'466890084011994','Birthday':'','OperatorId':'04','CompanyId':'026','BillingCycle':'12','Gender':'','CustType':'1','UserState':'0','VIPDegree':'New','VIPDate':'','vipStartDate':'','vipEndDate':'','PicUrl':'','Email':'','EmailFlag':'','Pwschange':'1','customerContribution':'Z','projectCode':'911008','projectName':'4G大玩特玩卡','retensionType':'','realFee':'0','activationDate':'2016/11/10 14:26:00','expiredDate':'2016/11/10 14:26:00','isMainMsisdn':'Y','nickname':'','planName':'T_STAR01','gsmToLteFlag':'1','gsmToLteDate':'2017/04/25 13:40:00','rtApplyDate':'','projectEffectiveDate':'2016/11/10 14:26:00','vipReward':'新星','isBL':'N'}}";
//		String userProfile_result  = "{\"RequestId\":\"20160711-150521-5808\",\"ResultCode\":\"00000\",\"ResultText\":\"Success\",\"PID\":\"P00000000000798\",\"UID\":\"000000000267967\",\"ContractId\":\"0004825506\",\"CompanyId\":\"026\",\"MSISDN\":\"0986022123\",\"UserStatus\":\"1\",\"CustProfileRes\":{\"RequestId\":\"20160711-150521-5808\",\"ResultCode\":\"00000\",\"ResultText\":\"Success\",\"UID\":\"000000000267967\",\"ContractId\":\"0004825506\",\"MSISDN\":\"0986022123\",\"CustId\":\"28431445\",\"CustName\":\"士冰股份有限公司\",\"AccountId\":\"0004859728\",\"IMSI\":\"466890084011994\",\"Birthday\":\"\",\"OperatorId\":\"04\",\"CompanyId\":\"026\",\"BillingCycle\":\"12\",\"Gender\":\"\",\"CustType\":\"1\",\"UserState\":\"0\",\"VIPDegree\":\"New\",\"VIPDate\":\"\",\"vipStartDate\":\"\",\"vipEndDate\":\"\",\"PicUrl\":\"\",\"Email\":\"\",\"EmailFlag\":\"\",\"Pwschange\":\"1\",\"customerContribution\":\"Z\",\"projectCode\":\"911008\",\"projectName\":\"4G大玩特玩卡\",\"retensionType\":\"\",\"realFee\":\"0\",\"activationDate\":\"2016/11/10 14:26:00\",\"expiredDate\":\"2016/11/10 14:26:00\",\"isMainMsisdn\":\"Y\",\"nickname\":\"\",\"planName\":\"T_STAR01\",\"gsmToLteFlag\":\"1\",\"gsmToLteDate\":\"2017/04/25 13:40:00\",\"rtApplyDate\":\"\",\"projectEffectiveDate\":\"2016/11/10 14:26:00\",\"vipReward\":\"新星\",\"isBL\":\"N\"}}";;
//		System.out.println(userProfile_result);
		
//		String QOO = xxx + "\r" + yyy;
//		System.out.println(QOO);
		
//		String refundMsg = "qoo, 10|xyz, 20"; 
//		String xxx[] = refundMsg.split("\\|");
//		System.out.println(xxx.length);
//		for(int i = 0 ; i < xxx.length; i++) {
//			System.out.println(xxx[i]);
//		}
//		
		
//		String qqq = "PREPAY_DIS_ITEMS=[{NME=手機拆封+開通手機, AMT=2000}, {NME=登入Apple帳號, AMT=1000}, {NME=包膜, AMT=500}]";
//		String yyy = "\"" + qqq.replace("=", "\":");
//		
//		System.out.println(yyy);
		
//		prepareTstarApplCartItem("手機拆封+開通手機,2000|登入Apple帳號,1000|包膜,500", "");
//		String xxx = "{\"code\":\"0099\",\"msg\":\"地址參數有誤\",\"data\":null}";
//		System.out.println(xxx.length());
		
//		String logText = String.format(" (CNSManagerImpl.%s) ", "TS_update_available_time().");
		String xxx = "0";
		System.out.println(Integer.parseInt(xxx));
	}
	
	static void prepareTstarApplCartItem(String selectedPrepayDiscountInfo, String applNo) {
        List result = new ArrayList();
        String[] splitArray = selectedPrepayDiscountInfo.split("\\|");
        System.out.println("splitArray.length = " + splitArray.length);
        for(int i = 0; i < splitArray.length; i++) {
        	System.out.println(splitArray[i]);
        }
        Date today = new Date();
        int count = 10;
        BigDecimal one = new BigDecimal(1);
        
        for(int i = 0; i < splitArray.length; i++) {
            String[] itemArray = splitArray[i].split(",");
            for(int j = 0; j < itemArray.length; j++) {
            	BigDecimal itemId = new BigDecimal(count);
                String item = itemArray[j];
                System.out.println("item = " + item);
                if(j == 0) {
                	System.out.println(itemId);
                	System.out.println("itme");
                	System.out.println(itemId);
                }
                else {
                	System.out.println(itemId);
                	System.out.println("itmeAMT");
                	System.out.println(itemId.subtract(one));
                }
                count++;
            }
        }
    }

}
