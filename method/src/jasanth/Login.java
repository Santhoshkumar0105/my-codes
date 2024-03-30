package jasanth;

abstract class Login {
	void add() {
		System.out.println("hi");
	}
	abstract void sub();
	Login(){
		System.out.println("java");
	}
	abstract class Login1 extends Login{
		void sub() {
			System.out.println("enter the mail");
		}
	}
  class Login2 extends Login1{
		void call() {
		}
			public static void main(String args[]) {
				Login2 ob = new Login2();
				ob.sub();
				ob.call();
				ob.add();
			}
		}
	}
	


