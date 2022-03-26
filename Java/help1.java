import java.io.*;
class help
{
	String helpfile;
	help(String fname)
	{
		helpfile = fname;
	}
	boolean helpOn(String what)
	{
		int ch;
		String topic,info;
		try(BufferedReader helpRdr = new BufferedReader(new FileReader(helpfile))
		{
			do
			{
				ch = helpRdr.read();
				if(ch=='#')
				{
					topic=helpRdr.readLine();
					if(what.compareTo(topic)==0)
					{
						do
						{
							info=helpRdr.readLine();
							if(info != null)
							{
								System.out.println(info);
							}
						}while((info != null ) && (info.compareTo("") !=0));
						return true;
					}
				}
			}while(ch != -1);
		}	
		catch(IOException exc)
		{
			System.out.println("Error accessing help file .");
			return false;
		}
		return false;
	}
	String getSelection()
	{
		String topic = "";
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter topic :");
		try
		{
			topic=br.readline();
		}
		catch(IOException exc)
		{
			System.out.println("Error reading console.");
		}
		return topic;
	}
}
class filehelp
{
	public static void main(String args[])
	{
		help hlpobj =new help("helpfile.txt");
		String topic;
		
		System.out.println("try the help system."+"Enter 'stop' to end.");
		do
		{
			topic =hlpobj.getSelection();
			if(!hlpobj.helpOn(topic))
			{
				System.out.println("topic not found . \n");
			}
		}while(topic.compareTo("stop")!=0);
	}
}