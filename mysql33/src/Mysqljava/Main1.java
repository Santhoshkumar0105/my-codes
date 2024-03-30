package Mysqljava;

class sharedclass{
	public  synchronized void share(int a) {
		try {
			for(int i=1;i<=3;i++) {
				System.out.println(i + a);
				Thread.sleep(2000);
			}
		}
			catch(Exception e) {
				System.out.println(e);
			}
		
		}
	}
class threadclass1 extends Thread{
	sharedclass ab;

	@Override
	public void run() {
		// TODO Auto-generated method stub
//	sharedclass.share(1);
	ab.share(1);
	}
	
}
class threadclass2 extends Thread{
    sharedclass ac;
	@Override
	public void run() {
		// TODO Auto-generated method stub
	//	sharedclass.share(1);
		ac.share(1);
	}
	
}

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sharedclass sc = new sharedclass();
		threadclass1 t1=new threadclass1();
		threadclass1 t2=new threadclass1();
		
		threadclass2 t3=new threadclass2();
		threadclass2 t4=new threadclass2();
	
		t1.start();
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		t2.start();
		t3.start();
		t4.start();

	}

}
