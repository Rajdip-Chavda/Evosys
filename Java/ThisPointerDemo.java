//demonstration of this pointer
//java can have more than one class

class Point3D
{
	double x;
	double y;
	double z;
	
	Point3D(double x,double y,double z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
	}
}

class ThisPointerDemo
{
	public static void main(String args[])
	{
	Point3D p = new Point3D(2.3,1.1,5.6);
	
	System.out.println("x is : " + p.x);
	System.out.println("y is : " + p.y);
	System.out.println("z is : " + p.z);
	}
}