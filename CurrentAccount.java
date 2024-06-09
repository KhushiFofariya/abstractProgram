package abstractProgram;

public  class CurrentAccount extends Account {
	private final double overdraft_limit =  500.00;
	public CurrentAccount(double b) {
		super(b);
		// TODO Auto-generated constructor stub
	}
	public void deposit(double amt)
	
	{
		if(amt > 0)
		{
	
		balance += amt;
		System.out.println("Deposited + " +amt+" to savings Accont");
	}
	else
	{
		System.out.println("Deposit amount must be positive");
	}
	}
	public void withdraw(double amt)
	{
		if(amt > 0 && amt<=balance + overdraft_limit)
		{
			balance -= amt;
			System.out.println("Withdraw  " +amt+" from Saving Account");
		}
		else
		{
			System.out.println("Invalid withdraw amount");
		}
	}
	public double getBalace()
	{
		return balance;
	}
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
