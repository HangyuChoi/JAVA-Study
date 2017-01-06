package _2017_01_06.BankSystem;

public class Account {

	private String Ano;
	private String Owner;
	private long Balance;
	
	public Account(String Ano, String Owner, long Balance) {
		this.Ano = Ano;
		this.Owner = Owner;
		this.Balance = Balance;
	}
	
	public String getAno() {
		return Ano;
	}

	public void setAno(String ano) {
		this.Ano = ano;
	}

	public String getOwner() {
		return Owner;
	}

	public void setOwner(String owner) {
		this.Owner = owner;
	}

	public long getBalance() {
		return Balance;
	}

	public void setBalance(long balance) {
		this.Balance = balance;
	}

	public static void main(String[] args) {
	}

}
