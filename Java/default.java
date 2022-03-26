//import java
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
class default1
{
	public static void main(String args[])
	{
		System.out.println(Locale.getDefault());
		GregorianCalendar cl= new GregorianCalendar(1998,Calendar.MARCH,10);
		LocalDate today= LocalDate.now();
		System.out.println("Today's local date :"+now);
		System.out.println("Today's calendar :"+cl);
	}
}