package Com.SBI.AtmApp.User;

import java.util.Scanner;

import Com.SBI.AtmApp.Account.AccountINS;
import Com.SBI.AtmApp.AtmBack.AtmBack;

public class ATM {
	public static void main(String[] args) 
	{
		AccountINS user= new User();//polymorphism
		AtmBack atm = new AtmBack();
		System.out.println("Enter card");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your pin");
		int upin = sc.nextInt();
		boolean res =atm.setPin(upin);
		if(res)
			atm.disp();
		else {
			System.out.println("Wrong pin");
			System.exit(0);
		}
			atm.option();
		
		
		
		
	}
}
