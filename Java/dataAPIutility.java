import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

public class dataAPIutility
{
	public static void main(String args[])
	{
		LocalDate today=LocalDate.now();
		System.out.println("year "+today.getYear()+" is leap Year ? "+ today.isLeapYear());
		
		System.out.println("Today is before 01/01/2015?"+today.isBefore(LocalDate.of(2015,1,1)));
		
		System.out.println("current time="+today.atTime(LocalTime.now()));
		
		System.out.println("10 days after today will be "+today.plusDays(10));
		System.out.println("3 weeks after today will be "+today.plusDays(3));
		System.out.println("20 months after today will be "+today.plusDays(20));
		
		System.out.println("10 days before today will be "+today.minusDays(10));
		System.out.println("3 weeks before today will be "+today.minusDays(3));
		System.out.println("20 months before today will be "+today.minusDays(20));
		
		System.out.println("first date of this month :"+today.with(TemporalAdjusters.firstDayofMonth()));
		LocalDate.lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("lst date of this year="+lastDayOfYear);
		
		Period Period = today.until(lastDayOfYear);
		System.out.println("period format "+Period);
		System.out.println("months remainnig in the year "+Period.getMonths());
		
	}
}
