package jasanth;//..............inner class.....................
/*class outer
{
	int age=10;
	class inner
	{
		public void show()
		{
			System.out.println("age is ="+ age);
		}
	}
}
public class Innerclassdemo 
{
    public static void main(String[] args) 
    {
		outer obj=new outer();
		outer.inner obj1=obj.new inner();
		obj1.show();
	}
}
*/



//......................nested class "using static keyword".................
class outer
{
	int age=10;
static class inner
	{
		 public void display()
		{
			System.out.println("it is static");
		}
	}
}
public class Innerclassdemo
{
	public static void main(String args[])
	{
		//outer obj=new outer();
		outer.inner obj1=new outer.inner();
		obj1.display();
	}
}







