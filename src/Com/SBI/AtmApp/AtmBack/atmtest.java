package Com.SBI.AtmApp.AtmBack;



import Com.SBI.AtmApp.Account.AccountINS;
import Com.SBI.AtmApp.User.User;






p
	
	public String setUnName(String UName)
	{
		
		this.userName=UName;
		return UName;
	}
	public boolean getVerify()
	{
		int vpin =234;
		
		if(vpin==pin)
		{
		setUnName("Gagandeep");
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public void option(){
		System.out.println("Press 1 for Withdraw or 2 for deposit or 3 for Balance Request or 4 to exit");
		Scanner sc = new Scanner(System.in);
		int key= sc.nextInt();
		AccountINS user = new User();
		if(key==1) {
			user.withdraw();
		option();
		}
		else if(key==2) {
			user.deposit();
			option();
		}
		else if(key==3)
		{
			int res=user.getBalance();
			System.out.println("Current balnce is "+res+"rs");
		     option();
		}
		else {
			System.out.println("Thank you for Banking");
			System.exit(0);
		}
		
	}
	public void disp()
	{
		System.out.println("Welcome Gagandeep");
	}
}
