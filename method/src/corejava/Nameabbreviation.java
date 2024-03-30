package corejava;
import java.util.Scanner;
public class Nameabbreviation {
	 public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);

	       
	        System.out.print("Enter your full name: ");
	        String fullName = sc.nextLine();

	        
	        String[] names = fullName.split(" ");
	        String str = new String ();

	        for (int i = 0; i < names.length; i++) {
	            if (i == names.length - 1) {
	                str+=names[i]; 
	            } else {
	               str+=names[i].charAt(0)+".";
	            }
	        }

	        System.out.println(str);
	
		 

	 }

	}


