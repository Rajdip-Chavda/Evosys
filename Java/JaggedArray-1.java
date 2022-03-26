class JaggedArray
{
	public static void main(String args[])
	{
		//declaring 2D arrays with 2 rows
		int arr[][] = new int[2][];
		
		// Making the above array jagged
		
		//first row has 3 columns
		arr[0] = new int[3];
		
		//second rows has 2 columns
		arr[1] = new int[2];
		
		int count = 0;
		for(int i=0 ; i<arr.length ; i++)
			for(int j=0 ; j<arr[i].length ; j++)
				arr[i][j] = count++;
				
		System.out.println("Contents of 2D jagged Array");
		for(int i=0; i<arr.length ; i++)
		{
			for(int j=0 ; j<arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
				
		System.out.println();
		}
	}
}