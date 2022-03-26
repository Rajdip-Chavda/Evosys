interface shapeA
{
	public String baseclass1="shapeA";
	public void drow();
}
interface shapeB extends shapeA
{
	public String baseclass2="shapeB";
	public void drow2();
}
class circle implements shapeB
{
	public void drow()
	{
		System.out.println("dorw"+baseclass1);
	}
	public void drow2()
	{
		System.out.println("drow"+baseclass2);
	}
}
class main1
{
	public static void main(String args[])
	{
		shapeB circleshape=new circle();
		circleshape.drow();
		circleshape.drow2();
	}
}