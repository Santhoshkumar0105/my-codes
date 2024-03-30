package Switch;
class B extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("hi"+i);
		}
	}
	}

public class load {
	public static void main(String[] args) {
		B t1=new B();
		B t2=new B();
		B t3=new B();
		t1.start();
		t2.start();
		t3.start();
		}
}
