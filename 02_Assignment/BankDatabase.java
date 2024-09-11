class Account{
	double balance;
	int accountNumber;

	Account(double balance, int accountNumber){
		this.balance = balance;
		this.accountNumber = accountNumber;

	}

	void deposit(double amount){
		balance += amount;
		System.out.println(amount + " added to Account: " + accountNumber);
		

	}

	void withdraw(double amount){
		if(amount <= balance){

			balance -= amount;
			System.out.println(amount + " withdrawn from Account: " + accountNumber);
		}
		
	}

	void checkBalance(){
		System.out.println( " Account number: " + accountNumber );
		System.out.println( " Balance: " + balance);
	}
	
}






public class BankDatabase {
	public static void main(String args[]){
		
		Account a1 = new Account(50000, 0001);
		a1.checkBalance();
		a1.withdraw(2000);
		a1.checkBalance();
		a1.deposit(10000);
		a1.checkBalance();
		
		
	}

}