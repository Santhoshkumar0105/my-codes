package String;
import java.util.Scanner;
public class InvalidExceptionextendsExcepti {
	InvalidEx(String ex)
	{
		super(ex);
	}
}

class Login 
{
	static String Email= "vino123@gmail.com";
	static String password= "*123456#";
	static String InEmail;
	static String InPassword;
		
	static void log(int a) throws InvalidEx
	{
		do
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your Email id ");
			InEmail =sc.next();
			if(InEmail.equals(Email) && InEmail.contains("@") && InEmail.endsWith("gmail.com"))
			{
				System.out.println("checking Email ");
				System.out.println(" ");
				
			}
			else
			{
				System.out.println("Incorrect Email");
			}
		}
		while(!InEmail.equals(Email));
	}
	static void pw(int b) throws InvalidEx
	{
		do
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your Password ");
			InPassword=sc.next();
			if(InPassword.length()==8 && InPassword.contains("2") && InPassword.endsWith("#") && InPassword.startsWith("*") && InPassword.equals(password))
				{
					System.out.println("Login Successfully Done");
				}
				else
				{
					System.out.println("Incorrect password");
				}
		}
		while(!InPassword.equals(password));
	}
	public static void main(String ar []) throws InvalidEx
	{
		try
		{
			log(1);
			pw(1);
		}
		catch(InputMismatchException e)
		{
			log(2);
			pw(2);
		}
		catch(Exception e)
		{
			System.out.println("Incorrect input");
			log(3);
			pw(3);
		}

}
