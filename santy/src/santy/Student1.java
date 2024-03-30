package santy;

import java.util.Scanner;

public class Student1 {
	private int tamil;
	private int english;
	private int maths;
	private int science;
	private int social;
	Student1(int tamil,int english,int maths,int science,int social)
	{
		this.tamil=tamil;
		this.english=english;
		this.maths=maths;
		this.science=science;
		this.social=social;
		int total=tamil+english+maths+science+social;
		System.out.println("total mark is"+total);
	}
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the 5 subject mark:");
		Student ob =new Student(ob.nextLine(),ob.nextInt(),ob.nextInt(),ob.nextInt(),ob.nextInt());
		
	}

}
