import java.io.*;
class ReadLines1
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		String str;
		
		System.out.println("Enter lines of text.");
		System.out.println("Enter 'stop' to Exit");
			str="a";
			while ((!str.equals ("stop")) || (!str.equals ("STOP")))  
			{
				str=br.readLine();
				System.out.println(str);
			}
	}
}
