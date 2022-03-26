import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class LocalDateExample
{
	public static void main(String args[])
	{
		//current date
		LocalDate today = LocalDate.now();
		System.out.println("current date : " + today);
		
		//creating localdate by providing input arguments
		LocalDate firstDay_2017 = LocalDate.of(2017,Month.JANUARY,1);
		System.out.println("specific date : " + firstDay_2017);
		
	}
}