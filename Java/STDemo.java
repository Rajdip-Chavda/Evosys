import java.util.StringTokenizer;
class STDemo
{
	static String in="title=java: Data Structure;"+"author=ds;"+"publisher=npatel;"+"copyright=2020";
	
	public static void main(String args[])
	{
		StringTokenizer st=new StringTokenizer(in,"=;");
		while(st.hasMoreTokens())
		{
			String key=st.nextToken();
			String val=st.nextToken();
			System.out.println(key+"\t"+val);
		}
	}
} 