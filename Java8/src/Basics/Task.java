package Basics;
import java.util.*;
public class Task {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		System.out.println("enter the operator");
		char b=sc.next().charAt(0);
		System.out.println("enter the number");
		int c=sc.nextInt();
		try {
			if(b=='+') {
				System.out.println(a+b);
		
			}
			if(b=='-') {
				System.out.println(a-b);
			}
			if(b=='*') {
				System.out.println(a*b);
			}
			if(b=='/') {
				System.out.println(a/b);
			}
		}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
		
				
			
	}

}
