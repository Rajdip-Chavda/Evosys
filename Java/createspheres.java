class createspheres
{
	public static void main(String args[])
	{
		System.out.println("number of object spheres="+sphere.getCount());
		
		sphere ball=new sphere(4.0,0.0,0.0,0.0);
		System.out.println("number of object ball="+ball.getCount());
		
		sphere globe=new sphere(12.0,1.0,1.0,1.0);
		System.out.println("number of object globe="+sphere.getCount());
		
		System.out.println("ball volume="+ball.volume());
		System.out.println("globe volume="+globe.volume());
	}
}