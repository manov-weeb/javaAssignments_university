import java.util.Scanner;

class Withdraw {
    public void perform(double amount, Account account) {
        if (amount > account.getBalance()) {
            System.out.println("Insufficient funds. Unable to withdraw " + amount);
        } else {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Successfully withdrew: " + amount);
            System.out.println("Remaining balance: " + account.getBalance());
        }
    }
}

class Deposit {
    public void perform(double amount, Account account) {
        account.setBalance(account.getBalance() + amount);
        System.out.println("Successfully deposited: " + amount);
        System.out.println("New balance: " + account.getBalance());
    }
}

class BalanceCheck {
    public void perform(Account account) {
        System.out.println("Current balance: " + account.getBalance());
    }
}

class Account {
    private double balance;

    Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account(1000);

        Withdraw withdraw = new Withdraw();
        Deposit deposit = new Deposit();
        BalanceCheck balanceCheck = new BalanceCheck();

        System.out.println("***** Welcome to Your Banking System *****");

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount you want to withdraw: ");
                    double amountToWithdraw = scanner.nextDouble();
                    withdraw.perform(amountToWithdraw, account);
                    break;

                case 2:
                    System.out.print("Enter the amount you want to deposit: ");
                    double amountToDeposit = scanner.nextDouble();
                    deposit.perform(amountToDeposit, account);
                    break;

                case 3:
                    balanceCheck.perform(account);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
