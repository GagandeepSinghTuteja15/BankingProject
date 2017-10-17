package Com.SBI.AtmApp.User;
import java.util.Scanner;
import Com.SBI.AtmApp.Account.*;
//pin is 234
public class User implements AccountINS  {
static int balance=2000;
Scanner scanner= new Scanner(System.in);
	@Override
	public void withdraw() {
		System.out.println("Enter Money to be Withdraw");
		int withdrawBalancel=scanner.nextInt();
		if(withdrawBalancel>balance)
			System.err.println("Insuffient balnace\n****************\n");
		else {
			System.out.println(withdrawBalancel+" withdraw successfull \n *****************\n");
		balance= User.balance-withdrawBalancel;
		}
	}

	@Override
	public void deposit() {
		System.out.println("Enter Amount");
		
		
		int amt = scanner.nextInt();
		System.out.println("Insert Cash");
		System.out.println("Operation Succesful\n******************\n");
		balance=User.balance+amt;
	}
	@Override
	public int getBalance() {
		
		return balance;
	}
	
	
}
