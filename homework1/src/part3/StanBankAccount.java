package part3;

public class StanBankAccount extends BankAccount {

	private String firstName, lastName;
	private String address;
	private int accountNo;
	private double balance;
	
	public StanBankAccount(int accountNo) {
		this.accountNo = accountNo;
	}
	
	@Override
	public void insertUserProfile(String firstName, String lastName, String address) {
		// TODO Auto-generated method stub
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		balance += amount;
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		balance -= amount;
	}

	@Override
	public String getUserProfile() {
		// TODO Auto-generated method stub
		String userProfile = "";
		userProfile += firstName + " " + lastName + "\n";
		userProfile += address;
		return userProfile;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
	
	

}
