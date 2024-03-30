package jasanth;
class hi{
	synchronized static  void display(int n) {
    for(int i=0;i<5;i++){
	System.out.println(n*i);
}
	}
	}
	class hello extends Thread{
		hi t;
		public hello(hi t) {
			this.t=t;
			}
		public void run() {
			hi.display(2);
		}
			
		}
	class C extends Thread{
		hi t1;
		public C(hi t1) {
			this.t1=t1;
		}
		public void run() {
			hi.display(3);
		}
	}
public class Mainn {

	public static void main(String[] args) {
		hi ob=new hi();
		hello t1=new hello(ob);
		C t2=new C(ob);
		t1.start();
		t2.start();
		

	}

}
