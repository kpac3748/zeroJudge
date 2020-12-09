package fun;

import java.util.Calendar;
import java.util.Date;

public class TestCalejdar {

	public static void main(String[] args) {
		long qqq = 1637942400000L;
		Date xxx = new Date(qqq);
		System.out.println(xxx);
		compareSysDateWithOutTime(xxx, new Date());

	}
	
	public static int compareSysDateWithOutTime(Date compareDateA, Date compareDateB){

        Calendar aCal = Calendar.getInstance();
        aCal.setTime(compareDateA);
        aCal.set(Calendar.HOUR_OF_DAY, 0);
        aCal.set(Calendar.MINUTE, 0);
        aCal.set(Calendar.SECOND, 0);
        aCal.set(Calendar.MILLISECOND, 0);


        Calendar bCal = Calendar.getInstance();
        bCal.setTime(compareDateB);
        bCal.set(Calendar.HOUR_OF_DAY, 0);
        bCal.set(Calendar.MINUTE, 0);
        bCal.set(Calendar.SECOND, 0);
        bCal.set(Calendar.MILLISECOND, 0);
        
        System.out.println(aCal.compareTo(bCal));
        
        return aCal.compareTo(bCal);
    }
}
