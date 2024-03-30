package Switch;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean s=false;
		do {
			try {
				System.out.println("enter the 1st number");
				int a=sc.nextInt();
				System.out.println("enter the 2nd number");
				int b=sc.nextInt();
				int c=a/b;
				System.out.println(c);
				s=true;
			}
			catch(ArithmeticException e)
			{
				System.out.println("not devided by zero");
				//=false;
			}
			catch(InputMismatchException e)
			{
				System.out.println("enter the 1st value");
				//s=false;
			}
			
			}
		while(s==false);
		}
				

	}


