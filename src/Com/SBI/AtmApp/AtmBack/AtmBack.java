package Com.SBI.AtmApp.AtmBack;

import java.util.Scanner;

import Com.SBI.AtmApp.Account.AccountINS;
import Com.SBI.AtmApp.User.User;

public class AtmBack {
	private String userName;
	private int pin;

	public boolean setPin(int pin) {
		this.pin = pin;
		return getVerify();
	}

	public String setUnName(String UName) {

		this.userName = UName;
		return UName;
	}

	public boolean getVerify() {
		int vpin = 234;

		if (vpin == pin) {
			setUnName("Gagandeep");
			return true;
		} else {
			return false;
		}

	}

	public void option() {
		System.out.println(
				" Enter 1 for Withdraw \n Enter 2 for deposit \n Enter 3 for Balance Request \n Enter 4 to exit");
		Scanner scanner = new Scanner(System.in);
		int key = scanner.nextInt();
		AccountINS user = new User();
		if (key == 1) {
			user.withdraw();
			option();
		} else if (key == 2) {
			user.deposit();
			option();
		} else if (key == 3) {
			int res = user.getBalance();
			System.out.println("Current balnce is " + res + "rs");
			option();
		} else {
			System.out.println("Thank you for Banking");
			System.exit(0);
		}

	}

	public void disp() {
		System.out.println("Welcome Gagandeep");
	}
}
