package Basics;
@FunctionalInterface
interface MathOperation{
	int value(int a,int b);
	
}

public class Calculator {

	public static void main(String[] args) {
		MathOperation add= (a,b)->a+b;
		System.out.println("addition--"+add.value(5,5));
		MathOperation sub=(a,b)->a-b;
		System.out.println("subractiob--"+sub.value(5,5));
		MathOperation multi=(a,b)->a*b;
		System.out.println("Multiple--"+multi.value(5,5));
		MathOperation div=(a,b)->a/b;
		System.out.println("divition--"+div.value(5,5));
		

	}



}
