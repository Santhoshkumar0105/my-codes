package Mysqljava;

public class student extends Thread {
	public void run(){
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		try {
		
		Thread.sleep(2000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	public void second() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1=new student();
		student s2=new student();
		student s3=new student();
		student s4=new student();
		student s5=new student();
	//	s1.start();
		s1.run();
		
		

	}

}
