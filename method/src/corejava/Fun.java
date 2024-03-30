package corejava;
@FunctionalInterface
interface you{
	int sum(int a,int b);
}

public class Fun {

	public static void main(String[] args) {
		you h=(a,b)->a+b;
		System.out.println(h.sum(50, 40));
		Runnable r=()->{System.out.println("run method");};
		Thread t = new Thread(r);
		t.start();
		//you y=()->System.out.println("functionalinterface");
		
	}

}
