package santy;

abstract class Login1 {
	void add() {
		System.out.println("hi");
	}
	abstract void call();
	abstract void sub();
	Login1() {
		System.out.println("python");
		
	}
}
	abstract class Login extends Login1{
		void call() {
			System.out.println("enter the mail");
		}
	}
class Logi extends Login{
		void sub() {
	}
		public static void main(String args[]) {
			Logi obj = new Logi();
			obj.add();
			obj.sub();
			obj.call();
			
		}

}

