package Basics;
@FunctionalInterface
interface Arun
{
	Akash add(int age,String name);
	
}
class Akash{
	   int age;
	   String name;
	  Akash()
	   {
		   System.out.println("cons");
		   
	   }
		   Akash(int age,String name)
		   {
			   this.age=age;
			   this.name=name;
			   System.out.println("age:"+age);
			   System.out.println("name:"+name);
			   System.out.println("it is argument cons");
		   }
		   
}
public class c 
{
        public static void main(String[] args) 
        {
		// TODO Auto-generated method stub
        	Arun a=Akash::new;
        	a.add(3, "santhosh");
        	

	    }

}
