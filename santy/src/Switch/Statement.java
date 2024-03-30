package Switch;
import java.util.Scanner;
class Statement{
	static int bal=10000;
	
	static int wd;
	static int dep;
	static int pin;
	
	public static void main(String args [])
	{
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("Welcome "+name);
		System.out.println("Account balance is " +bal);
		System.out.println("What type of transaction do you need to process ");
		System.out.println(" ");
		System.out.println("1 Withdrawal ");
		System.out.println("2 Deposit ");
		System.out.println("3 Check Balance ");
		System.out.println("4 exit");
		do
		{
			String str=sc.nextLine();
			if(str.equals("1"))
			{
				System.out.println("Enter 4 digit Pin number");
				pin=sc.nextInt();
				System.out.println("Enter withdrawal amount");
				wd=sc.nextInt();
				bal=bal-wd;
				System.out.println("Amount withdrawed is "+" "+wd);
				System.out.println("Account balance is "+bal);
			}
			else if(str.equals("2"))
			{
				System.out.println("Enter 4 digit Pin number");
				pin=sc.nextInt();
				System.out.println("Enter deposit amount");
				dep=sc.nextInt();
				bal=bal+dep;
				System.out.println("Amount withdrawed is "+" "+dep);
				System.out.println("Account balance is "+bal);
			}
			else if(str.equals("3"))
			{
				System.out.println("Enter 4 digit Pin number");
				wd=sc.nextInt();
				System.out.println(bal);
			}
			else if(str.equals("4")){
				wd=sc.nextInt();
				sc.close();
			System.out.println("thank u visit again");
			}
				
		}
		while(bal>0);
			System.out.println("Transaction failed- Enter lower amount");
	}
}
