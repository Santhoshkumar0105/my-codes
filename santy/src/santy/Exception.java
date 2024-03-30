package santy;
import java.util.Scanner;
import java.lang.reflect.Array;

public class Exception {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);	 
		
		do
		{
			System.out.println("enter the 1st number");
           int a=sc.nextInt();
			System.out.println("enter the 2nd number");
			int b=sc.nextInt();
        try 
		{
		 int c=a/b;
		 System.out.println(c);
		}
		 catch(ArithmeticException e)
		{
			 System.out.println("Exception will handle");
		}
		}
		while(b==0);
		}
		
}		
		
		
			
		
	
	
	

		    
		

		

		
				
		
	


	


