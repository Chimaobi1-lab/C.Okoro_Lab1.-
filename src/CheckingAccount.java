
public class CheckingAccount extends BankAccount{
		final double FEE = 0.15;
		
		public CheckingAccount(String name, int initialAmount) {
			super(name, initialAmount);
			super.setAccountNumber(getAccountNumber() + "-10");
		}
		
		public boolean withdraw(double amount){
			//add to the amount to withdraw the fee for check clearing
			amount += FEE;
			
			//call the withdraw method from the superclass and return the result
			return super.withdraw(amount);
			
		}
		
		
				
				

		
		
	}