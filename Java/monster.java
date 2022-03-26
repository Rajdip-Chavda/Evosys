abstract class monster
{
	public abstract void display();
}
class warewolf extends monster
{
	public void display()
	{
		System.out.println("warewolf");
	}
}
class monster1
{
	public static void main(String args[])
	{
		monster ab=new warewolf();
		ab.display();
	}		
}
