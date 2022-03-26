public class tostringdemo
{
	public static void main(String args[])
	{
		double d=858.25;
		String s=Double.toString(d);
		
		int dot=s.indexOf('.');
		
		System.out.println(dot+" digits "+"before decimal point.");
		System.out.println((s.length()-dot-1)+" digits agter decimal point.");
	}
}