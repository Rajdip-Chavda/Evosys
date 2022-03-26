import java.time.*;
import java.util.*;
public class ZoneDateTime
{
	public static void main(String arg[])
	{
		ZoneDateTime zone=ZoneDateTime.now();
			System.out.println(zone.getZone());
	}
}