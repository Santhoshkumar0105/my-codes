package santy;                //getting 5 values from user array...............
import java.util.Scanner;
public class Arraysa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[]= new int[5];
		for(int i=0;i<a.length;i++) {
			
		System.out.println("enter the"+i+" value");
			a[i]=sc.nextInt();
			
		}
		System.out.println("*****output******");
		for(int b:a) {
			System.out.println(b);
		}

	}
}
	


