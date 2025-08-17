//Bank Management System

import java.util.Scanner;

class Bank_Account {
    private double balance;

    public Bank_Account(double initial_Balance) {
        this.balance = initial_Balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Your new balance is: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Your new balance is: $" + balance);
            return true;
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
            return false;
        } else {
            System.out.println("Invalid withdrawal amount.");
            return false;
        }
    }
}

class ATM {
    private Bank_Account account;

    public ATM(Bank_Account account) {
        this.account = account;
    }

    public void display_Menu() {
        System.out.println("Welcome to the ATM!");
        System.out.println("\nPlease choose an option from the following choices :");
        System.out.println("1. Check your Balance");
        System.out.println("2. Deposit an amount");
        System.out.println("3. Withdraw an amount");
        System.out.println("4. Exit");
    }

    public void checkBalance() {
        System.out.println("Your current balance is: $" + account.getBalance());
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
    }
}

public class Bank_Management_System {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank_Account account = new Bank_Account(500.00); // Initial balance set to $500
        ATM atm = new ATM(account);
        boolean exit = false;

        while (!exit) {
            atm.display_Menu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
