import java.util.*;
class arr
{
	public static void main(String args[])
	{
		//int matrixa[][]={{1,2,3},{4,5,6},{7,8,9}};
		//int matrixb[][]={{11,22,33},{44,55,66},{77,88,99}};
		
		int matrixa[][]= new int[3][3];
		int matrixb[][]= new int[3][3];
		
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print("enter value of matrix a [" + i + "] [" + j + "] = ");
				matrixa[i][j]=sc.nextInt();
			}			
		}	
		System.out.println();
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print("enter value of matrix b [" + i + "] [" + j + "] = ");
				matrixb[i][j]=sc.nextInt();
			}			
		}		
		System.out.println("matrix-a");
		for(int i[]:matrixa)
		{		
			for(int j: i)
			{
				System.out.print("  " + j);
			}
			System.out.println();
		}
		System.out.println("matrix-b");
		for(int i[]:matrixb)
		{		
			for(int j: i)
			{
				System.out.print("  " + j);
			}
			System.out.println();
		}
		System.out.println("matrix-addition");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				int add= matrixa[i][j] + matrixb[i][j];
				System.out.print("  " + add);
			}
			System.out.println();
		}
	}
}