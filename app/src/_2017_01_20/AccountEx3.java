package _2017_01_20;

public class AccountEx3 {
	public long balance;
	
	public AccountEx3() {}
	
	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
	}

	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance < money) {
			throw new BalanceInsufficientException("잔액부족:"+(money-balance)+" 모자람");		
		}
		balance -= money;
	}
}
