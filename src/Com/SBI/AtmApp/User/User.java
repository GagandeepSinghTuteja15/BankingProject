package Com.SBI.AtmApp.User;
import java.util.Scanner;
import Com.SBI.AtmApp.Account.*;
//pin is 234
public class User implements AccountINS  {
static int bal=2000;
	@Override
	public void withdraw() {
		System.out.println("Enter Money to be Withdraw");
		Scanner sa= new Scanner(System.in);
		int wbal=sa.nextInt();
		if(wbal>bal)
			System.out.println("Insuffient balnace");
		else {
			System.out.println(wbal+" withdraw successfull");
		bal= this.bal-wbal;
		//System.out.println("Current bal is "+bal);
		}
	}
	@Override
	public void deposit() {
		System.out.println("Enter Amount");
		Scanner sa= new Scanner(System.in);
		int amt = sa.nextInt();
		System.out.println("Insert Cash");
		System.out.println("Operation Succesful");
		bal=this.bal+amt;
		//System.out.println("Current bal is "+bal);
	}
	@Override
	public int getBalance() {
		
		return this.bal;
	}
	
	
}
