package Basics;
@FunctionalInterface
interface pass
{
	int main(int a);
}
class fail
{
	int display() 
	{
		System.out.println("it is normal");
		return 0;
	}
	int method(int a) // static
	 {
		System.out.println("it is static method");
		return 0;
		
	}
	
}

public class lamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fail obj= new fail();
		pass a=obj::method;
		a.main(3);

	}

}
