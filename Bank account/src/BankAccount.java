public class BankAccount {
	public BankAccount(String name, double rate) {
		acctName = name;
		balance = 0;
		intRate = rate;
	}
	public String getName() 
	{
		return acctName;
		}
	public double getBalance() 
	{
		return balance;
		}
	public double getRate() 
	{
		return intRate;
		}
	protected void setName(String name) 
	{
		acctName = name;
		}
	protected void setBalance(double n) 
	{
		balance = n;
		}
	protected void setRate(double f) 
	{
		intRate = f;
		}
	
	public void deposit(double amt) 
	{
		balance += amt;
		}
	public void withdraw(double amt) 
	{
		balance -= amt;
		}
	public void applyMonthlyInterest() 
	{
		deposit(balance*intRate/12);
		}
	
	protected String acctName;
	protected double balance;
	protected double intRate;

}