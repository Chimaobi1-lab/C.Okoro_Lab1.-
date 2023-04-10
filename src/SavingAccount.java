
public class SavingAccount extends BankAccount
{
	
	double rate = 0.025;
	int savingsNumber = 0;
	
	String accountNumber;
	
	public SavingAccount(String name, double initialBalance)
	{
		super(name, initialBalance);
		
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;		
	}
	
	public void postInterest()
	{
		super.setBalance( super.getBalance() * (1 + (rate/12) ) );			
	}
	
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	

	public SavingAccount(SavingAccount s, double initialBalance)
	{

		super(s, initialBalance);
		
		savingsNumber++;
		
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;			
	}
}
