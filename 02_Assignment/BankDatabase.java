import java.util.Scanner;

class Account {
	double balance;
	int accountNumber;

	Account(double balance, int accountNumber) {
		this.balance = balance;
		this.accountNumber = accountNumber;
	}

	void deposit(double amount) {
		balance += amount;
		System.out.println(amount + " added to Account: " + accountNumber);
	}

	void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println(amount + " withdrawn from Account: " + accountNumber);
		} else {
			System.out.println("Insufficient funds in Account: " + accountNumber);
		}
	}

	void checkBalance() {
		System.out.println("Account number: " + accountNumber);
		System.out.println("Balance: " + balance);
	}
}

class SavingsAccount extends Account {

	SavingsAccount(double balance, int accountNumber) {
		super(balance, accountNumber);
	}

}

public class BankDatabase {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter initial balance: ");
		double initialBalance = scanner.nextDouble();
		System.out.print("Enter account number: ");
		int accountNumber = scanner.nextInt();

		SavingsAccount account = new SavingsAccount(initialBalance, accountNumber);
		account.checkBalance();

		while (true) {
			System.out.println("\nChoose an option: ");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			int choice = scanner.nextInt();

			switch (choice) {
				case 1:
					System.out.print("Enter amount to deposit: ");
					double depositAmount = scanner.nextDouble();
					account.deposit(depositAmount);
					break;
				case 2:
					System.out.print("Enter amount to withdraw: ");
					double withdrawAmount = scanner.nextDouble();
					account.withdraw(withdrawAmount);
					break;
				case 3:
					account.checkBalance();
					break;
				case 4:
					System.out.println("Exiting...");
					scanner.close();
					System.exit(0);
					break;
				default:
					System.out.println("Invalid choice. Please choose again.");
			}
		}
	}
}
