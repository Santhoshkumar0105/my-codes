package Basics;
@FunctionalInterface
interface A{
	int add();
	
}
class B{
	int method() {
		System.out.println("it is normal method");
		return 0;
		
		
	}
	static int method(int a,int b) {
		System.out.println("it is static method");
		return 0;
	}

}

public class Wait {

	public static void main(String[] args) {
		B obj=new B();
		A a=obj::method;
		a.add();
		
		
	}

}
