package Switch;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Usertask{

	static void getinf()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name");
		String name=sc.nextLine();
		System.out.println("enter your email id");
		String email=sc.nextLine();
		System.out.println("enter your mobile number");
		long moblie=sc.nextLong();
		System.out.println("Login successfull");
	}
	public static void main(String ar [])
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			long moblie=sc.nextLong();
			System.out.println("Login successfull");
		}
		catch (InputMismatchException e)
		{
			System.out.println("Incorrect input");
			
		}
		catch (Exception e)
		{
			System.out.println("Incorrect input");
			
		
		}

		}
		
		
		
	}


