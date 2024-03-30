package Mysqljava;


public class threadtask extends Thread {
	
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadtask t1 = new threadtask();
		threadtask t2 = new threadtask();
		threadtask t3 = new threadtask();
		threadtask t4 = new threadtask();
		threadtask t5 = new threadtask();
		
//		t1.start();
//		t2.start();
//		t3.start();       ///////thread    fast --> 11111;22222;33333;44444;55555
//		t4.start();
//		t5.start();
		    
	    	t1.run();
		    t2.run();
		    t3.run();      ///////process    slow  -->12345;12345;12345;12345;12345
		    t4.run();
		    t5.run();
		}
}
//public class threadtask implements Runnable{
//
//	@Override
//	public void run() {
//		try {
//		for(int i=1;i<=5;i++) { 
//			System.out.println(i);
//			Thread.sleep(1000);
//		}
//	}
//		catch(Exception e) {
//			System.out.println(e);
//		}
//		
//	}
//	public static void main(String[] args) {
//		threadtask t1 = new threadtask();
//		threadtask t2 = new threadtask();
//		threadtask t3 = new threadtask();
//		threadtask t4 = new threadtask();
//		threadtask t5 = new threadtask();
//		
//		Thread s1 = new Thread(t1);
//		Thread s2 = new Thread(t2);
//		Thread s3 = new Thread(t3);
//		Thread s4 = new Thread(t4);
//		Thread s5 = new Thread(t5);
//		
//		
//		s1.start();
//	    s2.start();
//     	s3.start();    //////////thread  --> 11111;22222;33333;44444;55555
//	    s4.start();
//	    s5.start();
//		
//	//	s1.run();
//	//	s2.run();
//	//	s3.run();      ///////process   -->12345;12345;12345;12345;12345
//	//	s4.run();
//	//	s5.run();
//		
//		
//	}
//}	
