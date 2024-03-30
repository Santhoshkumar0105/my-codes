package jasanth;
import java.util.Scanner;
class Logina{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String Email="santhosh0105@gmail.com";
		String password="*1234567#";
		String InEmail;
        String Inpassword;
		do
		{
			System.out.println("enter the Email id");
		  InEmail=sc.nextLine();
			if(InEmail.equals(Email)&&InEmail.endsWith("gmail.com"))
				{
					System.out.println("enter the password");
					Inpassword=sc.nextLine();
					if(Inpassword.length()&&Inpassword.startsWith("*")&&Inpassword.endsWith("#"))
					{
						System.out.println("login successfully");
					}
					else
					{
						System.out.println("enter the currect password");
					}
				}
				else
				{
					System.out.println("something went worng");
					System.out.println("incorrect Email");
				}
		}
		while(!InEmail.equals(Email));
	}
}
				

	


