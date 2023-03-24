public class FinalMain {

	public static void main(String[] args) {
		BankAccount w = new BankAccount("Weak",.05);
		StrongBankAccount s = new StrongBankAccount("Strong",.05);
		try {
			w.deposit(1000);
			s.strongDeposit(1000);
			w.applyMonthlyInterest();
			s.applyMonthlyInterest();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			w.withdraw(1500);
			s.strongWithdraw(1500);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			w.deposit(-1000);
			s.strongDeposit(-1000);
			w.applyMonthlyInterest();
			s.applyMonthlyInterest();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(w);
		System.out.println("Weak has a balance of " + w.getBalance());
		System.out.println(s);
	}

}