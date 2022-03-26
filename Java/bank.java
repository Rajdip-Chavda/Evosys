class Account
{
	public int balance;
	public int accountNo;
	void displayBalance()
	{
		System.out.println(" Accouunt Number "+ accountNo + " Balance "+ balance);
	}

	synchronized void deposit(int amount)
	{
		balance=balance+amount;
		System.out.println(amount+ " is deposited ");
		displayBalance();
	}
	synchronized void withdraw(int amount)
	{
		balance=balance-amount;
		System.out.println(amount+ " is withdrawn ");
		displayBalance();
	}
}
class TransactionDeposit implements Runnable
{
	int amount;
	Account accountX;
	TransactionDeposit(Account x,int amount)
	{
		accountX=x;
		this.amount=amount;
		new Thread(this).start();	
	}
	public void run()
	{
		accountX.deposit(amount);
	}
}
class TransactionWithdraw implements Runnable
{
	int amount;
	Account accountY;
	TransactionWithdraw(Account y,int amount)
	{
		accountY=y;
		this.amount=amount;
		new Thread(this).start();	
	}
	public void run()
	{
		accountY.deposit(amount);
	}
}
class SynchronizedDemo
{
	public static void main(String[] args) {
		Account Abc=new Account();
		Abc.balance=1000;
		Abc.accountNo=111;
		TransactionDeposit t1;
		TransactionWithdraw t2;
		t1=new TransactionDeposit(Abc,500);
		t2=new TransactionWithdraw(Abc,900);
	}
}
