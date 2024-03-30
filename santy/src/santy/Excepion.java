package santy;

public class Excepion {

	public static void main(String[] args)
	{
		try
		{
			int arr[] = {1,2,3,4,5,6};
			for(int i=0;i<=5;i++)
			{
		System.out.println(i);
			}
			int c=10/0;
			System.out.println(c);
			String a="";
			System.out.println(a.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception will handle");
		}
		catch(NullPointerException e)
		{
			System.out.println("Nullpoint exception will handle");
	    }
		catch(ArrayIndexOutOfBoundsException e)
		{
	        System.out.println("ArrayindexoutofboundsException");
		}
		finally
		{
			System.out.println("program still executes");
		}
		
	}
}
	

