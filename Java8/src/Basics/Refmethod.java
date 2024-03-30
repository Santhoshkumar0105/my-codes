package Basics;

import java.util.function.BiPredicate;

@FunctionalInterface
interface naveen
{
	int add(int a);
}
class delli
{
	int sum(int a)
	{
     System.out.println("it is normal method");
     return 0;
	}
	int display() 
	{
		System.out.println("it is static method");
		return 0;
		  
	}
	
}
public class Refmethod
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		delli obj = new delli();
		naveen s=obj::sum;
		s.add(3);
	}

}



