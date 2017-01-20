package _2017_01_20;

public class BalanceInsufficientException extends Exception {
// throw new Exception("BalanceInsufficientException");
	public BalanceInsufficientException() {
	}
	public BalanceInsufficientException(String message) {
		super(message);
	}
}
