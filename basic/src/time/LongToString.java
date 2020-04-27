package time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LongToString {

	public static void main(String[] args) {
		String time="12:17:22.100";
		SimpleDateFormat format=new SimpleDateFormat("HH:mm:ss.SSS");
		//设置要读取的时间字符串格式
		try {
			Date date = format.parse(time);
			//转换为Date类
			Long timestamp=date.getTime();
			
			String text = "2015/08/31 21:08:06.100";
			String text2 = text.replace(" ", "").replaceAll("/", "").replaceAll("\\.", "");;
			String text3 = text2.replaceAll("\\.", "");
			
			long mseconds=timestamp/1000;
			SimpleDateFormat sdf= new SimpleDateFormat("HH:mm:ss.SSS");  
            date = new Date(mseconds * 1000);  
            String str = sdf.format(date);  
            System.out.println("str" + str);
			
			System.out.println("date = " + date );
			System.out.println("timestamp = " + timestamp );
			System.out.println(text2);
			System.out.println(text3);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
