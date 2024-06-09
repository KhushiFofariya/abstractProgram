package abstractProgram;

abstract public class Account {
	protected double balance;
	public Account(double b)
	{
		this.balance=b;
	}
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	public abstract double getBalance();
	
	public void printBalance()
	{
		System.out.println("Current Balance:"+this.balance);
	}
	
}
