package abstractClasses;
public class PersonTest
{
	public static void main(String[] args)
	{	
		Person[] people=new Person[2];
		
		people[0]=new Employee("rajdip",50000,2000,10,1);
		people[1]=new Student("daxesh","computer");
		
		for(Person p : people)
		{
			System.out.println(p.getName()+ " , "+p.getDescription());
		}
	}
}

