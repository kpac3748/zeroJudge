package fun;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Dateformat {
	private static DateTimeFormatter yyyy_mm_dd = DateTimeFormatter.ofPattern("uuuu/MM/dd").withZone(ZoneId.of("Asia/Taipei"));
	
	public static void main(String[] args) {
//		Calendar c = Calendar.getInstance();
//		c.set(Calendar.HOUR, -12);
//		c.set(Calendar.MINUTE, 0);
//		c.set(Calendar.SECOND, 0);
//		c.set(Calendar.MILLISECOND, 0);
//		Date today = c.getTime();
//		System.out.println(today);
		
		
//		String dateOri = "1989/02/18";
//		String dateEnd = "1989/02/18";
//		String ori = dateOri.replaceAll("/", "");
//		String end = dateEnd.replaceAll("/", "");
//		
//		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
//		try {
//			
//			Date a = sdf.parse(ori);
//			Date b = sdf.parse(end);
//			
//			if(a.after(b)) {
//				System.out.println("yes");
//			}
//			else {
//				System.out.println("No");
//			}
//			
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		String tfdStartDate = "20191201";
//		if(isValidDate(tfdStartDate)) {
//			System.out.println("ok");
//		}
//		else {
//			System.out.println("NG");
//		}
//		
		//isValidDate(str)�瘜�
//		String testDate = "1989/02/16";
//		if(isValidDate(testDate)) {
//			System.out.println("ok");
//		}
//		else {
//			System.out.println("NG");
//		}
//		long time2, time3;
//		
//		time2 = System.currentTimeMillis();
//		String date = "2019/01/02";
//		System.out.println(date.replace("/", "-") + "%");
//		time3 = System.currentTimeMillis();
//		System.out.println("querybylike()�鈭��" + String.valueOf((time3-time2)/1000) + "蝘�");
		
//		
//		boolean result = true;
//		LocalDate a = LocalDate.of(2011, 6, 28);
//		LocalDate b = LocalDate.of(2012, 8, 25);
//		
//		System.out.println(a.compareTo(b));
		
//		String today = LocalDate.now().toString().replaceAll("-", "");
		
		java.sql.Date date_SQL = new java.sql.Date(System.currentTimeMillis());
		System.out.println(date_SQL);
	}
	
	private static boolean isValidDate(String str) {
        boolean convertSuccess = true;
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        try {
            format.setLenient(false);
            format.parse(str);
        } catch (ParseException e) {
            convertSuccess = false;
        }
        return convertSuccess;
    }
	
	private static boolean isStartDateEffect(String tfdStartDate) {
		boolean result = true;
		//����予���隞訴ate
		Calendar c = Calendar.getInstance();
		c.set(Calendar.HOUR, -12);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		Date today = c.getTime();
		
		String str = tfdStartDate.replaceAll("/", "");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		
		try {
			Date startDate = sdf.parse(str);
			
			if(startDate.before(today)) {
				result = false;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return result;
    }
}
