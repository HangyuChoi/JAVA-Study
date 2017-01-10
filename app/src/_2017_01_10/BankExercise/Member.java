package _2017_01_10.BankExercise;

public class Member {
	private String Id;
	private String Name;
	private String Password;
	private long Balance;
	private int Rank;
	
	public Member(String id, String name, String password, long balance, int rank) {
		this.Id = id;
		this.Name = name;
		this.Password = password;
		this.Balance = balance;
		this.Rank = rank;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public long getBalance() {
		return Balance;
	}

	public void setBalance(long balance) {
		Balance = balance;
	}
	public void addBalance(long balance) {
		Balance += balance;
	}
	public void withdrawBalance(long balance) {
		if(Rank == 1){
			if(Balance < (balance+500)){
				System.out.println("잔액이 부족합니다.");
				System.out.println("현재 "+ Name + "님의 잔액은 " + Balance + "원 입니다.");
			} else {
				Balance -= (balance+500);
				System.out.println("출금이 완료되었습니다.");
				System.out.println("현재 "+ Name + "님의 잔액은 " + Balance + "원 입니다.");
			}
		} else {
			if(Balance < (balance+300)){
				System.out.println("잔액이 부족합니다.");
				System.out.println("현재 "+ Name + "님의 잔액은 " + Balance + "원 입니다.");
			} else {
				Balance -= (balance+300);
				System.out.println("출금이 완료되었습니다.");
				System.out.println("현재 "+ Name + "님의 잔액은 " + Balance + "원 입니다.");
			}
		}
	}
	public int getRank() {
		return Rank;
	}
	public void setRank(int rank) {
		Rank = rank;
	}

}
