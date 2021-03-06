package inheritance;
import java.util.Date; 
import java.util.GregorianCalendar; 

class employee 
{ 
	private String name; 
	private double salary; 
	private Date hireDay; 
	public Employee(String n, double s, int year, int month, int day) 
	{ 
		name = n; 
		salary = s; 
		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day); 
		hireDay = calendar.getTime(); 
	} 
	public String getName() 
	{ 
		return name; 
	} 
	public double getSalary() 
	{ 
		return salary; 
	} 
	public Date getHireDay() 
	{ 
		return hireDay; 
	} 
	public void raiseSalary(double byPercent) 
	{ 
		double raise = salary * byPercent / 100; 
		salary += raise; 
	} 
}

class manager extends employee 
{ 
	private double bonus; 

	public Manager(String n, double s, int year, int month, int day) 
	{ 
		super(n, s, year, month, day); 
		bonus = 0; 
	} 
	public double getSalary() 
	{ 
		double baseSalary = super.getSalary(); 
		return baseSalary + bonus; 
	} 
	public void setBonus(double b) 
	{ 
		bonus = b; 
	} 
}

class managertest 
{ 
	public static void main(String[] args) 
	{ 
	// construct a Manager object 
	Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15); 
	boss.setBonus(5000); 
	Employee[] staff = new Employee[3]; 
	// fill the staff array with Manager and Employee objects 
	staff[0] = boss; 
	staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);  
	staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15); 
	// print out information about all Employee objects 
	for (Employee e : staff) 
		System.out.println("name=" + e.getName() + ",salary=" +e.getSalary()); 
	
	} 
}
