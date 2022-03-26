import java.util.*;
class number1
{
    public static void main(String []s)
    {
        DigitsOpr dig=new DigitsOpr();
        int n;
         
        Scanner sc=new Scanner(System.in);
         
        //read number
        System.out.print("Enter an +ve integer number:");
        n=sc.nextInt();
         
        dig.getNum(n);
        System.out.println("SUM of all digits: " + dig.sumDigits());
        System.out.println("PRODUCT of all digits: " + dig.productDigits());
         
    }
}