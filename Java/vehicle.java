class vehicle
{
	private int passenges;
	private int fuelcap;
	private int mpg;
	
	vehicle(int p,int f,int m)
	{
		passengers=p;
		fuelcap=f;
		mpg=m;
	}
	int range()
	{
		return mpg*fuelcap;
	}
	double fuelneeded(int miles)
	{
		return mpg;
	}
	int getpassengers()
	{
		return passengers;
	}
	void setpassengers(int p)
	{
		
	}
	int getFuelcap()
	{	
	
	
	}
} 