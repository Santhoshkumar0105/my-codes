package santy;

import java.util.Scanner;

 public class Admin{
	private int m1;
	private int m2;
	private int m3;
	private int total=0;
	public void setMark(int m1,int m2,int m3){
	this.m1=m1;
	this.m2=m2;
	this.m3=m3;
	}
	public int gettotal(){
		total=m1+m2+m3;
	return total;
	}
	public  String result(){
		if(total>250)
			return "pass the exam";
		else
			return "fail in exam";
	}
	}
	class Student{
	public static void main(String arg[]){
	System.out.println("welcome student");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the name");
	String name=sc.next();
	System.out.println("enter the id");
	int id=sc.nextInt();
	System.out.println("enter u r mark");
	int t=sc.nextInt();
	int e=sc.nextInt();
	int m=sc.nextInt();
	Admin ob=new Admin();
	ob.setMark(t,e,m);
	System.out.println(ob.gettotal());
	System.out.println(ob.result());
	}

	
	}

