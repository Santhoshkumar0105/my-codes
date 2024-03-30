package String;
import java.util.Scanner;

	class string{
		String Email = "santhosh0105@gmail.com";
		String password;
		void log(){
		System.out.println("login successfully");
		}
		}

		class A{
		public static void main(String args[]){
		string user1 =new string();
		int val=0;
		do{System.out.println("Email id should be return currectely");
			System.out.println("enter the Email id:");
		Scanner scan =new Scanner(System.in);
		String email= scan.nextLine();
		boolean s=email.equals(user1.Email);
		if(s==true){
		val=1;
		System.out.println("password must be atleast 8 characters");
		System.out.println("enter the password:");
		String pass=scan.nextLine();
		if(pass.length()>=8){
		user1.log();
		}
		else{
		val=0;
		System.out.println("enter the password currectily");
		}
		}
		else{
		System.out.println("enter the Email correctily") ;
		}
		}while(val==0);
		}
		}


	


