package task;
import java.util.Scanner;
class Atm
{
	BankAccount account;
	Atm(BankAccount account)
	{
		this.account=account;
	}
	
	public void userMenu()
	{
		System.out.println("ATM Menu:");
		System.out.println("1.withdraw");
		System.out.println("2.deposit");
		System.out.println("3.check Balance");
		System.out.println("4.Exit");
	}
	Scanner sc=new Scanner(System.in);
	public void start()
	{
		while(true) {
		System.out.println("choose an option:");
		int n=sc.nextInt();
		   if(n==1)
		   {
			System.out.println("Enter the amount:");
			double withdrawAmount =sc.nextInt();
			account.withdraw(withdrawAmount);
			
		   }
		   else if(n==2)
		   {
			System.out.println("Enter the amount:");
			double depositAmount=sc.nextInt();
			account.deposit(depositAmount);
			
		   }
		   else if(n==3)
		   {
			System.out.println("Account Balance is:"+account.getBalance());
		   }
		   else if(n==4)
		   {
			System.out.println("Thanks for using ATM GoodBye!");
			break;
		   }
		   else
		   {
			System.out.println("invalid option Try again");
		   }
		
		}
	sc.close();	
	}	
}
class BankAccount
{
	double Balance;
	BankAccount(double Balance)
	{
		this.Balance=Balance;
	}
	public double getBalance()
	{
		return Balance;
	}
	public void deposit(double amount)
	{
		if(amount>0)
		{
			Balance=Balance+amount;
			System.out.println("Amount successfully deposited");
		}
		else
		{
			System.out.println("invalid amount");
		}
	}
	public void withdraw(double amount)
	{
		if(amount>0 && amount<=Balance)
		{
			Balance=Balance-amount;
			System.out.println("Amount withdraw successfully");
		}
		else if(amount>Balance)
		{
			System.out.println("insufficient balance");
		}
		else
		{
			System.out.println("Invalid Amount");
		}
	}	
}
public class Task3
{
	public static void main(String[] args)
	{
		BankAccount userAccount=new BankAccount(1000.0);
		Atm a=new Atm(userAccount);
		a.userMenu();
		a.start();
	}
}