package fun;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Dateformat {
	private static DateTimeFormatter yyyy_mm_dd = DateTimeFormatter.ofPattern("uuuu/MM/dd")
			.withZone(ZoneId.of("Asia/Taipei"));

	public static void main(String[] args) {
//		Calendar c = Calendar.getInstance();
//		c.set(Calendar.HOUR, -12);
//		c.set(Calendar.MINUTE, 0);
//		c.set(Calendar.SECOND, 0);
//		c.set(Calendar.MILLISECOND, 0);
//		Date today = c.getTime();
//		System.out.println(today);

//		String dateOri = "2020/09/15 00:00:00";
//		String dateEnd = "2020/09/15 11:00:00";
//		String ori = dateOri.replaceAll("/", "");
//		String end = dateEnd.replaceAll("/", "");
//
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
//		try {
//
//			Date a = sdf.parse(ori);
//			Date b = sdf.parse(end);
//			Date c = new Date();
//
//			System.out.println("a = " + a);
//			System.out.println("b = " + b);
//			System.out.println("c = " + c);
//
//			if (a.compareTo(c) > 0) {
//				System.out.println("a is after b");
//			} else if (a.compareTo(c) < 0) {
//				System.out.println("a is before b");
//			} else if (a.compareTo(c) == 0) {
//				System.out.println("a is equal to b");
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
		// isValidDate(str)�瘜�
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

//		java.sql.Date date_SQL = new java.sql.Date(System.currentTimeMillis());
//		System.out.println(date_SQL);

//		Date d = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
//		String xxx = sdf.format(d);
//		System.out.println(xxx);

//		Calendar calendar = Calendar.getInstance();
//		calendar.set(2020, 11, 05);
//		System.out.println(calendar);
//		calendar.add(Calendar.YEAR, 1);

//		System.out.println(calendar.get(Calendar.YEAR));

//		String orderReserveDate = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
//		String orderReserveDate2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(calendar.getTime());
//		System.out.println(orderReserveDate);
//		System.out.println(orderReserveDate2);

//		Timestamp ts = new Timestamp(System.currentTimeMillis());
//		System.out.println("ts = " + ts);
//		
//		Date date = new Date(ts.getTime());
//		System.out.println("date = " + date);
//		date = ts;
//		System.out.println("date = " + date);
//		Date today = new Date();
//		Calendar calendar = Calendar.getInstance();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
//		calendar.setTime(today);
//		calendar.add(calendar.DAY_OF_YEAR, 3);
//		Date afterDays = calendar.getTime();
//		String sdfAfterDays = sdf.format(today);
//		System.out.println(sdfAfterDays);

//		try {
//			String time = "2020-09-15 16:00";
//			sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
//			Date xxx = sdf.parse(time);
//			System.out.println(xxx);
//			calendar.setTime(xxx);
//			calendar.add(calendar.DAY_OF_YEAR, 3);
//			afterDays = calendar.getTime();
//			sdfAfterDays = sdf.format(afterDays);
//			System.out.println("22222222222 = " + sdfAfterDays);
//
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//		Date today = new Date();
//		Calendar calendar = Calendar.getInstance();
//		calendar.setTime(today);
//		calendar.add(calendar.YEAR, 3);
//		Date afterDays = calendar.getTime();
//		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
//		String xxx = sdf.format(afterDays);
//		
//		java.sql.Timestamp sqlDate = new java.sql.Timestamp(new java.util.Date().getTime());
//		
//		System.out.println(sqlDate);

//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
//		String scheduledDate = "2020-12-11 01:55";
//		Calendar calendar = Calendar.getInstance();
//		Calendar calendarToday = Calendar.getInstance();
//		Date sdfScheduledDate;
//		
//		try {
//			sdfScheduledDate = sdf.parse(scheduledDate);
//			calendar.setTime(sdfScheduledDate);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		int year = calendarToday.get(Calendar.MONTH) +1;
//		int hour = calendar.get(Calendar.HOUR_OF_DAY);
//		int min = calendar.get(Calendar.MINUTE);
//		System.out.println("hour = " + hour);
//		System.out.println("min = " + min);
//		
//		
//		
//		
//		calendarToday.add(Calendar.DAY_OF_MONTH, 3);
//		calendarToday.set(Calendar.HOUR_OF_DAY, hour);
//		calendarToday.set(Calendar.MINUTE, min);
//		
//		Date afterDays = calendarToday.getTime();
//		String sdfAfterDays = sdf.format(afterDays);
//		System.out.println("sdfAfterDays = " + sdfAfterDays);
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
//		String scheduledDate = "2020-12-11 15:00";
//		Date sdfScheduledDate = null;
//		try {
//			sdfScheduledDate = sdf.parse(scheduledDate);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		 /*取得今天的Calendar*/
//        Calendar calendarToday = Calendar.getInstance();
        
        /*取得預約供裝時間的Calendar*/
//        Calendar calendarScheduledDate = Calendar.getInstance();
//        
//        calendarScheduledDate.setTime(sdfScheduledDate);
        /*取得預約供裝時間的時*/
//        int scheduledDateHour = calendarScheduledDate.get(Calendar.HOUR_OF_DAY);
        /*取得預約供裝時間的分*/
//        int scheduledDateMin = calendarScheduledDate.get(Calendar.MINUTE);;
        
        /*設定將預約供裝時段，並將日期從今日延後3天。*/
//        calendarToday.add(Calendar.DAY_OF_MONTH, 3);
//        calendarToday.set(Calendar.HOUR_OF_DAY, scheduledDateHour);
//        calendarToday.set(Calendar.MINUTE, scheduledDateMin);
//        Date afterDays = calendarToday.getTime();
//        String sdfAfterDays = sdf.format(afterDays);
//        
//        System.out.println(sdfAfterDays);
//		
//	      // make 3 comparisons with them
//	      int comparison = sdfTodayDate.compareTo(date);
//	      int comparison2 = date.compareTo(sdfTodayDate);
//	      int comparison3 = sdfTodayDate.compareTo(date);
//
//	      // print the results
//	      System.out.println("Comparison Result:" + comparison);
//	      System.out.println("Comparison2 Result:" + comparison2);
//	      System.out.println("Comparison3 Result:" + comparison3);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		Calendar calendarToday = Calendar.getInstance();
      Date afterDays = calendarToday.getTime();
      String sdfAfterDays = sdf.format(afterDays);
      System.out.println("sdfAfterDays Result:" + sdfAfterDays);
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
		// ����予���隞訴ate
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

			if (startDate.before(today)) {
				result = false;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return result;
	}
}
