package Basics;
@FunctionalInterface
interface buy
{
	online sum(int age,String name,int salary);
}
class online
{
	int age;
	String name;
	int salary;
	online()
	{
		System.out.println("its cons");
	}
	online(int age,String name,int salary){
		this.age=age;
		this.name=name;
		this.salary=salary;
		System.out.println("no's      "+" cons");
		System.out.println("age:       "   +age);
		System.out.println("name:      "  +name);
		System.out.println("salary:    "+salary);
		System.out.println();
		System.out.println("it is also cons");
	}
	
}
class cons
{
	public static void main(String args[])
	{
		buy a=online::new;
		a.sum(24,"santhosh",15750);
	}
}

