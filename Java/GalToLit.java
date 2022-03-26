/*
Thios program converts gallons to liters
*/
public class GalToLit
{

	public static void main(String[]  args)
	{
        double gallons; //holds the numbers of gallons
        double liters;  //holds the numbers of liters

        gallons = 10;
        liters = gallons * 3.7854; //convert to liters
		System.out.println(gallons + " gallons is "+liters+" liters.");
	}
}