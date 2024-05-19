package part3;

public class StanBankAccountDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StanBankAccount account = new StanBankAccount(1);
		account.insertUserProfile("Danny", "Kim", "Stan State University");
		account.deposit(10000);
		account.withdraw(1000);
		System.out.println(account.getUserProfile());
		System.out.println(account.getBalance());
		
		//Now testing with my data
		StanBankAccount myaccount = new StanBankAccount(1320);
		myaccount.insertUserProfile("Nick", "S.", "One University Circle, Turlock");
		myaccount.deposit(5000);
		myaccount.withdraw(2430);
		System.out.println(myaccount.getUserProfile());
		System.out.println(myaccount.getBalance());
	}

}
