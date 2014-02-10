// ****************************************************************
//   ManageAccounts.java
//   Author: Jennifer Soh  ID: JS542
//   Compiler Used: JGrasp
//   Create and manage a bank account. Uses the Account class.       
// ****************************************************************
import java.util.Scanner;

public class ManageAccounts
{
    public static void main(String[] args)
    {
      Scanner scan = new Scanner(System.in); 
	   Account acct1;
      
      System.out.println("Please enter your first and last name: ");
      String name = scan.nextLine();
      
      System.out.println("Please enter a 6 digit account number: ");
      long acctNum = scan.nextLong();
      
      System.out.println("Please enter your initial balance: ");
      double initBalance = scan.nextDouble();
      
      //create account1
   	acct1 = new Account(initBalance, name, acctNum);
      
   	//print summary for account
      System.out.println("Your Current Account Summary: ");      
   	System.out.println(acct1.summary());
   	
      // Make a withdraw
      System.out.println("Amount to Withdraw from Your Account (Enter 0 if none): ");
      double debit = scan.nextDouble();
   	acct1.withdraw(debit);

      //print new balance using getBalance())
   	System.out.printf("New Account Balance after Deposit: $%.2f \n", + acct1.getBalance());

      // Make a deposit
      System.out.println("Amount to deposit to your account (enter 0 if none): ");
      double credit = scan.nextDouble();
   	acct1.deposit(credit);
      
   	//print new balance using getBalance())
   	System.out.printf("New Account Balance after Deposit: $%.2f \n", acct1.getBalance());

   	//Retrieve account number
   	System.out.println("Retrieve your account number: " + acct1.accountNum());
      
   	//print summary for account
      System.out.println("Your Current Account Summary: ");      
   	System.out.println(acct1.summary());
      
    }
}
