class stringarray
{
	public static void main(String args[])
	{
		String str[]={"this","is","a","test"};
		
		System.out.println("original array: ");
		for(String s:str)
			System.out.println(s+" ");
		System.out.println("\n");
		
		str[1]="was";
		str[2]="test , tool";
		
		System.out.println("modify array :");
		for(String s:str)
			System.out.println(s+" ");
		
	}
}