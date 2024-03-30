package String;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception {
	public static void main(String args []){
		
		boolean s=false;
		do
		{
			try
			{
     
			Scanner sc = new Scanner(System.in);
             System.out.println("Enter the 1st number");
			int a=sc.nextInt();
			System.out.println("Enter the 2nd number");
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
			   s=false;
		}
			catch(ArithmeticException e){
				System.out.println("not divisible by zero");
				s=true;
			}
			catch(InputMismatchException e){
				
				System.out.println("Enter valid integer");
				s=true;
			}
		}
		while(s==true);
	}

}		
		
		
	

	


