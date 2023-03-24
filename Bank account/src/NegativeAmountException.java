
public class NegativeAmountException extends Exception {
	NegativeAmountException(){
	System.out.println("Transaction using a negative amount. Ignored");
	}
}
