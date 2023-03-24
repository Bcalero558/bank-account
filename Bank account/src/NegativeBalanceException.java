
public class NegativeBalanceException extends Exception {
	NegativeBalanceException(){
	System.out.println("Transaction would result in a negative balance. Ignored");
	}
	}
