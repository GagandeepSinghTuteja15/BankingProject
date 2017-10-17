package Com.SBI.AtmApp.User;

import java.util.Scanner;

import Com.SBI.AtmApp.AtmBack.AtmBack;

public class ATM {
	public static void main(String[] args) {
		AtmBack atm = new AtmBack();
		System.out.println("Enter card");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your pin");
		int upin = scanner.nextInt();
		boolean res = atm.setPin(upin);
		if (res)
			atm.disp();
		else {
			System.err.println("Wrong pin");
			System.exit(0);
		}
		atm.option();

	}
}
