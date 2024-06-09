package abstractProgram;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount sa = new SavingAccount(1000.00);
		CurrentAccount ca = new CurrentAccount(5000.00);
		
		sa.deposit(200);
		sa.withdraw(150);
		sa.applyInterest();
		sa.printBalance();
		
		ca.deposit(300);
		ca.withdraw(1000);
		ca.printBalance();
	}

}
