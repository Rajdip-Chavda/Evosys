package abstractClasses;

public class Student extends Person
{
	private String major;
	public Student(String n,String m)
	{
		super(n);
		major=m;
	}
	public String getDescription()
	{
		return "a Student majoring in " +major;
	}
}