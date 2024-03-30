package santy;

public class Calculator {// overloading
	void calculator(int a,int b) {
		System.out.println(a+b);
	}
	void calculator(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	void calculator(long g,double c) {
		System.out.println(g+c);
	}
	public static void main(String[] args) {
		Calculator ob =new Calculator();
		ob.calculator(3,6);
		ob.calculator(4,7,9);
		ob.calculator(6353,276.236);
		

	}

}
