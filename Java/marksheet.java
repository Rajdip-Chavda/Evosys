import java.util.Scanner;
class marksheet
{
	public void display(int roll,String fname,String lname,String subject[],int array[])
	{
		int sum=0,percentage;
		for(int i=0;i<subject.length;i++)
		{
			sum = sum + array[i];
		}
		percentage=sum/subject.length;
		System.out.println("-----------------------------------------");
		System.out.println("|\t\tMarksheet\t\t|");
		System.out.println("|---------------------------------------|");
		System.out.print("| " + roll + "\t\t");
		System.out.print(fname + " " +lname +"\t\t|");
		System.out.println("\n|---------------------------------------|");
		System.out.println("| Subject    | \t\tMarks\t\t|");
		System.out.println("|------------|--------------------------|");
		System.out.println("| "+ subject[0] + "      |\t\t" + array[0] + "\t\t|");
		System.out.println("| "+ subject[1] + "    |\t\t" + array[1] +"\t\t|");
		System.out.println("| "+ subject[2] + "   |\t\t" + array[2] +"\t\t|");
		System.out.println("|------------|--------------------------|");
		System.out.println("| Total      |\t\t" + sum + "/300\t\t|");
		System.out.println("|------------|--------------------------|");
		System.out.println("| Percentage |\t\t" + percentage + "\t\t|");
		System.out.println("|---------------------------------------|");
	}
	public static void main(String args[])
	{
		Scanner input_roll = new Scanner(System.in);
		Scanner input_fname = new Scanner(System.in);
		Scanner input_lname = new Scanner(System.in);
		Scanner input_array = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Marksheet");
		
		int roll;
		String fname,lname;
		String subject[]={"Maths","Science","Computer"};
		//int array[];
		
		System.out.println("Enter your Roll no.: ");
		roll = input_roll.nextInt();
		System.out.println("Enter your First Name :");
		fname = input_fname.nextLine();
		System.out.println("Enter your Last Name :");
		lname = input_lname.nextLine();
		
		int array[] = new int[3];
		for(int i=0;i<subject.length;i++)
		{
			System.out.println("enter Marks of " + subject[i] +":");
			array[i] = input_array.nextInt();
		}
		
		marksheet m = new marksheet();
		m.display(roll,fname,lname,subject,array);
 	}
}