import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class copychar
{
	public static void main(String args[]) throws IOException
	{
		FileReader instream=null;
		FileWriter outstream=null;
		
		try
		{
			instream=new FileReader("test.txt");
			outstream=new FileWriter("charoutput.txt");
			int c;
			while ((c=instream.read())!=-1)
			{
				outstream.write(c);
			}
		}
		finally
		{
			if(instream != null)
			{
				instream.close();
			}
			if(outstream!=null)
			{
				outstream.close();
			}
		}
	}
}