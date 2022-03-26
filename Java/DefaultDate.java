//error

import java.util.GregorianCalendar;
import java.util.*;
import java.util.Locale;
import java.util.Calendar;

public class DefaultDate
{
	public static void main(String args[])
	{
		System.out.println(Locale.getDefault());
		//Date now = Calendar.getTime();
		
		
		GregorianCalendar c1 = new GregorianCalendar(1998,Calendar.MARCH,10);
	
		LocalDate today = new LocalDate.now();
		
		System.out.println("todays local date : " + today);
		System.out.println("todays calendar : " +  c1);
		
	}
}