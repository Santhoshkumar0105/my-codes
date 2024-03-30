package Basics;
@FunctionalInterface
interface boy
{
	void add(int a,int b);
}
class girl
{
	int sum(int a) 
	{
		System.out.println("it is not currect");
		return 0;
	}
	void display(int a)
	{
		System.out.println("it is also not currect");
	}
    int chat(int a,int b) {
		System.out.println("it is currect");
		return a+b;
		}
}

public class Functiointer {
      public static void main(String[] args) {
    	  girl g = new girl(); 
    	 boy a =g::chat;
    	 a.add(20, 30);
		
	}
}
