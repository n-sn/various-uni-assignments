package part3;

public abstract class BankAccount {

	public abstract void insertUserProfile(String firstName, String lastName, String address);
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	public abstract String getUserProfile();
	public abstract double getBalance();
	
}
