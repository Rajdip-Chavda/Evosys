abstract class Employee 
{
	private int empid;
	private String fname;
	private String lname;
	private double salary;
	private String designation;
	private double bonus;
	public Employee(int empid, String fname, String lname, double salary, String designation) 
	{
		this.empid = empid;
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
		this.designation = designation;
	}
	public void setBonus(int bonus) 
	{
		this.bonus = bonus;
	}
	void showDetails() 
	{
		System.out.println("Employee id : " + empid);
		System.out.println("Employee First Name : " + fname);
		System.out.println("Employee Last Name : " + lname);
		System.out.println("Employee Salary : " + salary);
		System.out.println("Employee Bonus : " + bonus);
		System.out.println("Employee Designation : " + designation);
	}
	abstract int calculate_bonus();
}
class Clerk extends Employee 
{
	int noOfHrWorked;
	public Clerk(int empid, String fname, String lname, double salary, String designation, int noOfHrWorked) 
	{
		super(empid, fname, lname, salary, designation);
		this.noOfHrWorked = noOfHrWorked;
		super.setBonus(calculate_bonus());
	}
	@Override
	int calculate_bonus() 
	{
		if (noOfHrWorked > 250)
		return (noOfHrWorked - 250) * 200;
		return 0;
	}	
}
class Manager extends Employee 
{
	int noOfPrjManaged;
	public Manager(int empid, String fname, String lname, double salary, String designation, int noOfPrjManaged) 
	{
		super(empid, fname, lname, salary, designation);
		this.noOfPrjManaged = noOfPrjManaged;
		super.setBonus(calculate_bonus());
	}
	@Override
	int calculate_bonus() 
	{
		return noOfPrjManaged * 1000;
	}
}
class Program24 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Clerk(101, "Prince", "Luhar", 10000, "Sales", 255);
		e1.showDetails();
		Employee e2 = new Manager(102, "Rahul", "Modi", 12000, "HR", 3);
		e2.showDetails();
	}
}
