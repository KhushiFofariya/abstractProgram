package abstractProgram;

 class SavingAccount extends Account {
	private final double rate = 0.05;
	public SavingAccount(double b) {
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
		if(amt > 0 && amt<=balance)
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
	//for apply interest	
	public void applyInterest() {
        double interest = balance * rate;
        balance += interest;
        System.out.println("Applied interest of " + interest + " to Savings Account");
    }
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}
}
