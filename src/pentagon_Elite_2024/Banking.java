package pentagon_Elite_2024;

import java.util.Scanner;


class BankAccount {
    private int balance;
//    public void CreateAccount(String customerName, String customerId) {
//        this.balance = 0;
//    }
    
    public BankAccount()
    {
    	this.balance = 0;
    }
    
    public void CreateAccount(String customerName, String Bankname)
    {
    	if (customerName== "")
    	{
    		if(Bankname== "")
    		{
    			System.out.println("Account not created");
    		}}else
    		{
    			System.out.println("Account created successfully");
    		}
    	}
    
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Rs" + amount + " deposited successfully.");
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
        System.out.println("Current balance: Rs" + balance);
    }

    public void withdraw(int amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Rs" + amount + " withdrawn successfully.");
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
        } else {
            System.out.println("Insufficient balance.");
        }
        System.out.println("Current balance: Rs" + balance);
    }

    public void checkBalance() {
        System.out.println("Current balance: Rs" + balance);
    }
}

public class Banking {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount();
     

        int choice;
        do {
        	
        	System.out.println("List of Bank Operations:");
        	
            System.out.println(" 1.CreateAccount:");
            System.out.println(" 2. Deposit");
            System.out.println(" 3. Withdraw");
            System.out.println(" 4. Check Balance");
            System.out.println(" 5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
            
            case 1:
            	
                System.out.print("Enter your customerName: ");
                String customerName = scanner.nextLine();
                scanner.nextLine();
                System.out.print("Enter your Bankname: ");
                String Bankname = scanner.nextLine();
               // scanner.nextLine();
                account.CreateAccount(customerName, Bankname);
                break;
                
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    int depositAmount = scanner.nextInt();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    int withdrawAmount = scanner.nextInt();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    account.checkBalance();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }

        } while (choice != 5);

        scanner.close();
    }
}