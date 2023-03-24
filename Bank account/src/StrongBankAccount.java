import java.text.NumberFormat;
public class StrongBankAccount extends BankAccount {

	
	public StrongBankAccount(String name, double rate) {
		super(name, rate);
		super.setName(name);
		super.setBalance(0) ;
		super.setRate(rate);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		
		return this.getName() + " has a balance of " + this.getBalance();
	}
	
	public void strongDeposit(double amt) throws NegativeAmountException {
		double deposit = amt;
		if(amt < 0) {
		new NegativeAmountException();
}
else
		balance+=amt;
	}
		
	public void strongWithdraw(double amt) throws NegativeAmountException, NegativeBalanceException {
	if (amt < 0){
		new NegativeAmountException();
	}
		else if(balance-amt < 0) {
		new NegativeBalanceException();
		}
		else
		balance-=amt;
	}
		
}