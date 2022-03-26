import java.util.*;
 
class DigitsOpr
{
    private int num;
     
    //function to get value of num
    public void getNum(int x)
    {
        num=x;
    }/*End of getNum()*/
     
    //function to calculate product of all digits
    public int productDigits()
    {
        int n,pro;
        n=num;  //keep value of num safe
        pro=1;
        while(n>0)
        {
            pro *=(n%10); //find digit using n=n%10 
            n/=10;
        }
        return pro;
    }//End of productDigits()
}