package Basics;
abstract class task2{
	abstract void calculator(int a,int b);
}
class task3 extends task2{
	void calculator(int a,int b) {
		int c=a+b;
		System.out.println("add-"+c);
		
	}
}
	class task4 extends task3{
		void calculator(int a,int b) {
			int c=a-b;
			System.out.println("sub-"+c);
		}
	}
	class task5 extends task4{
		void calculator(int a,int b) {
			int c=a*b;
			System.out.println("mult-"+c);
			super.calculator(5,5);
		
		}
	}
	class task6 extends task5{
		void calculator(int a,int b) {
			int c=a/b;
			System.out.println("div-"+c);
			super.calculator(5,5);
		
		}
	}
class tash1 extends task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tash1 obj = new tash1();
		obj.calculator(5, 5);

	}

}
