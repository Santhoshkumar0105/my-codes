package santy;                 
                               //,,,,,,,,,,,,,,,,,,string palindrome,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
public class Palindrome {

	public static void main(String[] args) {
		String s="randnar";
		String s1="";
		char a;
		for(int i=0;i<s.length();i++) {
			a=s.charAt(i);
			s1=a+s1;
		}
		if(s.equals(s1)) {
			System.out.println(s+" this is palindrom");
			
		}
		else
		{
			System.out.println(s+" this is not palindrom");
		}
		
		

	}

}
