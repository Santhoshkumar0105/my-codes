package Switch;
import java.util.Scanner;
public class Conditional {
    public static void main(String[] args) {
    	int mark;
    
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the mark");
		mark = sc.nextInt();
		
		if(mark>=90)
		{
			System.out.println("it is A grade");
		}
		 if(mark>=80)
		 
		{
			System.out.println("it is B grade");
		}
		else if (mark>=70)
		{
			System.out.println("its C grade");
		}
		 
		else
		{
			System.out.println("it ia D grade");
		}
		
		
		
    

	}

}
