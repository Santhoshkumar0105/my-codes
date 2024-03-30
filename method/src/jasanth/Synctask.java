package jasanth;
class Calculator{
int total=50;
synchronized void add(int b){
	if(b<=total){
		try{
			wait();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	else{
		System.out.println("process will be continue");
	}
}
synchronized void sub(int o){
	    int r=o+total;
		System.out.println(r);
		notify();
}
}
public class Synctask {
public static void main(String ar[]){
	Calculator ob=new Calculator();
	Thread t1=new Thread(){
		public void run(){
			ob.add(20);
		}
	};
	t1.start();
	Thread t2=new Thread(){
		public void run(){
			ob.sub(20);
		}
	};
	t2.start();
}
}


