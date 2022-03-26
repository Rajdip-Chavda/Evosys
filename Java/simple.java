class simple
{
	public static void main(String args[])
	{
		System.out.println("Simle Program");
	}
}
class TryInitialization 
{
	static int[] values = new int[10]; // Static array member
	// Initialization block
	static 
	{
		System.out.println("Running initialization block.");
		for(int i=0; i<values.length; i++) 
		{
			values[i] = (int)(100.0*Math.random());
		}		
	}	
	// List values in the array for an object
	void listValues() 
	{
		System.out.println(); // Start a new line
		for(int value : values) 
		{
			System.out.print(" "+ value); // Display values
		}
		System.out.println(); // Start a new line
	}
	public static void main(String[] args) 
	{
		TryInitialization example = new TryInitialization();
		System.out.println("\nFirst object:");
		example.listValues();
		example = new TryInitialization();
		System.out.println("\nSecond object:");
		example.listValues();
	}
}

interface back{
    final float pi=3.14f;
    void show (int para);

}

class calldemo implements back{
    int a,b,c;
    calldemo(int x, int y){
        c=x+y;
    }
    public void show(int x){
        System.out.println(pi);
        System.out.println(x);
    }
    void getdata(){
        System.out.println(c);
    }
}

class callback {
    public static void main(String args[]){
        back b1;
        calldemo c1 = new calldemo(25,15);
        b1=c1;
        b1.show(10);
        c1.getdata();
    }
}