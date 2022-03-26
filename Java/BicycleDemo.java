class Bicycle	
{
	public int cadence=0;
	 int speed=0;
	 int gear=1;
	
	void changeCadence(int newValue)
	{
		cadence = newValue;
	}
	
	void changeGear(int newValue)
	{
		gear = newValue;
	}
	
	void speedUp(int increment)
	{
		speed = speed+increment;
	}
	
	void applyBrakes(int decrement)
	{
				speed = speed-decrement;

	}
	
	void printStates()
	{
		System.out.println("cadance : " + cadence + "speed : " + speed + "gear : " + gear);
	}
}

class BicycleDemo
{
	public static void main(String args[])
	{
		Bicycle bike1= new Bicycle();
		Bicycle bike2 = new Bicycle();
		
		bike1.changeCadence(50);
		bike1.speedUp(10);
		bike1.changeGear(2);
		bike1.printStates();
		
		bike2.changeCadence(50);
		bike2.speedUp(10);
		bike2.changeGear(2);
		bike2.changeCadence(40);
		bike2.changeGear(3);
		bike2.printStates();
	}
}