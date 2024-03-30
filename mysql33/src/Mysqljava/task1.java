package Mysqljava;

import java.util.Scanner;
import java.util.StringTokenizer;
 

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value="/name=\"santhosh\"/company=\"newgen\"/Experince=\"2years\"";
		Scanner sc = new Scanner(System.in);
	
		 String[] san=value.split("\"");
		for(int i=1;i<=3;i++) {
		System.out.println("enter the details");
		String s= sc.next();
		for(int j=1;j<san.length;j++) {
			if(s.equals("name")) {
				System.out.println(san[1]);
				break;
			}
			else if(s.equals("company")) {
				System.out.println(san[3]);
				break;
			}
			else if(s.equals("experince")) {
				System.out.println(san[5]);
				break;
			}
		}
		}
		System.out.println("name"+" "+"company"+" "+"experince");
	    System.out.println( value);
	}
	}

	
	
	
		
	