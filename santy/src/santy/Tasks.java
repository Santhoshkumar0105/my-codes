package santy;
import java.util.Scanner;
public class Tasks{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Emil="san0105@gmail.com";
		String password="*12345#";
		String InEmail;
		String Inpassword;
		do
		{
			System.out.println("enter the Email id");
			InEmail=sc.nextLine();
			if(InEmail.equals("Email")&&InEmail.startsWith("s")&&InEmail.endsWith("gmail.com"))
			{
				System.out.println("enter the password");
				Inpassword=sc.nextLine();
				if(Inpassword.length()==8 && Inpassword.startsWith("8")&&Inpassword.endsWith("3"))
				{
					System.out.println("login successfully donr");
				}
				else
				{
					System.out.println("enter currect password");
				}
			
			else
			{
				System.out.println("some thing went worng");
				System.out.println("Incurrect Email");
			}
			
		
	}
	

		
	
			
		
				

	


